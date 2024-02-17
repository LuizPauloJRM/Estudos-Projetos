import java.util.Scanner;
public class Exercicio02 {
	
	public static void main(String args[]) {
		int numero;
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite um número:");
		double numero1 = sc.nextDouble();
		System.out.println("Digite um segundo número:");
		double numero2 = sc.nextDouble();
		if(numero1 == numero2) {
			System.out.println("Esse número é igual");
		}else {
			System.out.println("Esse número é diferente");
		}
	}
	

	}

