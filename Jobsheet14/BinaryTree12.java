package Jobsheet14;

public class BinaryTree12 {
    Node12 root;

    public BinaryTree12() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Student12 data) {
        if (isEmpty()) {
            root = new Node12(data);
        } else {
            Node12 current = root;
            while (true) {
                if (data.ipk < current.data.ipk) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node12(data);
                        break;
                    }
                } else if (data.ipk > current.data.ipk) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node12(data);
                        break;
                    }
                } else {
                    break; 
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node12 current = root;
        while (current != null) {
            if (current.data.ipk == ipk) {
                result = true;
                break;
            } else if (ipk < current.data.ipk) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    public void traversePreOrder(Node12 node) {
        if (node != null) {
            node.data.print();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node12 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.print();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node12 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.data.print();
        }
    }

    Node12 getSuccessor(Node12 del) {
        Node12 successor = del.right;
        Node12 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }

        Node12 parent = root;
        Node12 current = root;
        boolean isLeftChild = false;

        while (current.data.ipk != ipk) {
            parent = current;
            if (ipk < current.data.ipk) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                System.out.println("Couldn't find data!");
                return;
            }
        }

        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null; 
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {
            Node12 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }

    // Assignment 1 addRekursif
    public void addRekursif(Student12 data) {
        root = addRekursif(root, data);
    }

    private Node12 addRekursif(Node12 current, Student12 data) {
        if (current == null) {
            return new Node12(data);
        }

        if (data.ipk < current.data.ipk) {
            current.left = addRekursif(current.left, data);
        } else if (data.ipk > current.data.ipk) {
            current.right = addRekursif(current.right, data);
        } else {
            return current;
        }
        return current;
    }

    // Assignment 2 getMinIPK
    public void getMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree is empty.");
            return;
        }
        Node12 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.print("Minimum IPK data: ");
        current.data.print();
    }

    // Assignment 2 getMaxIPK
    public void getMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree is empty.");
            return;
        }
        Node12 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.print("Maximum IPK data: ");
        current.data.print();
    }

    // Assignment 3 displayStudentsWithIPKAbove
    public void displayStudentsWithIPKAbove(double threshold) {
        System.out.println("Students with IPK above " + threshold + ":");
        displayStudentsWithIPKAbove(root, threshold);
    }

    private void displayStudentsWithIPKAbove(Node12 node, double threshold) {
        if (node != null) {
            // Traversal buat print dari paling rendah ke paling tinggi
            displayStudentsWithIPKAbove(node.left, threshold);
            
            if (node.data.ipk > threshold) {
                node.data.print();
            }
            
            displayStudentsWithIPKAbove(node.right, threshold);
        }
    }
}