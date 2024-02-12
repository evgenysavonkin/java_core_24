package org.evgenysav.module6.task7;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExamples {

    public static void example1() {
        long[] l = new long[Integer.MAX_VALUE];
    }

    public static void example2(){
        List<Object> list = new ArrayList<>();
        while (true){
            Object o = new Object();
            list.add(o);
        }
    }

    public static void main(String[] args) {
        example1();
    }
}
