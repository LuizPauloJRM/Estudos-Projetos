package Introducao;
import java.util.Scanner;
public class Aula03 {

	public static void main(String[] args) {
	/*
 Desenvolva um programa em java que lê o nome de um aluno e suas notas das quatro provas. O
programa deve mostrar o nome do aluno e a média aritmética das referidas notas.
média = n1+n2+n3+n4
4	
	 */
		 Scanner scanner = new Scanner(System.in);

	        // Declaração das variáveis
	        String nomeAluno;
	        float nota1, nota2, nota3, nota4;
	        float media;

	        // Leitura do nome do aluno
	        System.out.print("Digite o nome do aluno: ");
	        nomeAluno = scanner.nextLine();

	        // Leitura das notas
	        System.out.print("Digite a nota da primeira prova: ");
	        nota1 = scanner.nextFloat();

	        System.out.print("Digite a nota da segunda prova: ");
	        nota2 = scanner.nextFloat();

	        System.out.print("Digite a nota da terceira prova: ");
	        nota3 = scanner.nextFloat();

	        System.out.print("Digite a nota da quarta prova: ");
	        nota4 = scanner.nextFloat();

	        // Cálculo da média aritmética
	        media = (nota1 + nota2 + nota3 + nota4) / 4;

	        // Exibição do nome do aluno e da média
	        System.out.println("O aluno " + nomeAluno + " obteve a média aritmética de: " + media);
	}

}
