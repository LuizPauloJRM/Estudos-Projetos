"""
Alterando uma lista com índices , del , append e pop (tip list)
Listas em Python
Tipo list - Mutável
Suporta vários valores de qualquer tipo
Conhecimentos reutilizáveis - índices e fatiamento
Métodos úteis:
append - Adiciona um item ao final
insert - Adiciona um item no índice escolhido
pop - Remove do final ou do índice escolhido
del - apaga um índice
clear - limpa a lista
extend - estende a lista
+ - concatena listas
Create Read Update   Delete
Criar, ler, alterar, apagar = lista[i] (CRUD)
"""
#        0   1  2  3  4  5  6  7  
lista = [10,20,30,40,50,60,70,80]
lista[2] = 300#Alterar 
del lista[2]#Apagar , reorganizando os indices lista [10,20,40...] 
print(lista)
print(lista[2])
print('')
lista2=[1,2,3,4,5,6,7,8,9,10]
#Adicionando os indices lista ao fim da lista 
lista2.append(11)
lista2.append(12)
lista2.append(13)
lista2.append(14)
#print(lista2)
#Último elemento da lista 
ultimo_Valor = lista.pop()
print(ultimo_Valor)
lista.append(60)
lista.append('AAA')
ultimo_Valor = lista.pop()
print(lista, 'Removido, ', ultimo_Valor)