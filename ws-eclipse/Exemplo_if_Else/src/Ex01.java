import java.util.Scanner;
public class Ex01 {
public static void main(String args[]) {
	int numero;
	Scanner sc= new Scanner(System.in);
	System.out.println("Digite um número:");
	numero = sc.nextInt();
	if(numero >= 5) {
		System.out.println("Esse número é maior ou igual a 5");
	}else {
		System.out.println("Esse número é menor que 5");
	}
}

}
