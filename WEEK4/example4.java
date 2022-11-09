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
public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen alt sınır girin");
        int alt_sınır = input.nextInt();
        System.out.println("Lütfen üst sınır girin");
        int üst_sınır = input.nextInt();
        
        for(int i = alt_sınır; i<= üst_sınır; i++){
            if(i%3==0 || i%4==0){
                System.out.println(i);
            }
        }
    }
    
}
