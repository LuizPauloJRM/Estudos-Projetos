"""
Exibindo índices  da lista 
0 Maria 
1 Helena 
2 Luiz
"""
lista1 = ["Maria","Helena","Luiz"]
print (lista1)
#Gerar números
lista2=["Messi","Rogerio","Cristiano"] 
indices = range(len(lista2))

for indice in  indices:
    print (indice, lista2[indice], type(lista2[indice]))
                
