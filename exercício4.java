package estrutura_de_repeti��o;

import java.util.Scanner;

public class exerc�cio4 {

	public static void main(String[] args) {
		
//Construa um programa que leia 15 n�meros inteiros e, ao final, mostre qual foi o maior valor fornecido. 

		 Scanner leitor = new Scanner(System.in);

	        int prox = 1;
	        int valor;
	        int maior = 0;

	        System.out.println("Digite 15 n�meros");
	        System.out.println();

	        do {
                   System.out.printf("Numero %d:",prox);
                   valor = leitor.nextInt();
                   prox++;
   
	            if(valor > maior){

	                maior = valor;
	                }        

	        } while (prox <= 15);

	        System.out.println("O maior n�mero �: "+maior);

	    }

}
