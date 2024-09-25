"""
Funcionamento do For 
Iteravel -> string , range ...
Iterador -> Um valor por vez 
next -> próximo valor 
iter -> seu iterador 
"""
texto = iter('Luiz')#__iter__()
"""
print(texto,__next__())
"""
print(next(texto))
print(next(texto))
print(next(texto))
print(next(texto))
#print(next(texto)) Sem esgotar os valores 

print (texto)
#texto = 'Luiz' Iter ()
texto = "Luiz"
numeros = range (0,100,8)
for numero in numeros:
    print(numeros)
print('')
#For letra in text solicitando para o objeto o iterador dele 
text='Paulo'#Iteravel
iterador = iter(text)#iterator

while True:
    try:
        print(next(iterador))
    except StopIteration: