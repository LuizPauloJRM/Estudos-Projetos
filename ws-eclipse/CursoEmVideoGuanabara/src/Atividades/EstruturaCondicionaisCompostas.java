package Atividades;

import java.util.Scanner;

public class EstruturaCondicionaisCompostas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Em que ano voce nasceu?");
		int nascimento=sc.nextInt();
		int idade=2023-nascimento;
		System.out.print("Sua idade é :  " + idade);
		if(idade>=18) {
			System.out.print("Maior de idade" );
		}else{
			System.out.print("Menor de idade" );
		}

	}

}
