
package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;
import java.util.stream.Collectors;

public class DepartmentDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public DepartmentDAO() {
        this.emf = Persistence.createEntityManagerFactory("taskPu");
        this.em = emf.createEntityManager();
    }

    // CREATE - Insert new department
    public DepartmentDTO create(Department department) {
        try {
            em.getTransaction().begin();
            em.persist(department);
            em.getTransaction().commit();
            return convertToDTO(department);
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("Error creating department: " + e.getMessage());
            return null;
        }
    }

    // READ - Get department by ID
    public DepartmentDTO read(Long id) {
        try {
            Department dept = em.find(Department.class, id);
            if (dept != null) {
                return convertToDTO(dept);
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error reading department: " + e.getMessage());
            return null;
        }
    }

    // READ ALL - Get all departments
    public List<DepartmentDTO> findAll() {
        try {
            return em.createQuery("SELECT d FROM Department d", Department.class)
                    .getResultList()
                    .stream()
                    .map(this::convertToDTO)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error finding all departments: " + e.getMessage());
            return List.of();
        }
    }

    // UPDATE - Update department details
    public DepartmentDTO update(Long id, String deptName, String location) {
        try {
            Department dept = em.find(Department.class, id);
            if (dept != null) {
                em.getTransaction().begin();
                dept.setDeptName(deptName);
                dept.setLocation(location);
                em.merge(dept);
                em.getTransaction().commit();
                return convertToDTO(dept);
            }
            return null;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("Error updating department: " + e.getMessage());
            return null;
        }
    }

    // DELETE - Delete department by ID
    public boolean delete(Long id) {
        try {
            Department dept = em.find(Department.class, id);
            if (dept != null) {
                em.getTransaction().begin();
                em.remove(dept);
                em.getTransaction().commit();
                return true;
            }
            return false;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("Error deleting department: " + e.getMessage());
            return false;
        }
    }

    // Helper method - Convert Department to DepartmentDTO
    private DepartmentDTO convertToDTO(Department dept) {
        return new DepartmentDTO(
                dept.getId(),
                dept.getDeptName(),
                dept.getLocation(),
                dept.getEmployees() != null ? dept.getEmployees().size() : 0
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

