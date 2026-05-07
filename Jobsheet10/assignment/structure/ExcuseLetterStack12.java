package Jobsheet10.assignment.structure;

import Jobsheet10.assignment.model.ExcuseLetter12;

public class ExcuseLetterStack12 {
    private ExcuseLetter12[] stack;
    private int size;
    private int top;

    public ExcuseLetterStack12(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new ExcuseLetter12[size];
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(ExcuseLetter12 letter) {
        if (!isFull()) {
            top++;
            stack[top] = letter;
        } else {
            System.out.println("Stack is full! Cannot add more excuse letters.");
        }
    }

    public ExcuseLetter12 pop() {
        if (!isEmpty()) {
            ExcuseLetter12 letter = stack[top];
            top--;
            return letter;
        } else {
            System.out.println("No excuse letters to process.");
            return null;
        }
    }

    public ExcuseLetter12 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("No excuse letters in the stack.");
            return null;
        }
    }

    public void search(String name) {
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].getName().equalsIgnoreCase(name)) {
                System.out.printf("Letter Found -> Name: %s, ID: %s, Type: %c, Duration: %d days.\n", 
                        stack[i].getName(), stack[i].getId(), stack[i].getTypeOfExcuse(), stack[i].getDuration());
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("No excuse letter found for student: " + name);
        }
    }
}
