package entradadedados;

import java.util.Scanner;

public class EntradadeDadosTeclado {
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		String nome="Luiz Paulo";
		float nota=2.5f;
	
		System.out.println("Digite o nome do aluno:");
		System.out.print("Digite a nota do aluno:");
		String nome1 = teclado.nextLine();//ler nome
		float nota1 = teclado.nextFloat();//ler número real
		System.out.format("A nota de %s é %.1f\n", nome1,nota1);
		
	
	}
}
