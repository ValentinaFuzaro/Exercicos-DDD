package estrutura_de_decis�o;

import java.util.Scanner;

public class Ex017 {
	
	public static void main (String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		String sexo;
		
		System.out.printf("Digite seu peso: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite sua altura: ");
		altura = ler.nextDouble();
		
		System.out.printf("Digite a sigla de seu g�nero, F para feminino e M para masculino: ");
		sexo = ler.next();
		sexo = sexo.toUpperCase();
		
		imc = peso / (altura * altura);
		
		if (sexo.equals("F")){
			if (imc < 19) {
				System.out.printf("Voc� est� abaixo do peso."); 
			} else if (19 <= imc && imc < 24) {
				System.out.print("Voc� est� em seu peso ideal.");
			} else if (imc >= 24) {
				System.out.printf("Voc� est� acima de seu peso.");
			}	
		} else if (sexo.equals("M")) {
			if (imc < 20) {
				System.out.printf("Voc� est� abaixo do peso.");
			} else if (imc <= 20 && imc < 25 ) {
				System.out.printf("Voc� est� em seu pedo ideal.");
			} else if (imc > 25) {
				System.out.printf("Voc� est� acima do peso.");
			} else {
			}
			
		}
		
		
	}
}
