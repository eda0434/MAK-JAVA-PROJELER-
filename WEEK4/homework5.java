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
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen metre cinsinden bir değer giriniz");
        double m = input.nextDouble();
        System.out.println("Lütfen bir seçenek giriniz,x1=mm, x2=cm, x3=dm, x4=km");
        double x= input.nextDouble();
        double a=1;
        if(x==1){
            a=1000*m;
            System.out.println("mm:"+a);
        }
        else if(x==2){
            a=100*m;
            System.out.println("cm:"+a);
        }
        else if(x==3){
        a=10*m;
        System.out.println("dm:"+a);
    }
        else{
            a=(m)/1000;
            System.out.println("km:"+a);
        }
    }
    
}
