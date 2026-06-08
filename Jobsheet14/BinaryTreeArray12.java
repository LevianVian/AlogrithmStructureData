package Jobsheet14;

public class BinaryTreeArray12 {
    Student12[] data;
    int idxLast;

    public BinaryTreeArray12() {
        data = new Student12[10];
        idxLast = -1;
    }

    void populateData(Student12[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // Assignment 4 Add data to array-based binary tree
    public void add(Student12 newData) {
        int idx = 0;
        while (true) {
            if (idx >= this.data.length) {
                Student12[] temp = new Student12[this.data.length * 2];
                System.arraycopy(this.data, 0, temp, 0, this.data.length);
                this.data = temp;
            }

            if (this.data[idx] == null) {
                this.data[idx] = newData;
                if (idx > idxLast) {
                    idxLast = idx; // Buat ngeupdate batasan/boundary idxLast
                }
                break;
            } else {
                if (newData.ipk < this.data[idx].ipk) {
                    idx = 2 * idx + 1; // Kiri
                } else if (newData.ipk > this.data[idx].ipk) {
                    idx = 2 * idx + 2; // Kanan
                } else {
                    break;
                }
            }
        }
    }

    // Assignment 4 Pre-order traversal array
    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                data[idxStart].print();               // Process root
                traversePreOrder(2 * idxStart + 1);   // Process kiri
                traversePreOrder(2 * idxStart + 2);   // Process kanan
            }
        }
    }
}