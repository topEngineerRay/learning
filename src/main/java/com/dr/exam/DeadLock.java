package com.dr.exam;

class TestLock implements Runnable
{
   /* public static Object lock1 = new Object();
    public static Object lock2 = new Object();*/

    private boolean flag; //flag标签，让t1和t2线程执行不同代码

    public TestLock(boolean flag)
    {
        this.flag=flag;
    }

    public void run()
    {
        if (flag)
        {
            synchronized(MyLock.lock1)
            {
                System.out.println("if1");

                synchronized(MyLock.lock2)
                {
                    System.out.println("if2");
                }
            }
        }
        else
        {
            synchronized(MyLock.lock2)
            {
                System.out.println("else2");

                synchronized(MyLock.lock1)
                {
                    System.out.println("else1");
                }
            }
        }

    }


}


class MyLock  //两个锁，用来制造死锁
{
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();
}


class DeadLock
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new TestLock(true)); //t1先用锁1再用锁2
        Thread t2 = new Thread(new TestLock(false));//t2先用锁2再用锁1

        t1.start();
        t2.start();

    }
}