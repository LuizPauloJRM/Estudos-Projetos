
package Atividades;
import java.util.Scanner;
public class EntradaDeDados {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);//A palavra new cria um objeto e system.in monitorarxxxxxxxxxxxc  a entrada padrão 
		System.out.println("Digite o nome:");
		String nome = sc.nextLine();//Fazer o objeto ler o nome 
		System.out.println("Digite a nota:");
		float nota= sc.nextFloat();//Fazer o objeto ler a nota ,numero real 
		System.out.format("A nota de %s é %.1f \n" ,nome, nota);
	}   

}
