package entrada_processamento_saida;

import java.util.Scanner;
 
public class Ex07 {  

   public static void main(String[] args) {  
   
	   Scanner ler = new Scanner(System.in);
	   
	   double a, b, c, d, e, total, pagamento, troco;
	   
	   System.out.printf("Digite o primeiro valor: ");  
	   a = ler.nextDouble();
	   
	   System.out.printf("Digite o segundo valor: ");
	   b = ler.nextDouble();
	   
	   System.out.printf("Digite o terceiro valor: ");
	   c = ler.nextDouble();
	   
	   System.out.printf("Digite o quarto valor: ");
	   d = ler.nextDouble();
	   
	   System.out.printf("Digite o quinto e último valor: ");
	   e = ler.nextDouble();
	   
	   total = a + b + c + d + e;
	   
	   System.out.printf("O resultado da compra é: R$%.2f", total);
	   
	   System.out.printf("\nDigite o valor do pagamento: ");
	   pagamento = ler.nextDouble();
	   
	   troco = pagamento - total;  
	   
	   System.out.printf("O valor de seu troco é: R$%.2f", troco); 

   } 
}
