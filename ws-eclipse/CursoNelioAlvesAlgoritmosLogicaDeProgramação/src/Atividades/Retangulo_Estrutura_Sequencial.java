package Atividades;
/*Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
Exemplo 1:
Base do retangulo: 4.0
Altura do retangulo: 5.0
AREA = 20.0000
PERIMETRO = 18.0000
DIAGONAL = 6.4031
Exemplo 2:
Base do retangulo: 10.3
Altura do retangulo: 13.1
AREA = 134.9300
PERIMETRO = 46.8000
DIAGONAL = 16.6643*/
import java.util.Scanner;
public class Retangulo_Estrutura_Sequencial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double base, altura, area, perimetro, diagonal;
		System.out.println("Base do retangulo");
		base= sc.nextDouble();
		System.out.println("Altura do retangulo");
		altura=sc.nextDouble();
		area=base*altura;
		perimetro =2*base+2*altura;
		diagonal= Math.sqrt(Math.pow(2.0, base)+Math.pow(2.0,altura));//Raiz quadrada, base*base , altura*altura
		
		System.out.println("AREA="+String.format("%.4f",area));
		System.out.println("PERIMETRO="+String.format("%.4f",perimetro));
		System.out.println("DIAGONAL="+String.format("%.4f",diagonal));

		
		
	}

}
