//Leia o nome
//Quatro variaveis para armazenar quatro notas
//Uma variavel para armazenar a media 
//Ler o nome do teclado 
//ler as quatro notas 
//Calcular a media
//Verificar se foi aprovado ou reprovado
import java.util.Scanner;
public class Exerciocio05 {
	public static void main(String[]args) {
		String nomeAluno;
		int nota1,nota2,nota3,nota4;
		int mediaNotas;
		Scanner sc= new Scanner(System.in);
		System.out.println("Qual o nome do aluno:");
		nomeAluno = sc.nextLine();
		System.out.println("Qual são as notas dos alunos:");
		nota1 = sc.nextInt();//nextInt
		nota2 = sc.nextInt();
		nota3 = sc.nextInt();
		nota4 = sc.nextInt();
		mediaNotas = (nota1+nota2+nota3+nota4)/4;
		System.out.println("Media = "+mediaNotas);
		if(mediaNotas>=6) {
			System.out.println("Aprovado");
		}else{
			System.out.println("Reprovado");
			
		}
		
	}
}
