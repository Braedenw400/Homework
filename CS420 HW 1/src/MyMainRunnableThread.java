/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dgb
 */
public class MyMainRunnableThread {
    public static void main(String[] args)
    {
        Runnable r1 = new MyRunnableThread(10, 300);
        Runnable r2 = new MyExtendedThread(20, 300);
        Thread t1 = new Thread(r1, "thread-r1");
        Thread t2 = new Thread(r2, "thread-r2");
        t1.start();
        t2.start();
    }
}
