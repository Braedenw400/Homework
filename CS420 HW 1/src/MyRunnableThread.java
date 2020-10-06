
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
 * Class to implement Runnable threads
 */
public class MyRunnableThread implements Runnable{
    public double count = 0;
    public int inc, sleepTime;
    public MyRunnableThread(int inc, int sleepTime)
    {
        this.inc = inc;
        this.sleepTime = sleepTime;
    }
    @Override
    public void run()
    {
        Thread thd = Thread.currentThread();
        while (count < 4000)
        {
            try {
                Thread.sleep(sleepTime);
                count += inc;
                System.out.println(thd.getName() + count);
            } catch (InterruptedException ex) {
            }
        }
    }
}
