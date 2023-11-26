package Atividades;
import java.util.Scanner;
public class Menor_de_Tres {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,menor;
		
		System.out.println("Primeiro valor ");
		a=sc.nextInt();
		System.out.println("Segundo  valor ");
		b=sc.nextInt();
		System.out.println("Terceiro valor ");
		c=sc.nextInt();
		
		//Logica para descobrir quem e o menor entre a,b,c
		if(a<b && a<c) {//"A" menor
			menor=a;
		}else if (b<c) {//"B" menor
			menor=b;
		}else {
			menor=c;//"C" menor 
		}
		System.out.println("O menor valor é , "+ menor );

	}

}
