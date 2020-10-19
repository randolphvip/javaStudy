package com.java.study.Thread;

public class ThreadPriority {
    public static void main(String[] args) {

        MyThread thread1= new MyThread();
        MyThread thread2= new MyThread();
        MyThread thread3= new MyThread();
        MyThread thread4= new MyThread();
        thread1.setName("Thread-000");
        thread2.setName("Thread-1111");
        thread3.setName("Thread-2222");
        thread4.setName("Thread-3333");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

}
