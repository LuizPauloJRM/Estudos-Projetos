package Atividades;

public class Metodoteste01 {
	static void soma(int a, int b) {//procedimento soma estatico "Static"
		int s = a+b;
		System.out.println("A soma é : " + s);
		
	}
	public static void main(String[] args) {
		System.out.println("Começou o programa");//metodo main é executado primero 
		soma(5,2);
	}

}
