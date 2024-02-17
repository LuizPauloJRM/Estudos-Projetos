#Interpolação da string com % em python 
#s- String 
#d e i - int 
#f - float 
#x e X - Hexadecimal (ABCDEF0123456789)

nome='Luiz'
preco=1000.95897643
variavel='%s, o preço é R$%f' %(nome,preco)
print(variavel)
#Casas decimais 
nome='Luiz'
preco=1000.95897643
variavel='%s, o preço é R$%.2f' %(nome,preco)
print(variavel)
#Hexadecimal 
nome='Luiz'
preco=1000.95897643
variavel='%s, o preço é R$%.2f' %(nome,preco)
print(variavel)
print('O hexadecimal de %d é %x' % (15,15))