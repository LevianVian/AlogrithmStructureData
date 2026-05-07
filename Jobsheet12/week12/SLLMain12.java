package Jobsheet12.week12;

public class SLLMain12 {
        public static void main(String[] args) {
        SingleLinkedList12 sll = new SingleLinkedList12();
        Student12 std1 = new Student12("001", "Student 1", "TI-1I", 3.89);
        Student12 std2 = new Student12("002", "Student 2", "TI-1I", 3.45);
        Student12 std3 = new Student12("003", "Student 3", "TI-1I", 3.20);
        Student12 std4 = new Student12("004", "Student 4", "TI-1I", 3.00);

        sll.print();
        sll.addFirst(std4);
        sll.print();
        sll.addLast(std1);
        sll.print();
        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);
        sll.print();

    }
}