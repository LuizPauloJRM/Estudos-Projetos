"""
Iterando string 
Qual letra aparece mais vezes nesta frase 
"""
frase='O python é uma linguagem multiparadigma . Python foi criado por guido'.lower()
#print (len(frase))
#print (frase.count('python'))
#Contar letras da frase 
#cada iteração contar letras
"""
i = 0 #indice 
while i < len(frase):
    letra_atual = frase[i]
    vezes_que_letra_aparece = frase.count(letra_atual)
    print (letra_atual, vezes_que_letra_aparece)
    i+=1 Iteração 
"""    
frase = 'Python é uma linguagem de programação que as strings são iteraveis'

i = 0
qtd_apareceu_mais_vezes = 0
letra_apareceu_mais_vezes = ''

while i < len(frase):
    letra_atual = frase[i]

    if letra_atual == ' ':
        i += 1
        continue

    qtd_atual = frase.count(letra_atual)

    if qtd_apareceu_mais_vezes <= qtd_atual:
        qtd_apareceu_mais_vezes = qtd_atual
        letra_apareceu_mais_vezes = letra_atual

    i += 1

print(
    'A letra que apareceu mais vezes foi '
    f'"{letra_apareceu_mais_vezes}" que apareceu '
    f'{qtd_apareceu_mais_vezes}x'
)