/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Ryan
 */
public class CobaLagiThread implements Runnable {
    String s;
    
    public CobaLagiThread(String s){
        this.s = s;
    }
    
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" memulai : "+s);
        publishMessage();
        System.out.println(Thread.currentThread().getName()+" berakhir");
    }
    
    public void publishMessage(){
        try{
            Thread.sleep(500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
