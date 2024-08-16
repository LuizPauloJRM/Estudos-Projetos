package Introducao;
import java.util.Scanner;
public class Aula01 {
/*
 a ) Crie a classe chamada DeclaracaoVariaveis.java e dentro do método main faça o seguinte:
 Declare uma variável do tipo String para armazenar o nome de um carro;
 Declare uma variável do tipo int para armazenar a velocidade máxima desse carro;
 Declare uma variável do tipo float para armazenar o tempo de aceleração de 0 a 100 desse
carro;
 Declare uma variável do tipo double para armazenar o preço desse carro;
 Leia pelo teclado o nome, a velocidade máxima, o tempo de aceleração de 0 a 100 e preço
de um carro, e armazene nas referidas variáveis;
 Mostre uma frase com todas essas informações.
 */
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Declaração das variáveis
	        String nomeCarro;
	        int velocidadeMaxima;
	        float tempoAceleracao;
	        double precoCarro;

	        // Leitura dos dados
	        System.out.print("Digite o nome do carro: ");
	        nomeCarro = scanner.nextLine();

	        System.out.print("Digite a velocidade máxima do carro (km/h): ");
	        velocidadeMaxima = scanner.nextInt();

	        System.out.print("Digite o tempo de aceleração de 0 a 100 km/h (em segundos): ");
	        tempoAceleracao = scanner.nextFloat();

	        System.out.print("Digite o valor do carro R$: ");
	        precoCarro = scanner.nextDouble();

	        // Exibição das informações
	        System.out.println("O carro " + nomeCarro + " tem uma velocidade máxima de " + 
	                           velocidadeMaxima + " km/h, acelera de 0 a 100 km/h em " + 
	                           tempoAceleracao + " segundos e custa R$ " + precoCarro + ".");

	}

}
