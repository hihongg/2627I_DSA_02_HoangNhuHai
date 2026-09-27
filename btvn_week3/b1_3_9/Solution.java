package btvn_week3.b1_3_9;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<String> stack1 = new Stack<>(); // chứa các con số và cụm biểu thức
        Stack<String> stack2 = new Stack<>(); // chứa các phép toán +, -, *, /

        String line = scanner.nextLine().trim();

        // Tách các ký tự/con số cách nhau bằng khoảng trắng
        String[] tokens = line.split("\\s+");

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                stack2.push(token);
            } else if (token.equals(")")) {
                String op = stack2.pop();
                String val2 = stack1.pop();
                String val1 = stack1.pop();

                String subExpr = "( " + val1 + " " + op + " " + val2 + " )";

                stack1.push(subExpr);
            } else {
                stack1.push(token);
            }
        }

        System.out.println(stack1.pop());
        scanner.close();
    }
}