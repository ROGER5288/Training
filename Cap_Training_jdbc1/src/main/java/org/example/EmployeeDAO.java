
package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public EmployeeDAO() {
        this.emf = Persistence.createEntityManagerFactory("taskPu");
        this.em = emf.createEntityManager();
    }

    // CREATE - Insert new employee
    public EmployeeDTO create(Employee employee) {
        try {
            em.getTransaction().begin();
            em.persist(employee);
            em.getTransaction().commit();
            return convertToDTO(employee);
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("Error creating employee: " + e.getMessage());
            return null;
        }
    }

    // READ - Get employee by ID
    public EmployeeDTO read(Long id) {
        try {
            Employee emp = em.find(Employee.class, id);
            if (emp != null) {
                return convertToDTO(emp);
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error reading employee: " + e.getMessage());
            return null;
        }
    }

    // READ ALL - Get all employees
    public List<EmployeeDTO> findAll() {
        try {
            return em.createQuery("SELECT e FROM Employee e", Employee.class)
                    .getResultList()
                    .stream()
                    .map(this::convertToDTO)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error finding all employees: " + e.getMessage());
            return List.of();
        }
    }

    // UPDATE - Update employee details
    public EmployeeDTO update(Long id, String name, String email, Double salaryAmount, String currency) {
        try {
            Employee emp = em.find(Employee.class, id);
            if (emp != null) {
                em.getTransaction().begin();
                emp.setName(name);
                emp.setEmail(email);
                emp.setSalaryAmount(salaryAmount);
                emp.setCurrency(currency);
                em.merge(emp);
                em.getTransaction().commit();
                return convertToDTO(emp);
            }
            return null;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("Error updating employee: " + e.getMessage());
            return null;
        }
    }

    // DELETE - Delete employee by ID
    public boolean delete(Long id) {
        try {
            Employee emp = em.find(Employee.class, id);
            if (emp != null) {
                em.getTransaction().begin();
                em.remove(emp);
                em.getTransaction().commit();
                return true;
            }
            return false;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("Error deleting employee: " + e.getMessage());
            return false;
        }
    }

    // Helper method - Convert Employee to EmployeeDTO
    private EmployeeDTO convertToDTO(Employee emp) {
        String deptName = emp.getDepartment() != null ? emp.getDepartment().getDeptName() : "N/A";
        return new EmployeeDTO(
                emp.getId(),
                emp.getName(),
                emp.getEmail(),
                deptName,
                emp.getSalaryAmount(),
                emp.getCurrency()
        );
    }

    // CLOSE - Close EntityManager and EntityManagerFactory
    public void close() {
        if (em != null && em.isOpen()) {
            em.close();
        }
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}

