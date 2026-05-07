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
}
