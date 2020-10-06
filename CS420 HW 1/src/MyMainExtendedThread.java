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
 * Class to run extended threads
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
