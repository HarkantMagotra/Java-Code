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
    }
}
