package org.evgenysav.tech_modules.data_structures;

public class TaskFromJoseph {

    private class Node {
        private int[] warriors;
        private Node next;
        private Node prev;

        public Node(int[] warriors) {
            this.warriors = warriors;
        }

        public int[] getWarriors() {
            return warriors;
        }

        public void setWarriors(int[] warriors) {
            this.warriors = warriors;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

    public static int getLastFromCircleA(int n, int d) {
        int[] warriors = new int[n];
        fillArr(warriors);
        boolean flag = true;
        int zeroCounter = 0;
        int dCounter = 0;

        while (flag) {
            for (int i = 0; i < n; i++) {
                if (warriors[i] != 0) {
                    dCounter++;
                }
                if (dCounter == d && warriors[i] != 0) {
                    warriors[i] = 0;
                    dCounter = 0;
                    zeroCounter++;
                }
                if (zeroCounter == n - 1) {
                    flag = false;
                    break;
                }
            }
        }

        return getNonZeroElement(warriors);
    }

    public static int findDValue(int n) {
        int d = 1;
        int[] warriors = new int[n];
        fillArr(warriors);
        while (true) {
            int result = getLastFromCircleA(n, d);
            if (result == 1) {
                return d;
            }

            d++;
        }
    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    private static int getNonZeroElement(int[] arr) {
        for (int i : arr) {
            if (i != 0) {
                return i;
            }
        }
        return -1;
    }
}
