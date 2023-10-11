
//ler numero
//positivo negativo ou nulo 
package UsodeIfEncadeado;
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
		int N1;
		System.out.println("Escolha um numero : ");
		N1 = sc.nextInt();
			if(N1>0) {
				System.out.println("O número é positivo");
			}
			else if(N1==0) {
				System.out.println("O número é nulo");
			}else {
		
		System.out.println("O número é negativo");
	
		
		}
	}
}
