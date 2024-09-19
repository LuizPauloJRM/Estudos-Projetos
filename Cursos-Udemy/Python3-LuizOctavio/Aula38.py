"""
Exemplo de quando não sabe precisamente quantas repetições vou ter 
Quantas repetições foram feitas ate digitar determinado 
Quando não sabe quantas repetições utilizar 
"""
senha_salva = '12345'
senha_digitada=''
repeticoes=0
while senha_salva != senha_digitada:
    senha_digitada = input(f'Senha({repeticoes}x): ')
    repeticoes+=1
print(repeticoes)
print('Laço com repetições infinitas')