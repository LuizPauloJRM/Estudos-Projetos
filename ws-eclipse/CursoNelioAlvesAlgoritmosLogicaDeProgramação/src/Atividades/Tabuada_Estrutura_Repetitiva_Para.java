package Atividades;
import java.util.Scanner;
public class Tabuada_Estrutura_Repetitiva_Para {
	
	public static void main(String[] args) {
		 int valorUsuario;
		    int multiplicador = 0;
		    int total = 0;
		    Scanner ler=new Scanner(System.in);
		    System.out.println("Deseja ver a tabuada de qual número: ");
		    valorUsuario = ler.nextInt();

		    for (int x = 0; x < 10; x++) {
		            total = valorUsuario * ++multiplicador;
		            System.out.println(valorUsuario + " x " + multiplicador + " = " + total);
	}
		
		
	}
}
