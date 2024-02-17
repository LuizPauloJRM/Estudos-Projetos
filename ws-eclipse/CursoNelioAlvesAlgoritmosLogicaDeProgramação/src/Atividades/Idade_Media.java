package Atividades;
/*Dados da primeira pessoa:
Nome: Maria Silva
Idade: 19
Dados da segunda pessoa:
Nome: Joao Melo
Idade 20
A idade média de Maria Silva e Joao Melo é de 19.5 anos
public class Media_Idade {*/
import java.util.Scanner;
public class Idade_Media {

	public static void main(String[] args) {
		 String nome1;
		 String nome2;
		 int idade1;
		 int idade2;
		double media;
	Scanner sc=new Scanner(System.in);
	System.out.println("Nome da primeira pessoa: ");
	nome1=sc.nextLine();
	System.out.println("Idade da primeira pessoa: ");
	idade1=sc.nextInt();
	
	System.out.println("Nome da segunda pessoa: ");
	sc.nextLine();
	nome2=sc.nextLine();
	System.out.println("Idade da segunda pessoa: ");
	idade2=sc.nextInt();

	media=(double)(idade1+idade2)/2.0;
	System.out.println("A idade media de "+nome1+ " e " + nome2 + " é de " + media + " anos");

	}

}
