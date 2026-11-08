package btvn_week9.bai4;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Solution {

    public static Node lca(Node root, int v1, int v2) {
        if (root == null) return null;

        if (root.data> v1 && root.data> v2) {
            return lca(root.left, v1, v2);
        }

        if (root.data< v1 && root.data< v2) {
            return lca(root.right, v1, v2);
        }

        return root;
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data<=root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        if (scan.hasNextInt()) {
            int t = scan.nextInt();
            Node root = null;
            for (int i= 0; i< t;i++) {
                int data = scan.nextInt();
                root = insert(root, data);
            }
            int v1 = scan.nextInt();
            int v2 = scan.nextInt();

            Node ans = lca(root, v1, v2);
            System.out.println(ans.data);
        }
    }
}