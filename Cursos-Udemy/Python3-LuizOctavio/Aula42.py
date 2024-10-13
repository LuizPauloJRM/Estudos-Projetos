"""
Tipo List 
Cuidados com dados mutáveis
= - copiado o valor (imutáveis)
= - aponta para o mesmo valor na memória (mutável)
#        +01234
#        -54321
string = "ABCDE" #5 caracteres (len)
lista = []#Lista vazia 
lista2=[123,True,"Luiz Paulo",1.2,[]]
print(lista, type(lista))
print(bool([])) #False 
print(lista2)
print(lista2[2].upper(),type(lista[2]))

"""

lista_a = [1, 2, 3]
lista_b = [4, 5, 6]
lista_c = lista_a + lista_b
lista_a.extend(lista_b)
lista_a = ['Luiz', 'Paulo', 1, True, 1.2]
lista_b = lista_a.copy()
lista_a[0] = 'Qualquer valor'
print(lista_a)
print(lista_b)