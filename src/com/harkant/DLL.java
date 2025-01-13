package com.harkant;

public class DLL {

    Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        node.next = null;
        Node last = head;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.val == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfterVal(int after, int val) {
        Node p = find(after);
        if (p == null) {
            System.out.println("doesnot exist");
            return;
        }
        Node node = new Node(val);
        node.prev = p;
        node.next = p.next;
        p.next = node;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public void display() {
        Node node = head;
        Node last = null;
        System.out.print("START" + "->");
        while (node != null) {
            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.print("END" + "->");
        while (last != null) {
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

}
