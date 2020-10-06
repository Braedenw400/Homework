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
public class MyMainExtendedThread {
    public static void main(String[] args)
    {
        Thread A = new MyExtendedThread(1, 1);
        A.setName("A");
        Thread B = new MyExtendedThread(1, 1);
        B.setName("B");
        Thread C = new MyExtendedThread(1, 1);
        C.setName("C");
        A.start();
        B.start();
        C.start();
    }
}
