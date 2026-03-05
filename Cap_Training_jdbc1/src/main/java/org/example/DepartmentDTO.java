
package org.example;

public class DepartmentDTO {
    private Long id;
    private String deptName;
    private String location;
    private int employeeCount;

    public DepartmentDTO() {
    }

    public DepartmentDTO(Long id, String deptName, String location, int employeeCount) {
        this.id = id;
        this.deptName = deptName;
        this.location = location;
        this.employeeCount = employeeCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    @Override
    public String toString() {
        return String.format("DepartmentDTO{id=%d, deptName='%s', location='%s', employees=%d}",
                id, deptName, location, employeeCount);
    }
}

