"""
Tipo list 
Inserindo itens em qualquer  índice de lista com  insert 
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
lista=[10,20,30,40,50,60] 
lista.append('Luiz')
nome=lista.pop
print (lista)
del lista[-1]
print (lista)
#lista.clear() Apagar itens da lista 
lista.insert(0,5) #Recebe 2 argumento primeiro argumento índice que quer mexer , segundo depois da "," qual valor quer colocar 
print(lista[0])
print(lista)
