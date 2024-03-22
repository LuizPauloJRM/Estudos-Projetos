#include<stdio.h>
int main(){
	char operacao;
	double numero1 , numero2 , resultado;
	
	printf("Calculadora\n");
	printf("Digite a operacao que deseja fazer (+,-,*,/): ");
	scanf("%c", &operacao);	//guardando dentro da variável operação;
	//numero 1
	printf("Digite o primeiro numero: ");
	scanf("%lf" ,&numero1);
	
	//numero 2
	printf("Digite o segundo numero: ");
	scanf("%lf" ,&numero2);
	
	//estrutura condicional 
	switch(operacao) {
		case '+':
			resultado = numero1 + numero2;
			break;
		case '-':
			resultado = numero1 - numero2;
			break;
		case '*':
			resultado = numero1 * numero2;
			break;
		case '/':
			if(numero2 == 0){
				printf("[ERRO] : A divisao por 0 nao e permitida");
				return 1;
			}else{
				resultado = numero1 / numero2;
			}
			
			
			break;
		default:
			printf("[ERRO]: Voce escreveu uma operacao invalida");
			return 1;

	}
	printf("%lf %c %lf = %lf", numero1, operacao, numero2, resultado);
	return 0;
		
}
