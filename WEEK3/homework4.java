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
public class homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("lütfen bir a sayısı girin");
       int a = input.nextInt();
       
       
       if(a==1){
           System.out.println("Bugün günlerden pazartesi");
       }
       else if(a==2){
           System.out.println("Bugün günlerden salı");
       }
       else if(a==3){
           System.out.println("Bugün günlerden çarşamba");
       }
       else if(a==4){
           System.out.println("Bugün günlerden perşembe");
       }
       else if(a==5){
           System.out.println("Bugün günlerden cuma");
       }
       else if(a==6){
           System.out.println("Bugün günlerden cumartesi");
       }
       else if(a==7){
           System.out.println("Bugün günlerden pazar");
       }
       else{
           System.out.println("Haftada sadece 7 gün vardır.");
           
       }
       
           
       }
       
    }
    


