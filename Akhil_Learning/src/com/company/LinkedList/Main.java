package com.company.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeLinkedList list= new EmployeeLinkedList();
        Employee ak=new Employee("Sai","Akhil","UIUI");
        Employee al= new Employee("Sai","Alekhya","UI");
        Employee sun=new Employee("Suneetha","KOlla","IU");
        list.addToFront(ak);
        list.addToFront(al);
       list.print();
        list.addBefore(sun,ak);
        list.print();
//        EmployeeNode aln= new EmployeeNode(al);
//        System.out.println(aln.getEmp());
    }
}
