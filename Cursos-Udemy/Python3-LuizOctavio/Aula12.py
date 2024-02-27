#Formatação de strings com o metodo format
#Ações são metodos  
a= 'A'
b= 'B'
c= 1.1
#string='a={},b={},c={}'
formato='a={} b={} c={:.2f}'.format(a,b,c)#argumentos a={0} b={1} c={2:.2f}
print(formato)
