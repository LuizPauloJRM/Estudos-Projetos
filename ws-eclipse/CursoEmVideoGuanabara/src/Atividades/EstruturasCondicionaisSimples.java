package Atividades;
import java.util.Scanner;
public class EstruturasCondicionaisSimples {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite a primeira nota do aluno:");
		float n1= sc.nextFloat();
		System.out.println("Digite a segunda nota do aluno:");
		float n2= sc.nextFloat();
		float m= (n1+n2)/2;
		System.out.println("Sua media é: "  +m);
		if (m>9) {
			System.out.println("Parabens aluno, voce passou!");
		}
	}

}
