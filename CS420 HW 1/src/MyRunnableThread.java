
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dgb
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
        while (count < 1000)
        {
            try {
                Thread.sleep(sleepTime);
                count += inc;
                System.out.println(thd.getName() + " -- " + count);
            } catch (InterruptedException ex) {
            }
        }
    }
}
