#Entendendo o fluxo do interpretador em condicionais
condicao1= False 
condicao2= False
condicao3= True
condicao4= False
if condicao1:
    print('Código para condicao 1')
elif condicao2:
    print('Código para condicao 2')
elif condicao3:
    print('Código para condicao 3')
elif condicao4:
    print('Código para condicao 4')
    
else:
    print('Nenhuma condicao foi satisfeita')
    
if 10==10:
    print('Outro "if"')
    
print ('Fora do "if"')