"""
Dados mutáveis  - List e copy
Copiando valores (Imutáveis)
Aponta para o mesmo valor na memória (Mutável)
nome="Luiz"
outra_Variavel= nome
nome = "Paulo"
print(nome)
print(outra_Variavel)
"""
lista_a=["Luiz", "Ana",1,True,1.2]
#lista_b=lista_a 
lista_b=lista_a.copy()
#print(lista_b)
#Modifica tambem a lista b , mesmo valor na memória 
lista_a[0] = "Qualquer valor"
print(lista_a)
print(lista_b)