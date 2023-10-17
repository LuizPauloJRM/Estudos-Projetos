package Atividades;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int x=4;
		int y=7;
		int z=12;
		boolean r=(x<y && y<z)?true:false;//operador "E" uma E outra 
		System.out.println(r);
		int h=12;
		int p=89;
		int q=13;
		boolean b=(x>y ^ y>z)?true:false;//operador "exclusivo" uma e exclusivamente outra 
		System.out.println(b);
		int i=2;
		int t=9;
		int s=1;
		boolean o=(x>y || y>z)?true:false;//operador "ou" uma ou outra 
		System.out.println(o);
	}

}
