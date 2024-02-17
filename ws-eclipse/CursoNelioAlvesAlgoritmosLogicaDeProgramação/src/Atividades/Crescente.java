package Atividades;
import java.util.Scanner;
public class Crescente {

static Scanner ler=new Scanner(System.in);
	public static void main(String[] args) {
		int x,y;
		System.out.println("Digite dois números:");
		x=ler.nextInt();
		y=ler.nextInt();
		
		//Lógica para mostrar se e crescente e decrescente
		//Estrutura repetitiva "enquanto" , ate que os valores sejam diferentes 
		while(x!=y) {
			if(x<y) {
			System.out.println("CRESCENTE");
			}else {
				System.out.println("Digite dois números:");
				x=ler.nextInt();
				y=ler.nextInt();
			}
			
		
		
		
		}

	}
}