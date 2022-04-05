package entrada_processamento_saida;

import java.util.Scanner;

public class Ex06 {  

   public static void main(String[] args) {  
   
	   Scanner ler = new Scanner(System.in); 
 
	   double a, b, conversao;
	   
	   System.out.printf("Digite o valor da cotação do dolar: ");
	   a = ler.nextDouble();
	   
	   System.out.printf("Digite a quantidade de dolares: ");
	   b = ler.nextDouble();
	   
	   conversao = a * b;
	   
	   System.out.printf("Seu valor em reais é: %.2f", conversao);
   } 
}
