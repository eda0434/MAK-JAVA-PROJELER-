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
public class homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir s tam sayı giriniz");
        int s = input.nextInt();
        for(int i=1; i<s; i++){
            for (int j=1; j<s; j++){
                if(s==i*i+j*j){
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
    
}
