/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dgb
 * edited for Homework 1 by Braeden Wilson
 */
public class MyMainRunnableThread {
    public static void main(String[] args)
    {
        Runnable r1 = new MyRunnableThread(1, 1);
        Runnable r2 = new MyExtendedThread(1, 1);
        Runnable r3 = new MyExtendedThread(1, 1);
        Thread t1 = new Thread(r1, "A");
        Thread t2 = new Thread(r2, "B");
        Thread t3 = new Thread(r3, "C");
        t1.start();
        t2.start();
        t3.start();
    }
}
