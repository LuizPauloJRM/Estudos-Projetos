package PrimeirosProgramas;
import java.util.Locale;
public class Frase_Formatada {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
		    int idade=24;
		    double salario=4560.9;
		    String nome="Luiz Paulo";
		    char sexo='M';
		    System.out.println("O funcionário " +nome +",sexo "+sexo+ " ,ganha o salário de  " +String.format("%.2f",salario) +" e tem  "+idade+ " anos.");

	}

}
