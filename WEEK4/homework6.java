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
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int s = input.nextInt();
        while(s>0){
            System.out.println(s%10);
            s/=10;
        }
        System.out.println("Girdiğiniz sayının tersi:");
    }
    
}
