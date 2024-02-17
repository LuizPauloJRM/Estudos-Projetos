package UsoIfMaisdeUmTeste;
import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		int valor1;
		int valor2;
		int valor3;
		int valor4;
		int valor;
		int contador;
		contador=0;
		valor1=10;
		valor2=3;
		valor3=18;
		valor4=7;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor aqui :");
		 valor=sc.nextInt();
		if(valor==valor1||valor==valor2||valor==valor3||valor==valor4)contador++;
		System.out.println("Digite o segundo valor aqui :");
		 valor=sc.nextInt();
		if(valor==valor1||valor==valor2||valor==valor3||valor==valor4)contador++;
		System.out.println("Digite o terceiro valor aqui :");
		 valor=sc.nextInt();
		if(valor==valor1||valor==valor2||valor==valor3||valor==valor4)contador++;
		System.out.println("Digite o quarto valor aqui :");
		 valor=sc.nextInt();
		if(valor==valor1||valor==valor2||valor==valor3||valor==valor4)contador++;
		else {
			System.out.println("Voce acertou:"+contador);

	}

}
}
