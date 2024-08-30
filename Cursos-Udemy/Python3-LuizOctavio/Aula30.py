"""
    Calculadora com while - Parte 1 
    Comando "Sair"
"""
while True:
    sair = input('Quer sair: [s]im: ')#.lower().startswith()
    sair = sair.lower()#Mesma string
    sair = sair.startswith('s') #Se começa com "S" , "s" , retornar False ou True 
    print(sair)