"""
For / in - Estrutura de repetição para coisas finitas 
For

"""
"""
   texto = 'Python'
i=0
tamanho_texto = len(texto)
while i < tamanho_texto:
    print(texto[i], i)
    i+=1 
"""

"""
Exemplo de quando não sabe precisamente quantas repetições vou ter 
senha_salva = '12345'
senha_digitada=''
repeticoes=0
while senha_salva != senha_digitada:
    senha_digitada = input(f'Senha({repeticoes}x): ')
    repeticoes+=1
print(repeticoes)
print('Laço com repetições infinitas')

"""

#Exemplo For (Para), iteravel passando em cada uma com uma iteração , sabe o tamanho que vai se repetir 
texto = 'Python'
novo_texto=''
#Para cada letra o iteração exiba uma letra na tela
for letra in texto:
    novo_texto += f'*{letra}'
    print(letra)
print(novo_texto + '*')

