package Jobsheet5;

public class TopStudents12 {
    Student12[] listStudents;
    int idx;

    public TopStudents12(int size) {
        listStudents = new Student12[size];
        idx = 0;
    }

    public void add(Student12 student) {
        if (idx < listStudents.length) {
            listStudents[idx] = student;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listStudents[i].print();
        }
    }

    // Ini Descending
    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listStudents[j].gpa < listStudents[j + 1].gpa) {
                    Student12 temp = listStudents[j];
                    listStudents[j] = listStudents[j + 1];
                    listStudents[j + 1] = temp;
                }
            }
        }
    }

    // Ini Ascending
    public void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (listStudents[j].gpa < listStudents[minIndex].gpa) {
                    minIndex = j;
                }
            }
            Student12 temp = listStudents[minIndex];
            listStudents[minIndex] = listStudents[i];
            listStudents[i] = temp;
        }
    }

    
    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Student12 temp = listStudents[i];
            int j = i;
            while (j > 0 && listStudents[j - 1].gpa > temp.gpa) {
                listStudents[j] = listStudents[j - 1];
                j--;
            }
            listStudents[j] = temp;
        }
    }
    
    
    public void insertionSortDescending() {
        for (int i = 1; i < idx; i++) {
            Student12 temp = listStudents[i];
            int j = i;
            while (j > 0 && listStudents[j - 1].gpa < temp.gpa) {
                listStudents[j] = listStudents[j - 1];
                j--;
            }
            listStudents[j] = temp;
        }
    }
}