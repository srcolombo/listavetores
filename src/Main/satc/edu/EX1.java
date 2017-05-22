
package Main.satc.edu;

import java.util.Scanner;


public class EX1 {
/*	Faça um Programa que leia um vetor de 5 números inteiros e mostre-os. */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
         int vetor[];  
         int i=0;
         vetor = new int[5];
         for (int j = 0; j < 5; j++) {
             System.out.println("Digite o valor:");
              vetor[j]= entrada.nextInt();
        }
         System.out.println("----------------------");
         for (int j = 0; j < 5; j++) {
             System.out.println("Seus vetores são" +vetor[j]);   
        }
                      
}
}
