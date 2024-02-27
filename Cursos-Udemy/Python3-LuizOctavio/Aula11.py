#f-strings (Formatação de strings)
#Colocar f antes 
#Exemplo {altura:.10f}de altura ' 10 casas decimais 
#calculo IMC
#IMC=peso/(altura*altura)
nome='Luiz Paulo'
altura=1.86
peso=81
imc=81/(1.86*1.86)#imc=peso/altura**2
linha_1=f'{nome} tem {altura:.2f} de altura '#f strings
#print (nome,'tem',altura,'de altura,',')
#print('pesa',peso,'quilos e seu imc é',)
#print(imc) 
print('pesa ',peso ,'quilos')                
print(linha_1)                                                 
print('meu indice de massa corporal é ' ,imc)
#Luiz Paulo tem 1.86 de altura 
#pesa  81 quilos
#meu indice de massa corporal é  23.413111342351716