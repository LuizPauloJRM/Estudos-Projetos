package Introducao;
import java.util.Scanner;
public class Aula02 {

	public static void main(String[] args) {
		/*
		 
		 */
		  Scanner scanner = new Scanner(System.in);

	        // A, B, C e D
	        System.out.print("Digite o valor de A: ");
	        int A = scanner.nextInt();

	        System.out.print("Digite o valor de B: ");
	        int B = scanner.nextInt();

	        System.out.print("Digite o valor de C: ");
	        int C = scanner.nextInt();

	        System.out.print("Digite o valor de D: ");
	        int D = scanner.nextInt();

	        // Calculando a diferença entre o produto de A e B e o produto de C e D
	        int diferenca = (A * B) - (C * D);

	        // Mostrando o resultado
	        System.out.println("A diferença é: " + diferenca);
	}

}
