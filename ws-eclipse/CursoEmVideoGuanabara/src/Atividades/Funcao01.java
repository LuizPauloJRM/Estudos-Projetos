package Atividades;

public class Funcao01 {
	//metodo do calculo responsável apenas para fazer o cálculo 
	static int soma(int a, int b) {
		int s = a + b;
		return s;
	}
	//metodo principal
	public static void main(String[] args) {
		System.out.println("Começa o programa");
		int sm = soma(5,2);
		System.out.println("A soma vale " +sm);
		

	}

}
