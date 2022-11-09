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
public class homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("Lütfen a kenar uzunluğunu girin");
       int a = input.nextInt();
       System.out.println("Lütfen b kenar uzunluğunu girin");
       int b = input.nextInt();
       System.out.println("Lütfen c kenar uzunluğunu girin");
       int c = input.nextInt();
       
       if(a==b & a==c & b==c){
           
       System.out.println("eşkenar üçgen");
           
       }
       else if(a==b || a==c || b==c){
           System.out.println("ikizkenar üçgen");
       }
       else{
       System.out.println("çeşitkenar üçgen");
       
               
    }
    
    }
}


