package Atividades;

public class ComparaçãoString {

	public static void main(String[] args) {
		String nome1="Luiz";
		String nome2="Luiz";
		String nome3=new String("Luiz");//objeto nao tem a mesma estrutura portanto não é igual 
		String resultado=(nome1==nome3)?"igual":"diferente";//(nome1.iguals())
		System.out.println(resultado);
		
	}

}
