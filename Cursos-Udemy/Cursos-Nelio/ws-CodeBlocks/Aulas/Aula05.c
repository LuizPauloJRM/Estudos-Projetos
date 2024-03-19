#include <stdio.h>
int main(){
int idade;
double salario;
char nome[50];
char sexo;
idade = 25;
salario = 4560.9;
strcpy(nome, "Luiz Paulo");
sexo = 'M';
printf("O funcionario %s, sexo %c, ganha %.2lf e tem %d anos\n", nome, sexo,salario, idade);

return 0;


}

