package Jobsheet11.assignment;

public class KRSQueue {
    Student[] data;
    int front, rear, size, max;
    int dpaCapacity = 30;
    int completedCount = 0;

    public KRSQueue(int n) {
        max = n;
        data = new Student[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("The queue has been cleared.");
        } else {
            System.out.println("Queue is already empty!");
        }
    }

    void enqueue(Student dt) {
        if (isFull()) {
            System.out.println("Queue is full! Maximum queue size (10) reached.");
            return;
        }
        if (completedCount + size >= dpaCapacity) {
             System.out.println("Cannot enqueue. The DPA limit of 30 total students has been reached.");
             return;
        }
        
        rear = (rear + 1) % max;
        data[rear] = dt;
        size++;
        System.out.println(dt.name + " has successfully joined the queue.");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No students to process.");
            return;
        }

        System.out.println("\n--- Processing KRS Approval ---");
        int processedThisSession = 0;
        
        while (processedThisSession < 2 && !isEmpty()) {
            if (completedCount >= dpaCapacity) {
                System.out.println("Notice: DPA has reached the maximum capacity of 30 approvals.");
                break;
            }
            
            Student dt = data[front];
            front = (front + 1) % max;
            size--;
            completedCount++;
            processedThisSession++;
            
            System.out.print("Approved: ");
            dt.print();
        }
        System.out.println("-------------------------------");
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }
        System.out.println("\n--- Current Queue ---");
        int i = front;
        while (i != rear) {
            data[i].print();
            i = (i + 1) % max;
        }
        data[i].print();
        System.out.println("---------------------");
    }

    void peekTwo() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }
        System.out.println("\nFirst two students in line:");
        data[front].print();
        if (size > 1) {
            data[(front + 1) % max].print();
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.println("\nLast student in the queue:");
            data[rear].print();
        } else {
            System.out.println("Queue is empty!!!");
        }
    }

    void printStats() {
        System.out.println("\n=== KRS Approval Statistics ===");
        System.out.println("Total students currently in queue: " + size);
        System.out.println("Students who completed KRS approval: " + completedCount);
        System.out.println("Students who have NOT yet completed approval: " + size);
        System.out.println("Remaining DPA Capacity: " + (dpaCapacity - completedCount));
        System.out.println("===============================");
    }
}