
package Main.satc.edu;

import java.util.Scanner;


public class EX2 {
  /*Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
         double vetor[];
         vetor = new double[9];
         for (int i = 0; i < vetor.length; i++) {
             System.out.println("Digite o valor real: ");
              vetor[i]= entrada.nextDouble(); 
        }
          for (int i = vetor.length-1; i>=0 ; i--) {
              System.out.println("Seu valor real é:" +vetor[i]);
            
        }
    }
    
}
