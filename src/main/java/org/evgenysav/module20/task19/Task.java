package org.evgenysav.module20.task19;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task {

    static final String THREAD_LAUNCHED_PATTERN = "%s launched";
    static final String THREAD_FINISHED_PATTERN = "%s finished";

    public static void main(String[] args) {
        Runnable runnableTask = () -> {
            printInfoInThread("RunnableTask");
        };

        Callable<Integer> callableTask = () -> {
            printInfoInThread("Callable");
            return 1;
        };

        Thread thread = new Thread(() -> {
            printInfoInThread("Anonim");
        });

        startThreads(runnableTask, callableTask, thread, new MyThread());
    }

    private static void printInfoInThread(String name) {
        try {
            System.out.println();
            Thread.sleep(10);
            System.out.printf(THREAD_LAUNCHED_PATTERN, name);
            System.out.println();
            System.out.printf(THREAD_FINISHED_PATTERN, name);
            System.out.println();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    private static void startThreads(Runnable runnable, Callable<?> callable,
                                     Thread thread, Thread myThread) {
        try (ExecutorService executorService = Executors.newFixedThreadPool(4)) {
            executorService.submit(runnable);
            executorService.submit(callable);
            myThread.setDaemon(true);
            thread.start();
            myThread.start();
        }
    }

    private static class MyThread extends Thread {

        @Override
        public void run() {
            printInfoInThread("MyThread daemon");
        }
    }
}
