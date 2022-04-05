package entrada_processamento_saida;

import java.util.Scanner;

public class Ex02 {  

   public static void main(String[] args) {  
   
	   Scanner ler = new Scanner(System.in);
	   
	   int a, b, multiplicação;
	   
	   System.out.printf("Digite o valor de um lado do quadrado: ");  
	   a = ler.nextInt();
	   
	   System.out.printf("Digite o valor de um lado do quadrado: ");
	   b = ler.nextInt();
	   
	   multiplicação = a * b;
	   
	   System.out.printf("O resultado da área é: %d", multiplicação);
   } 
}