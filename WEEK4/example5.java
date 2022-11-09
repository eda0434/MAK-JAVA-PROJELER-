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
public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir N sayısı girin");
        int N =input.nextInt();
        int Toplam = 0;
        while(N>0){
          int kalan= N%10;
          Toplam = Toplam+kalan;
          N=N/10;
              
          }
        System.out.println("Basamaklar toplamı:"+Toplam);
        }
                
    }
    

