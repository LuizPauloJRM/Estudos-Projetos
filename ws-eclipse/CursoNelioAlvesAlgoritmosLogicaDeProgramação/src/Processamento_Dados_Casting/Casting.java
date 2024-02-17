package Processamento_Dados_Casting;
import java.util.Locale;
public class Casting {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int x=5;
		double y=2*x;
		System.out.println(x);
		System.out.println(String.format("%.1f" , y));

	}

}
