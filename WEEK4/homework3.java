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
        System.out.println("lütfen bir x değeri giriniz");
        int x = input.nextInt();
        int fonksiyon =x*x-5*x+3;
        if(fonksiyon<0){
            System.out.println("fonksiyon negatiftir");
        }
        else if(fonksiyon>0){
            System.out.println("fomksiyon pozitiftir");
        }
        else if(fonksiyon==0){
            System.out.println("ne negatif ne pozitiftir");
        }
    }
    
}
