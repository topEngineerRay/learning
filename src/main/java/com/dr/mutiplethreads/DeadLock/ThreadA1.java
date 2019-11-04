package com.dr.mutiplethreads.DeadLock;

public class ThreadA1 extends Thread{
    private ObjectA A;
    private ObjectB B;

    public ThreadA1(ObjectA a, ObjectB b) {
        this.A = a;
        this.B = b;
    }

        public void run() {

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
