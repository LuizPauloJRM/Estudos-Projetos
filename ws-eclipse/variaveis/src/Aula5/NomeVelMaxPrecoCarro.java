//Ler nome pelo teclado 
//Ler velocidade maxima 
//Ler o tempo de aceleração de 0 a 100 
//Ler o preço do carro
//Armazenar nas referidas variaveis


package Aula5;
public class NomeVelMaxPrecoCarro {

	public static void main(String[] args) {
		// Declare as variáveis para armazenar os dados do carro
		int velocidadeMaxima;
		String nomeCarro;
		String Passati = null;
		nomeCarro=Passati;
		velocidadeMaxima = 200;
        float tempoAceleracao;
        tempoAceleracao=2;
        double precoCarro;
        precoCarro=25000.00;
     // Usar as variáveis para os dados do carro em seu programa
        System.out.println ("O nome do veiculo"+nomeCarro);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Tempo de Aceleração de 0 a 100 km/h: " + tempoAceleracao + " segundos");
        System.out.println("Preço: R$ " + precoCarro);
	}

}
