package com.dr.mutiplethreads.DeadLock;

public class ThreadB implements Runnable {
    private ObjectA A;
    private ObjectB B;

    public ThreadB(ObjectA a, ObjectB b) {
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
        synchronized (B) {
            Thread.sleep(100);
            synchronized (A) {
                Thread.sleep(100);
                System.out.println("B");
            }
        }
    }
}
