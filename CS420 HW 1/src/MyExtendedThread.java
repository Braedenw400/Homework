
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
public class MyExtendedThread extends Thread{
    public double count = 0;
    public int inc, sleepTime;
    public MyExtendedThread(int inc, int sleepTime)
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
