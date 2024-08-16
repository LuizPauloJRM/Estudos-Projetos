"""
Introdução ao try/except
try: Executar o código
except: ocorreu algum erro ao tentar executar
"""
#numero_str =  input('Qual o dobro do numero digitado : ')

#if numero_str.isdigit():
    #numero_float = float(numero_str)
    #print(f'O dobro do {numero_str} é {numero_float*2:.2f}')
#else:
    #print('Você não digitou um número')
numero_str =  input('Qual o dobro do numero digitado : ')
try:
    print('STR: ', numero_str)
    numero_float = float(numero_str)
    print('FLOAT: ', numero_float)
    print(f'O dobro do {numero_str} é {numero_float*2:.2f}')
    
except:
    print('Você não digitou um número')
   