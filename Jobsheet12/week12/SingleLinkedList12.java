package Jobsheet12.week12;

public class SingleLinkedList12 {
    Node12 head;
    Node12 tail;

    boolean isEmpty() {
        return head == null;
    }

    void print(){
        if (!isEmpty()){
            Node12 tmp = head;
            System.out.println("LinkedList Data: ");
            while (tmp!=null){
                tmp.data.print();
                tmp = tmp.next;
            }
        } else {
            System.out.println("LinkedList is empty");
        }
    }

    void addFirst(Student12 std){
        Node12 newNode = new Node12(std, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(Student12 std){
        Node12 newNode = new Node12(std, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertAfter(Student12 std, String key){
        Node12 newNode = new Node12(std, null);
        Node12 tmp = head;
        do{
            if (tmp.data.name.equalsIgnoreCase(key)){
                newNode.next = tmp.next;
                tmp.next = newNode;
                if (newNode.next == null){
                    tail = newNode;
                }
                break;
            }
            tmp = tmp.next;
        } while (tmp != null);
    }

    public void insertAt (int index, Student12 std){
        if (index < 0) {
            System.out.println("Wrong index");
        } else if (index == 0){
            addFirst(std);
        } else {
            Node12 temp = head;
            for (int i = 0; i < index -1; i++){
                temp = temp.next;
                temp.next = new Node12(std, temp.next);
                if (temp.next.next == null){
                    tail = temp.next;
                }
            }
        }
    }

    // Experiment 2
    // Step 2 Get data with specific index
    Student12 getData(int idx) {
        if(isEmpty()) {
            System.out.println("LinkedList is empty!!");
            return null;
        }
        Node12 tmp = head;
        for(int i = 0; i < idx; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    // Step 3 Get the index of a specific student by name
    int indexOf(String key) {
        if(isEmpty()){
            System.out.println("LinkedList is empty!!");
            return -1;
        }
        Node12 tmp = head;
        int idx = 0;
        while(tmp != null && !tmp.data.name.equalsIgnoreCase(key)){
            tmp = tmp.next;
            idx++;
        }
        if(tmp == null) {
            return -1;
        } else {
            return idx;
        }
    }

    // Step 4 Remove the first element
    void removeFirst(){
        if(isEmpty()){
            System.out.println("LinkedList is empty!!");
        } else if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    // Step 5 Remove the last element
    void removeLast(){
        if(isEmpty()){
            System.out.println("LinkedList is empty!!");
        } else if(head == tail){
            head = tail = null;
        } else {
            Node12 tmp = head;
            while(tmp.next != tail){
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    // Step 6 Remove a specific element by name
    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
        } else {
            Node12 temp = head;
            while (temp != null) {
                if ((temp.data.name.equalsIgnoreCase(key)) && (temp == head)) {
                    removeFirst();
                    break;
                } else if (temp.next != null && temp.next.data.name.equalsIgnoreCase(key)) { // Added temp.next != null for safety
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    // Step 7 Remove an element at a specific index
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node12 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
