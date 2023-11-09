package Atividades;
import java.util.Scanner;
public class EstruturaRepeticaoNumeros {

	public static void main(String[] args) {
		int num,s=0;//Uma variavel para o número quero somar esse número varias vezes
		String resp;
		Scanner teclado = new Scanner(System.in);
		do {//Estrutura de repetição
			System.out.println("Digite um número : ");
			num=teclado.nextInt();//objeto da classe scanner para ler o número que voce digitar 
			s += num;//s=s +n;
			System.out.print("Deseja continuar ? [S/N] ");
			resp = teclado.next();
		}while(resp.equals("S"));//Vou executar todo o bloco acima enquanto minha resposta for igual Sim 
				System.out.println("A soma de todos os valores é : "+s);
	}

}
