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
public class homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("lütfen n girin");
      int n = input.nextInt();
      int t =0;
      int s=0;
      
      while(s<=n){
          if(s%2!=0){
              t=t+s;
               
               
          }
         s=s+1;
         
          
           
      }
      
     System.out.println("n ye kadar olan tek sayıların toplamı:"+t);
        
      
    }
    
}
