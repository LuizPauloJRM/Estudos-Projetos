print(True and True and True)
#and(e):Todas verdadeiras 
#or(ou):ou uma ou a outra
#Not(não):todas falsas
#None(Sem valor)

entrada=input('[E] Entrar [S] Sair ')
senha_digitada = input ('Senha: ')  

senha_permitida='1234'
#if condição for "True"
#and para chegar mais de uma condição 
#   ...
if entrada == 'E' and senha_digitada == senha_permitida:
        print('Entrar')
else:
    print('Sair')