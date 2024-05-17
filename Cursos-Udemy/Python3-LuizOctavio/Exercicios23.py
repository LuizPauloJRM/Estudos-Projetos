"""
Peça ao usuário para digitar seu nome, idade
Se o nome e idade forem digitados : 
    Exiba:
     Seu nome é {nome}
     Seu nome invertido é {nome invertido}
     Se nome tem ou não espaços
     Seu nome tem {n} letras
     A primeira letra do seu nome é ... 
     A última letra do seu nome é...
     Seu nada for digitado em nome ou idade exiba "Campos vazios"
"""

nome = input('Digite seu nome: ')
idade = input('Digite sua idade: ')

if nome and idade:
    print(f"Seu nome é: {nome}")
    print(f"Sua idade é: {idade}")
    print(f"Seu nome invertido é: {nome[::-1]}")
    
    if ' ' in nome:
        print("Seu nome contém espaços")
    else:
        print("Seu nome não contém espaços")
    
    print(f"Seu nome tem {len(nome)} letras")
    print(f"A primeira letra do seu nome é: {nome[0]}")
    print(f"A última letra do seu nome é: {nome[-1]}")
else:
    print("Campos vazios [ERROR]")
