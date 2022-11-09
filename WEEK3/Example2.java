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
    System.out.println("sayi1");
    int sayi1 = İnput.nextInt();
    System.out.println("sayi2");
    int sayi2 = İnput.nextInt();
    System.out.println("sayi3");
    int sayi3 = İnput.nextInt();
    
    if(sayi1>sayi2&& sayi1>sayi3){
      
      System.out.println(sayi1+"Büyüktür");
    }
    
    
    
    else if(sayi2>sayi1&& sayi2>sayi3){    
      
        System.out.println(sayi2+"Büyüktür");
    }
      
    else if(sayi3>sayi1&& sayi3>sayi2){
      
        System.out.println(sayi3+"Büyüktür");
        
     }
     
    else{
        System.out.println("Büyüklük yoktur");
        
    }
    
    }
}

    

     
    
            
     
             
             
     
     
          
          
     
       
             
             
             
             
            
       
            
    
    
     
     
    
    
    


