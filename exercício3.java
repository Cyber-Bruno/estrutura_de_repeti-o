package estrutura_de_repetição;

import java.util.Scanner;

public class exercício3 {

	public static void main(String[] args) {
		
		/*
		 * Construa um programa que leia 20 números inteiros e calcule ao final da
		 * leitura a soma e a média desses números.
		 */
		
		Scanner leitor = new Scanner(System.in);
        int ctg = 1;
        int valor;
        int soma = 0 ,media;
        
        System.out.println("Digite 20 números");
        System.out.println();
        
        do {
            System.out.printf("Numero %d:",ctg);
            valor = leitor.nextInt();
            ctg++; 
          soma = soma + valor;
          media = soma/20;
          
        } while (ctg <= 20);
        
         System.out.println();
         System.out.println("Soma: " +soma);
         System.out.println("Media: " +media);

	}

}
