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
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int vize;
        int fınal;
        do {
            System.out.println("Lütfen vize notunuzu girin");
            vize = input.nextInt();
            System.out.println("Lütfen fınal notunuzu giriniz");
            fınal = input.nextInt();
        }while(vize<0 || vize>100 || fınal<0 || fınal>100);
    
        double ort = (double) vize*0.4 + fınal*0.6;
        if(ort>=80 && ort<=100)
        {
        System.out.println(ort+"Notunuz A");
    }
        else if(ort>=60 && ort<=79){
        System.out.println(ort+"Notunuz B");
    }
        else if(ort>=50 && ort<=59){
        System.out.println(ort+"Notunuz C");
    }
        else if(ort>=0 && ort<=49){
                System.out.println(ort+"Notunuz D");
                }
    }
    }
       
