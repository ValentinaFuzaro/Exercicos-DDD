package entrada_processamento_saida;

import java.util.Scanner;

public class Ex03 {  

   public static void main(String[] args) {  
   
	   Scanner ler = new Scanner(System.in);
	   
	   int a, b, area;  
	   
	   System.out.printf("Digite o valor da base: ");  
	   a = ler.nextInt();
	   
	   System.out.printf("Digite o valor da altura: ");
	   b = ler.nextInt();
	   
	   area = a * b/2;
	   
	   System.out.printf("O resultado da área é: %d", area);
   } 
}