package DoubleLinkedList.experiment1;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();
        
        dll.addFirst(new Student("111", "Anton", "TI-1I", 3.57));
        dll.print();
        
        dll.addLast(new Student("112", "Prabowo", "TI-1I", 3.7));
        dll.print();
        
        dll.addFirst(new Student("113", "Herco", "TI-1I", 3.89));
        dll.print();
        
        dll.insertAfter("111", new Student("114", "Rizki", "TI-1I", 3.8));
        dll.print();
        
        dll.insertAfter("112", new Student("115", "Hanzel", "TI-1I", 3.6));
        dll.print();
        
        dll.insertAfter("120", new Student("116", "Eiyu", "TI-1I", 3.4));
        dll.print();
    }
}
