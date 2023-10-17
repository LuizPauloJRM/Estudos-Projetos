package Atividades;

public class OperadoresLogicosRelacionais {

	public static void main(String[] args) {
		int n1=5;
		int n2=6;
		int r=(n1>n2)?0:1;//r recebe 0:1 se n1 for maior que n2
		System.out.println(r);
		int n3=24;
		int n4=23;
		int y=(n3<n4)?1:89;//A variavel menor que esta no inicio,vai receber ou 1 ou 89,se n3 for menor que n4
		System.out.println(y);//Neste caso n3 nao e maior que n4
		int n5=80;
		int n6=90;
		int b=(n5<n6)?n6:n5;
		System.out.println(b);
		int n7=14;
		int n8=18;
		int m=(n7<n8)?n7:n8;
		System.out.println(m);
		int n9=25;
		int n10=20;
		int v=(n9>n10)?n9+n10:n9-n10;//podemos colocar operadores para calcular tambem 
	}

}
