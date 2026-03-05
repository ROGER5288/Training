package org.example;

public class EmployeeDTO {
    private Long id;
    private String name;
    private String email;
    private String departmentName;
    private Double salaryAmount;
    private String currency;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Long id, String name, String email, String departmentName, Double salaryAmount, String currency) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.departmentName = departmentName;
        this.salaryAmount = salaryAmount;
        this.currency = currency;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(Double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return String.format("EmployeeDTO{id=%d, name='%s', email='%s', department='%s', salary=%.2f %s}",
                id, name, email, departmentName, salaryAmount, currency);
    }
}

