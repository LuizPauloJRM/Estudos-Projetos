import java.util.Scanner;
public class VotoObrigatorio {
	public static void main(String[]args) {
		int idade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é sua idade?");
		idade=sc.nextInt();
		if(idade>18&& idade<=70)
			System.out.println("Voto obrigatório");
			else {
			System.out.println("O voto não é obrigatorio");
			}
			
	}
}
