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
public class homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("lütfen bir sayi giriniz");
       int sayi = input.nextInt();
       if(sayi<0){
           System.out.println(sayi+"negatif sayıdır");
       }
       else if(sayi>0){
           System.out.println(sayi+"pozitif sayıdır");
           
       }
       else if (sayi==0){
           System.out.println(sayi+ " 'a eşittir");
           
       }
    }
    
}

