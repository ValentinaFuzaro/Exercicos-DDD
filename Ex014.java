package estrutura_de_decis�o;

import java.util.Scanner;

public class Ex014 {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.printf("Digite seu peso: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite sua altura: ");
		altura = ler.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (imc < 19) {
			System.out.printf("Voc� n�o est� no peso ideal.");
		} else {
			System.out.printf("Voc� est� no peso ideal.");
	
		}
		
		
	}
}
