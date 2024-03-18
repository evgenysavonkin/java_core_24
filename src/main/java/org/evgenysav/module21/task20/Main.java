package org.evgenysav.module21.task20;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            System.out.println(MySingleton.getInstance().toString());
        };

        List<Thread> threads = Stream.generate(() -> new Thread(task))
                .limit(3)
                .peek(Thread::start)
                .toList();

        for (Thread t : threads){
            t.join();
        }

    }
}
