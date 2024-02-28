package org.evgenysav.module13.task13;

import java.util.List;

public class TaskFromJoseph {

    public static int findDValue(int n, List<Integer> list) {
        int d = 1;
        fillListWithNumbers(list, n);
        while (true) {
            int result = getLastFromCircle(n, d, list);
            if (result == 1) {
                return d;
            }

            d++;
        }
    }

    public static int getLastFromCircle(int n, int d, List<Integer> list) {
        fillListWithNumbers(list, n);
        boolean flag = true;
        int zeroCounter = 0;
        int dCounter = 0;
        while (flag) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) != 0) {
                    dCounter++;
                }
                if (dCounter == d && list.get(i) != 0) {
                    list.set(i, 0);
                    dCounter = 0;
                    zeroCounter++;
                }
                if (zeroCounter == n - 1) {
                    flag = false;
                    break;
                }
            }
        }

        return getNonZeroElement(list);
    }


    private static void fillListWithNumbers(List<Integer> list, int n) {
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
    }

    private static int getNonZeroElement(List<Integer> list) {
        for (int i : list) {
            if (i != 0) {
                return i;
            }
        }

        return -1;
    }
}
