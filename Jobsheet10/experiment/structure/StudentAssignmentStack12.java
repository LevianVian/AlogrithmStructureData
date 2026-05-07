package Jobsheet10.experiment.structure;

import Jobsheet10.experiment.model.Student12;

public class StudentAssignmentStack12 {
    private Student12[] stack;
    private int size;
    private int top;

    public StudentAssignmentStack12(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new Student12[size];
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int getCount() {
        return top + 1;
    }

    public void push(Student12 std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!!");
        }
    }

    public Student12 pop() {
        if (!isEmpty()) {
            Student12 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    public Student12 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    public Student12 peekFirst() {
        return isEmpty() ? null : stack[0]; 
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].getNim() + "\t" + stack[i].getName() + "\t" + stack[i].getClassName());
        }
        System.out.println("");
    }

    public String convertToBinary(int grade) {
        ConversionStack12 binStack = new ConversionStack12();
        
        while (grade > 0) {
            int mod = grade % 2;
            binStack.push(mod);
            grade = grade / 2;
        }
        
        String binary = "";
        while (!binStack.isEmpty()) {
            binary += binStack.pop();
        }
        
        return binary;
    }
}