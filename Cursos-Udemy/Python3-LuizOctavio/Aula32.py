""" 
Calculadora - Parte 2 
Verificando os números se serão validos 
"""
while True : 
    numero_1 = input('Digite um número: ')
    numero_2 = input('Digite um número: ')
    operador = input('Digite um operador (+-/*): ')
    
    numeros_validados= None #Uma flag (Bandeira)
    #Verificando erros 
    try:
        num_1_float= float(numero_1)
        num_2_float= float(numero_2)
        numeros_validos=True
    except: 
        
        numeros_validos=None
    if numeros_validos is None:
        print('Um ou ambos números digitados são inválidos')
        continue
    operadores_permitidos ='+-/*'
    if operador not in operadores_permitidos:
        print('Operador inválido')
        continue
    if len(operador) > 1:
        print('Operador com mais de um caracter, digite apenas um operador ')
        continue
    
    
    sair = input('Sair ? [s]im: ').lower().startswith('s')
    if sair is True:
        break
    