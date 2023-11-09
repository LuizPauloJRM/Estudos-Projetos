package Atividades;
//O While faz o teste antes e repete o bloco quantas vezes for nescessário ate que a condição seja falsa
public class EstruturaRepetitivas_Parte1 {

	public static void main(String[] args) {
		int senha=0;
		while (senha<=20) {//Enquanto senha for menor que 20
			System.out.println("Senha incorreta"+senha);
			senha++;//senha recebe senha +1
		}
		
	}

}
