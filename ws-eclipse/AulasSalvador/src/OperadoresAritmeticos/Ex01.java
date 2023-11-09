package OperadoresAritmeticos;

public class Ex01 {
/*lá=440 hz
 valor Math.pow(2,1.0/12.0)
 */
	public static void main(String[] args) {
		double la = 440;
		double si= 440;
		double valor = Math.pow(2,1.0/12.0);//Para usa-se Math funções matemáticas 
		si=la*valor;
		System.out.println("Si= " +si);
	}

}
