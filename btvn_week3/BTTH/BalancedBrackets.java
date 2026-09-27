package btvn_week3.BTTH;
import java.util.*;

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0;i< s.length();i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else if (ch ==')' || ch == ']' || ch =='}') {
                if (stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        } return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] test1 = {"{[()]}","((())",};

        for (String test : test1) {
            System.out.println(test + ": " + (isBalanced(test) ? "Đúng quy tắc" : "Sai quy tắc"));}
    }
}
