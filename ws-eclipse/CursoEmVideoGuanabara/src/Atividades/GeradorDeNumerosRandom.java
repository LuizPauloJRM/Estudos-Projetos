package Atividades;

public class GeradorDeNumerosRandom {

	public static void main(String[] args) {
		double aleatorio=Math.random();//Mostrar numeros aleatorio
		System.out.println(aleatorio);
		int num=(int)(5+aleatorio*(10-5));//Mostrar aleatoriamente mas de 5 a 10
		System.out.println(num);

	}

}
