/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Ryan
 */
public class CobaLagiMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ExecutorService executors = Executors.newFixedThreadPool(5);
        
        
        for (int i = 1; i<100; i++ ){
            if (i % 2 == 1){
                
            CobaLagiThread cobalagithread = new CobaLagiThread(" "+i);
            executors.execute(cobalagithread);
            }

        }
        
        
        executors.shutdown();
        
        while(executors.isTerminated()){
    }
    
}
}
