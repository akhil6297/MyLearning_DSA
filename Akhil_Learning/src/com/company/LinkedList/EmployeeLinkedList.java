package com.company.LinkedList;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;
    public void addToFront(Employee em){
        EmployeeNode empnode= new EmployeeNode(em);
        if(head==null){ tail=empnode;head=empnode;return;}
        head.setPrevious(empnode);
        empnode.setNext(head);
        head=empnode;
        head.setPrevious(null);
        size++;
    }
    public void addToEnd(Employee em){
        EmployeeNode empnode= new EmployeeNode(em);
        if(head==null){
            head=empnode;
            tail=empnode;
            return;
        }
        empnode.setPrevious(tail);
        tail.setNext(empnode);
        tail=empnode;
        tail.setNext(null);
        size++;
    }
    public EmployeeNode removeFromFront(){
        if(head==null){
            return null;
        }
        EmployeeNode en=head;
        if(head.getNext()==null){
            tail=null;
        }
        head=head.getNext();
        en.setNext(null);
        size--;
        return en;
    }
    public EmployeeNode removeFromEnd(){
        if(head==null){
            return null;
        }
        EmployeeNode en=tail;
        if(tail.getPrevious()==null){
            head=null;
        }
        tail=tail.getPrevious();
        tail.setNext(null);
        en.setPrevious(null);
        size--;
        return en;
    }
    public int getSize(){
        return size;
    }
    public void print(){
        EmployeeNode current=head;
        System.out.print("HEAD<=>");
        while(current!=null){
            System.out.print(current);
            System.out.print("<=>");
            current=current.getNext();
        }
        System.out.println("null");
    }

}
