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
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen s sayısını giriniz");
        double s = input.nextDouble();
        for(int i=0; i<=s; i++){
            for(int j=0; j<=s; j++){
               if(s==5*i+3*j){
                   System.out.println(i);
                   System.out.println(j);
                       
                   
                
            } 
            }
        }
    }
    
}
