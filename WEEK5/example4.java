/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author casper
 */
public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 1; i<=9; i++){ // dışardaki for
            System.out.println(i+"lerin çarpımı:");
            for(int j = 1; j<=10;j++){ // içerdeki for
                int sonuc = i*j;
                System.out.println(i+"*"+j+"="+sonuc);
            }
        }
    }
    
}
