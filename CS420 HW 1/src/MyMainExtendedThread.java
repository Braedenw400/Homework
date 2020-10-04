/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dgb
 */
public class MyMainExtendedThread {
    public static void main(String[] args)
    {
        Thread t1 = new MyExtendedThread(10, 500);
        Thread t2 = new MyExtendedThread(20, 1000);
        t1.start();
        t2.start();
    }
}
