package org.evgenysav.module13.task13;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayList_________________________________________________________________________________________________");
        evaluateTaskUsingCustomLists(new ArrayList<>());
        System.out.println("LinkedList________________________________________________________________________________________________");
        evaluateTaskUsingCustomLists(new LinkedList<>());
    }

    private static void evaluateTaskUsingCustomLists(List<Integer> list) {
        long before = System.currentTimeMillis();
        System.out.println("Answer: " + TaskFromJoseph.getLastFromCircle(1_000_000, 2, list));
        System.out.println("Time consumed: " + (System.currentTimeMillis() - before));
    }
}
