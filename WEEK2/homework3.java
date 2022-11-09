
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Adım 1:Başla
Adım 2:
 *
 * @author casper
 */
import java.util.Scanner;

public class homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner İnput = new Scanner (System.in);
        System.out.println("maddenin kütlesini girin");
        int m =İnput.nextInt();
        System.out.println("maddenin hızını girin");
        int V = İnput.nextInt();
        System.out.println("maddenin yerden yüksekliğini girin");
        int h = İnput.nextInt();
        System.out.println("g'nin değerini girin");
        double g = İnput.nextDouble();
        double potansiyelenerji = m*g*h;
        double kinetikenerji = (m*V*V)/2;
        System.out.println("potansiyelenerji bulma işlemi:"+potansiyelenerji);
        System.out.println("kinetikenerji bulma işlemi:"+kinetikenerji);
        
        
        
        
        
        
        
        
        
        
        
        
                
                
        
       
        
        
    }
    
}
