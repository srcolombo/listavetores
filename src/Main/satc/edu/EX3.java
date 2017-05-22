
package Main.satc.edu;

import java.util.Scanner;

public class EX3 {

   /*Faça um Programa que leia 4 notas, mostre as notas e a média na tela.*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
         double nota[];
         double soma=0;        
         nota = new double[4];
         for (int i = 0; i < 4; i++) {
             System.out.println("Digite as notas: ");
              nota[i]= entrada.nextDouble();
            soma = soma+nota[i];
 }
          double media=(soma/4);
          for (int i = 0; i < 4; i++) {
              System.out.println("Notas: " +nota[i]+"\n");
            
        }
          
          System.out.println("Média: "+media);
         
         
             
        
    }
    
}
