package btvn_week3.BTTH;
import java.util.*;

public class QueueUsingTwoStacks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int i = 0; i < q; i++) {
            int type = scanner.nextInt();

            if (type == 1) {
                int x = scanner.nextInt();
                stack1.push(x);
            } else {
                if (stack2.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                }

                if (type == 2) {
                    stack2.pop();
                } else if (type == 3) {
                    System.out.println(stack2.peek());
                }
            }
        }
    }
}