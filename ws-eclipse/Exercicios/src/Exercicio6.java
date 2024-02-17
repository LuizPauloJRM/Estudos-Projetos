//uma variavel para altura
//uma variavel para sexo (númerico)
//uma váriavel para peso ideal 
//ler altura
//ler número do sexo
//calcular o peso idela de acordo com as respostas
//mostar o peso ideal

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String args[]) {
		float altura;
		int sexo;
		float pesoIdeal;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com a altura");
		altura = scanner.nextFloat();
		System.out.println("Qual o seu sexo?"
						+ "Digite 1:feminino 2:masculino");
		sexo = scanner.nextInt();
		if(sexo == 1) {
			pesoIdeal = (62.1f*altura)-44.7f;
		}
		else {
			pesoIdeal = (72.7f*altura)-58f;				
		}
		System.out.println("Peso ideal = "+pesoIdeal);
		
		
		}
			
		
	}