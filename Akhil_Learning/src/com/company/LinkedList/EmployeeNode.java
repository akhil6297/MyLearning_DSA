package com.company.LinkedList;

public class EmployeeNode {
    private Employee emp;
    private EmployeeNode next;
    private EmployeeNode previous;

    public EmployeeNode(Employee employee){
        this.emp = employee;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return emp.toString();
    }
}
