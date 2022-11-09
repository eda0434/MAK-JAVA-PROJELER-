/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Adım 1:Başla
Adım 2:Üç adet sayı al;a,b,c
Adım 3:Sayıların toplamını hesapla;toplam=a+b+c
Adım 4:Sayıların çarpımını hesapla;çarpım=a*b*c
Adım 5:Sayıların ortalamasını hesapla;ort=toplam/3
Adım 6:Sayıların toplamını çarpımını ve ortalamasını ekrana yazdır;toplam,çarpım,ort
Adım 7:Dur
 */
import java.util.Scanner;

public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner İnput = new Scanner (System.in);
        System.out.println("Lütfen birinci sayı");
        int a = İnput.nextInt();
        System.out.println ("lütfen ikinci sayı");
        int b = İnput.nextInt();
        System.out.println("lütfen üçüncü sayı");
        int c = İnput.nextInt();
        int toplam = a+b+c;
        int çarpım = a*b*c;
        int ortalama = (a+b+c)/3;
        System.out.println("toplama işlemi:"+toplam);
        System.out.println("çarpma işlemi:"+çarpım);
        System.out.println("ortalama işlemi:"+ortalama);
                
        
        
    }
    
}
