package PrimeirosProgramas;

import java.util.Locale;

public class Variaveis_Tipos_Dados {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		int idade; 
		double salario,altura;
		char genero;
		String nome;
		
		idade=24;
		salario=5800.5;
		altura=1.82;
		genero='M';//aspas simples para string 
		nome= "Luiz Paulo";
		System.out.println("IDADE="+idade);
		System.out.println("NOME="+nome);
		System.out.println("SALARIO="+String.format("%.2f",salario));//duas casas decimais 5800.50
		System.out.println("GENERO="+genero);
		System.out.println("ALTURA="+altura);
		
	}
}
