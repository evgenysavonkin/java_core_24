package org.evgenysav.module12.task12;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketsBalance {
    public static boolean checkBracketsBalance(String input) {
        if (input == null) {
            return false;
        }

        Deque<Character> deque = new ArrayDeque<>();
        char[] charArray = input.toCharArray();
        for (char value : charArray) {
            if (value == '<' || value == '{' || value == '[' || value == '(') {
                deque.push(value);
            } else {
                if (deque.isEmpty()) {
                    return false;
                }
                char c = deque.peek();
                if (value == '>' && c == '<') {
                    deque.pop();
                }
                if (value == '}' && c == '{') {
                    deque.pop();
                }
                if (value == ']' && c == '[') {
                    deque.pop();
                }
                if (value == ')' && c == '(') {
                    deque.pop();
                }
            }
        }

        return deque.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(checkBracketsBalance("()(())"));
    }
}
