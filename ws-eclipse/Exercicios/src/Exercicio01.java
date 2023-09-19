

	import java.util.Scanner;
	public class Exercicio01 {
	public static void main(String args[]) {
		int numero;
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite um número:");
		numero = sc.nextInt();
		if(numero >= 18) {
			System.out.println("Voce é de maior");
		}else {
			System.out.println("Voce de é menor");
		}
	}

	}
