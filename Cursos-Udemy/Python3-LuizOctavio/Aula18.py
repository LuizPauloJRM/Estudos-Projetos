#Operadores lógicos (OR)
#Or(ou)→Qualquer uma condição é válidas
#Qualquer condição
#Maúsculo[E] ou minúsculo [e]
entrada=input('[E] Entrar [S] Sair ')
senha_digitada = input ('Senha: ')  

senha_permitida='1234'
if (entrada == 'E' or entrada == 'e') and senha_digitada == senha_permitida:
        print('Entrar')
else:
    print('Sair')
#Avaliação de curto circuito
print('Avaliacao de curto circuito')
print(True or False or 0 or 'abc')