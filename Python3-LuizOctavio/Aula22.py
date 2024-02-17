#Formatação de strings com f-strings
#s- string
#d- int 
#f- float 
#.<numero de dígitos>f
#x ou X - Hexadecimal 
#(Caractere)(><^)(quantidade)
#>- Esqueda 
#< - Direita 
#^ - Centro
#Sinal - +  ou -
#Ex.: 0>100,.1f
#Conversion flags - !r !s !a
variavel= 'ABC'
print (f'{variavel}')
print (f'{variavel: >10}')
#Outro tipo 
print (f'{variavel}')
print (f'{variavel: >10}')
print (f'{1000.4873648123746: .1f}')