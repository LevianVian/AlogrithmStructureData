package Jobsheet12.week12.assignment;

import Jobsheet12.week12.assignment.node12;

public class studentqueue12 {
    node12 front; 
    node12 rear;  
    int size;

    // Buat check jika queue nya kosong
    public boolean isEmpty() {
        return front == null;
    }

    // Yang ini buat check jika queue penuh (Linked lists)
    public boolean isFull() {
        return false; 
    }

    // Yang ini buat ngebersihin queue nya
    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("The queue has been completely cleared.");
    }

    // Yang ini buat nambahin student ke queue
    public void enqueue(student12 std) {
        node12 newNode = new node12(std, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Success! " + std.name + " has joined the queue.");
    }

    // Yang ini buat manggil student berikutnya dalam queue (Dequeuing dari depan)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty! No students to call.");
        } else {
            student12 calledStudent = front.data;
            front = front.next;
            
            // If the queue becomes empty after calling, reset rear to null as well
            if (front == null) { 
                rear = null;
            }
            size--;
            System.out.println("Calling next student: " + calledStudent.name + " (NIM: " + calledStudent.nim + ")");
        }
    }

    // Yang ini buat menampilkan student pertama (front) di queue nya
    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("--- First Student in Queue ---");
            front.data.print();
        }
    }

    // Yang ini buat menampilkan student terakhir (rear) di queue nya
    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("--- Last Student in Queue ---");
            rear.data.print();
        }
    }

    // Yang ini buat menampilin jumlah total student dan detail nya di queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Total students currently in queue: " + size);
            node12 tmp = front;
            int position = 1;
            while (tmp != null) {
                System.out.print("Position " + position + ": ");
                tmp.data.print();
                tmp = tmp.next;
                position++;
            }
        }
    }
}
