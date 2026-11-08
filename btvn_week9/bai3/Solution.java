package btvn_week9.bai3;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data  = data;
        this.left = null;
        this.right = null;
    }
}

public class Solution {
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            if (data<root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            inOrder(root.left);
            inOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }

        int n = scanner.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            root = insert(root, data);}
            inOrder(root);
    }
}
