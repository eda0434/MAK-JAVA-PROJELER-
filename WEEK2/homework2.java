/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*

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
        Scanner İnput = new Scanner (System.in);
        System.out.println("kürenin yarı çapını girin");
        int r = İnput.nextInt();
        System.out.println("pi'nin değerini girin");
        double  π = İnput.nextDouble();
        double alan = 4*π*r*r;
        double hacim = 4*π*r*r*r/3;
        System.out.println("alan bulma işlemi:"+alan);
        System.out.println("hacim bulma işlemi"+hacim);
        
        
        
       
       
    }
    
}
