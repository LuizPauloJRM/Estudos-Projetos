package Introducao;
import java.util.Scanner;
public class Aula04 {

	public static void main(String[] args) {
		/*
		 Desenvolva um programa em java que lê uma temperatura em graus Celsius, converte para
graus Fahrenheit e apresenta na tela, seguindo esta fórmula:
F = 9*C + 160
5
		 */
		  Scanner scanner = new Scanner(System.in);

	        // Declaração das variáveis
	        float celsius;
	        float fahrenheit;

	        // Leitura da temperatura em graus Celsius
	        System.out.print("Digite a temperatura em graus Celsius: ");
	        celsius = scanner.nextFloat();

	        // Conversão para Fahrenheit usando a fórmula F = (9 * C + 160) / 5
	        fahrenheit = (9 * celsius + 160) / 5;

	        // Exibição do resultado
	        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
	        
	}

}
