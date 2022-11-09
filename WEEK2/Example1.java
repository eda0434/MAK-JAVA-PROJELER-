/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author casper
 */
import java.util.Scanner; // java'nın util kütüphanesine ait Scanner class'ı import edildi.
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println ("lütfen km cinsinden değer veriniz");// kullanıcıdan değer almak için tanımladık
        int km = input.nextInt();
        int metre = km * 1000;
        System.out.println ("hesaplanan metre;"+metre);
        
        
        
    }
    
}
