#f-strings (Formatação de strings)
#Colocar f antes 
#Exemplo {altura:.10f}de altura ' 10 casas decimais 
nome='Luiz Paulo'
altura=1.86
peso=81
imc=81/(1.86*1.86)
linha_1=f'{nome} tem {altura:.2f} de altura '
print(linha_1)
print('pesa ',peso ,'quilos')
print('meu indice de massa corporal é ' ,imc)
