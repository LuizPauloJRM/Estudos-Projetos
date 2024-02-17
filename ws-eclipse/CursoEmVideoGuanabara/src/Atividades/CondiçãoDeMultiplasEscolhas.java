package Atividades;
import java.util.Scanner;
public class CondiçãoDeMultiplasEscolhas {

	public static void main(String[] args) {
		Scanner tec= new Scanner(System.in);
		System.out.print("Quantas pernas");
		int perna=tec.nextInt();
		String tipo = null ;
		System.out.print("Isso é um(a) ");
		switch(perna){
		case 1:
			tipo="Saci";
			break;
		case 2:
			tipo="bípede";
			break;
			
		case 3:
			tipo="Tripede";
			break;
			
		case 4:
			tipo="Quadrupede";
			break;
		case 6:
			tipo="Aranha";
			break;
			
		
		}
		System.out.println(tipo);	
	}

}
