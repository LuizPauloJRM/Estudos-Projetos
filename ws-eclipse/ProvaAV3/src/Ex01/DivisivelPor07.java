package Ex01;
import java.util.Scanner;
public class DivisivelPor07 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Entre com um número: ");
	        int number = scanner.nextInt();      
	        if (number % 7 == 0) {
	            System.out.println(number + " É divisivel por 7.");
	        } else {
	            System.out.println(number + " Não é divisivel por 7.");
	        }

	}

}
