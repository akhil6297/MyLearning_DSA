package com.company.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeLinkedList list= new EmployeeLinkedList();
        list.addToFront(new Employee("Sai","Akhil","UIUI"));
        list.addToFront(new Employee("Sai","Alekhya","UI"));
        list.print();
        list.removeFromFront();
        list.addToEnd(new Employee("Ram","Bab","IUIU"));
        list.print();
        list.removeFromEnd();
        list.print();
    }
}
