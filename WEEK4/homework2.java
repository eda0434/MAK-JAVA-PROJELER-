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
public class homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Lütfen bir N sayısı girin");
       int N = input.nextInt();
       int s = 1;
       int Toplam = 0;
       int tek_toplam = 0;
       int çift_toplam = 0;
       while(s<=N){
           Toplam= Toplam+s;
           if(s%2==0){
               çift_toplam=çift_toplam+s;
           }
           else{
               tek_toplam=tek_toplam+s;
               
           }
           s=s+1;
       }
       System.out.println("Toplam:"+Toplam+ " "+ "çift_toplam:"+çift_toplam +" "+"tek_toplam:"+tek_toplam);
    }
    
}
