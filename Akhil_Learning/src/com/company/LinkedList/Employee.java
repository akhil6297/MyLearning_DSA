package com.company.LinkedList;

import java.util.Objects;

public class Employee {
    private String firstname;
    private String lastname;
    private String empid;

    public Employee(String firstname, String lastname, String empid) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.empid = empid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", empid='" + empid + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!firstname.equals(employee.firstname)) return false;
        if (!lastname.equals(employee.lastname)) return false;
        return empid.equals(employee.empid);
    }

    @Override
    public int hashCode() {
        int result = firstname.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + empid.hashCode();
        return result;
    }
}

