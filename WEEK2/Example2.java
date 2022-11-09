/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author casper
 */
import java.util.Scanner;


public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner İnput = new Scanner(System.in);
       System.out.println("Lütfen fahrehait derecesi:");
       double fahrehait = İnput.nextDouble();
       double calcius = (fahrehait - 32) / 1.8;
       System.out.println("calcius derecesi:"+calcius);
       
       
        
    }
    
}
