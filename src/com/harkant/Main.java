package com.harkant;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(34);
        list.insertFirst(43);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertLast(10);
        list.insert(200, 1);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        list.insertRec(213, 2);
        list.display();

        // DLL list = new DLL();
        // list.insertFirst(1);
        // list.display();
        // list.insertFirst(2);
        // list.display();
        // list.insertLast(3);
        // list.insertLast(5);
        // list.display();
        // list.insertAfterVal(5, 6);
        // list.display();

        // CircularLL list = new CircularLL();

        // list.insert(1);
        // list.insert(2);
        // list.insert(3);
        // list.insert(4);
        // list.display();
        // list.delete(3);
        // list.display();
    }
}
