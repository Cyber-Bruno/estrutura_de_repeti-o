package estrutura_de_repeti��o;

import java.util.Scanner;

public class exerc�cio5 {

	public static void main(String[] args) {
		/*
		 * Foi realizada uma pesquisa entre os funcion�rios de uma dada empresa. Foram
		 * recolhidos os dados de altura, sexo (M/F) e sal�rio de 20 funcion�rios.
		 * Construa um programa que informe:
		 * 
		 * � a m�dia de sal�rio do grupo; 
		 * � maior e menor altura do grupo; 
		 * � quantidade de mulheres com sal�rio at� R$1.000,00;
		 */

		 Scanner leitor = new Scanner(System.in);

	        int cont = 1;
	        double soma = 0;
	        float maior = 0;
	        float menor = 0;
	        double salario;
	        float altura;
	        String sexo ;
	             
	        System.out.println("Cadastro de dados funcion�rios");
	        do {

	            System.out.printf("%d� - Pessoa\n",cont);

	            System.out.print("Altura:");
	            altura = leitor.nextFloat();

	            System.out.print("Sexo(M/F):");
	            sexo = leitor.next();

	            System.out.print("Sal�rio:");
	            salario = leitor.nextFloat();
	            cont++;

	            soma = soma+ salario/20;

	            if(altura > maior){

	                altura = maior;

	            }if(altura < menor){

	                altura = menor;

	            }if(salario <= 1000 && sexo == "f"){

	                cont = cont + 1;
	            }
	        } while (cont <= 2);


	        System.out.println("M�dia sal�rial:"+soma);

	        System.out.println("Maior altura:"+maior 

	            +"\nMenor altura:"+ menor);

	       System.out.println("quantidade de mulheres com sal�rio at� R$1.000,00 :"+cont);
		
		
		
		
		
		
		
	}
}
