package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class E_1114_PrintInOrder {

    private boolean oneDone;
    private boolean twoDone;

    public E_1114_PrintInOrder() {
        oneDone = false;
        twoDone = false;
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        oneDone = true;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while (!oneDone) {
            wait();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        twoDone = true;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while (!twoDone) {
            wait();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

    public static void main(String[] args) throws InterruptedException {
        E_1114_PrintInOrder test = new E_1114_PrintInOrder();

        Runnable printFirst = new Runnable() {
            @Override
            public void run() {
                System.out.print("first");
            }
        };

        Runnable printSecond = new Runnable() {
            @Override
            public void run() {
                System.out.print("second");
            }
        };

        Runnable printThird = new Runnable() {
            @Override
            public void run() {
                System.out.print("third");
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit tasks in random order to simulate unpredictability
        executor.submit(() -> {
            try {
                test.third(printThird);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.submit(() -> {
            try {
                test.first(printFirst);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.submit(() -> {
            try {
                test.second(printSecond);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Shutdown executor after tasks are completed
        executor.shutdown();

//        test.first(printFirst);
//        test.second(printSecond);
//        test.third(printThird);

    }
}


//Suppose we have a class:

//public class Foo {
//    public void first() { print("first"); }
//    public void second() { print("second"); }
//    public void third() { print("third"); }
//}
//The same instance of Foo will be passed to three different threads. Thread A will call first(), thread B will call second(),
// and thread C will call third(). Design a mechanism and modify the program to ensure that second() is executed after first(),
// and third() is executed after second().

//Note:
//We do not know how the threads will be scheduled in the operating system, even though the numbers in the input
// seem to imply the ordering. The input format you see is mainly to ensure our tests' comprehensiveness.