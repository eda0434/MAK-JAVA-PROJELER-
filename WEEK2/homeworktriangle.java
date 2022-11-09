/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Adım 1:Başla
Adım 2:İki adet sayı al
Adım 3:sayıların çarpımını 2'ye böl
Adım 4:Sayıların çarpımını ve 2'ye bölünmüş halini ekrana yazdır.çarpım,bölüm
Adım 5:Dur
 *
 * @author casper
 */
import java.util.Scanner;
public class homeworktriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner İnput = new Scanner(System.in);
        System.out.println("yüksekliği girin");
        int h = İnput.nextInt();
        System.out.println("tabanının uzunluğunu girin");
        int a = İnput.nextInt();
        int alan = a*h/2;
        System.out.println("alan bulma işlemi:"+alan);
                
        
    }
    
}
