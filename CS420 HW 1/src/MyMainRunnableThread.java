/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Submitted by: Braeden Wilson
 * Homework Number: 1
 * Credit to: Dr. David Bethelmy
 * Submitted on: 10/6/20
 * By submitting this program with my name,
 * I affirm that the creation and modification 
 * of this program is primarily my own work. 
 * 
 * Class to run Runnable threads
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
