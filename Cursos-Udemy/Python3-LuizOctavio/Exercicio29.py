"""
Interando String com while
"""

#     0123456789
"""
nome='Luiz Paulo'#iteraveis
tamanho_nome= len(nome)
print(nome)
print(tamanho_nome)
print(nome[3])
"""
#Para cada interação do while vou ter um print de cada letra da variavel nome
nome='Luiz Paulo' 
indice = 0 
while indice < len(nome):
    print(nome[indice])
    indice += 1
#Com novo nome , declarou Luiz paulo e criou um novo nome vazio 
#Entrou no indice valou 0 que é maior que a string L entrou e vai interando U,I,Z P,A,U,L,O
indice = 0 
novo_nome =''
while indice < len(nome):
    letra=nome[indice]
    novo_nome += letra #+=f'*{letra}' *L*u*i*z* *P*a*u**l*o*
    indice += 1
#novo_nome +=*
print(novo_nome)