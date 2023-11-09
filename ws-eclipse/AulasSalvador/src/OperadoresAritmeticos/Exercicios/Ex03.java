package OperadoresAritmeticos.Exercicios;

import java.util.Scanner;

public class Ex03 {
/*
 Calcule o salário de um vendedor ao final do mês.
  O salário final será o salário fixo mais 15% sobre as vendas efetuadas.
  Os dados de entrada serão o salário fixo e o valor total das vendas efetuadas no mês.
 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite a sua vendas no mês: ");
			double vendaMes = scanner.nextDouble();
			System.out.println("Digite seu salário: ");
			double salarioFixo = scanner.nextDouble();
			double salarioFinalBonus= 0.15*vendaMes + salarioFixo;
			System.out.println("O seu salario final é: " +salarioFinalBonus);
		}
		
		
	}
	
	
}
