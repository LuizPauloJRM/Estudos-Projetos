package OperadoresAritmeticos.Exercicios;
import java.util.Scanner;
public class Ex04 {
	
/*
 Leia um valor que foi depositado na poupança e exiba o valor com o rendimento após um mês.
  Considere que a taxa de juros da poupança é de 0,7% ao mês.
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deposite um valor :");
		float deposito= sc.nextFloat();
		double taxaDeJuros = 0.7;
		double valorRendido = deposito + (deposito * taxaDeJuros);
		System.out.println("Esse valor rendeu R$ : "+valorRendido);
		
	}

}
