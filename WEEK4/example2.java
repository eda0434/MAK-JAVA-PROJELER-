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
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("lütfen bir N sayısı girin");
       int N = input.nextInt();
         int s = 1;
         int faktöriyel = 1;
         while(s<=N){
          faktöriyel = faktöriyel*s;
          s=s+1;
         }
         System.out.println("Faktöriyel:"+faktöriyel);
    }
    
}
