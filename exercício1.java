package estrutura_de_repeti��o;

import java.util.Scanner;

public class exerc�cio1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
	    int num;
        int prox = 1;  
        
        do {  
            System.out.printf("Numero %d:", +prox);
            num = leitor.nextInt();   
          if(num > 0){
            System.out.println("Positivo");
           }else{
            System.out.println("Negativo");
           }
          prox++;
        } while ( prox <=10 );

	}}

