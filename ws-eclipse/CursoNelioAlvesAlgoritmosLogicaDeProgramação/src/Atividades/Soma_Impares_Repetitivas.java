package Atividades;
/*Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números
impares entre eles.
Exemplo 1:
Digite dois numeros:
2
9
SOMA DOS IMPARES = 15
Exemplo 2:
Digite dois numeros:
15
10
SOMA DOS IMPARES = 24
Exemplo 3:
Digite dois numeros:
6
-5
SOMA DOS IMPARES = 5*/
import java.util.Scanner;
public class Soma_Impares_Repetitivas {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int x,y,troca,soma;
		System.out.println("Digite dois números: ");
		x=ler.nextInt();
		y=ler.nextInt();
	//logica de troca condicional
		if(x>y) {//"x"e "y" , na ordem crescente 
			troca=x;//salvar o valor de "x" dentro da variável troca
			x=y;//Agora salvo o valor de "x", dentro do "y"
			y=troca;/*Depois o "y" vai receber "troca"
	//Estrutura para , para percorrer todos 
	 * os valores digitados para que possa fazer a soma dos impares*/
			
		}
		soma = 0;//Soma acumulado começa com "0"
		for (int i=x+1;i<y;i++) {/*estrutura "para",int i começando com "x+1"
		 						 Porque o proprio valor nao vai entrar 
		 						 o "i" vai começar com "x+1", caminhando com "i"
		 						 por todos os valores entre "x" e "y", 
		 						 "i++" para caminhar de 1 em 1*/
			if(i%2 !=0) {/*se  o valor de "i" é impar ele vai ter que somar
			 			 se não é divisivel por 2*/
			soma= soma+i;	
			}
			System.out.println("Soma dos impares= "+soma);
		}
	}

}
