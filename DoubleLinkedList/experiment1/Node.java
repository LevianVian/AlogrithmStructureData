package DoubleLinkedList.experiment1;

public class Node {
    Student data;
    Node prev;
    Node next;

    Node() {
    }

    Node(Student data) {
        this.data = data;
        prev = null;
        next = null;
    }

    Node(Node prev, Student data, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
