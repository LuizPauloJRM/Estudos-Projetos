

	import java.util.Scanner;
	public class Exercicio3 {
		public static void main(String args[]) {
			int numero;
			Scanner sc= new Scanner(System.in);
			System.out.println("Digite um número:");
			int numero1= sc.nextInt();
			
			System.out.println("Digite um segundo número:");
			int numero2= sc.nextInt();
			
			if(numero1 > numero2) {
				System.out.println("Esse numero é maior é:" +numero1 ); 
	
				
			}else {
				System.out.println("Esse número é menor é:"+numero2);
			}
			
		}		
		
		}
