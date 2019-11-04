package com.dr.mutiplethreads.DeadLock;

public class ThreadA implements Runnable {

    private ObjectA A;
    private ObjectB B;

    public ThreadA(ObjectA a, ObjectB b) {
        this.A = a;
        this.B = b;
    }

    @Override public void run() {

        try {
            doSomething();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doSomething() throws InterruptedException {
        synchronized (A) {
            Thread.sleep(100);
            synchronized (B) {
                Thread.sleep(100);
                System.out.println("A");
            }
        }
    }
}
