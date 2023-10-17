package Atividades;

public class OperadorTernário {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,r;
		n1=4;
		n2=8;
		r=(n1>n2)?0:1;//Variavel r recebe um determinado valor dependendo da comparação 
		System.out.println(r);//Se n1=4 for maior que n2=8 , 4 não é maior que 8 entao o r recebe 1
		int n3=14;
		int n4=8;
		int x=(n3>n4)?n3:n4;//n3 se for menor n4 se for maior
		//tambem aceita formulas 
		int n5=14;
		int n6=18;
		System.out.println(x);
		int y=(n5>n6)?n5+n6:n5-n6;//n5+n6 maior n5-n6 menor 
		System.out.println(y);
		
	}

}
