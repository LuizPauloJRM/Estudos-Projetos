#DIGITE :
#O TIPO PRIMITIVO DESSE VALOR É
#SÓ TEM ESPAÇOS ?
#É UM NÚMERO?
#É ALFABÉTICO?
#É ALFANUMÉRICO?
#ESTA EM MAIÚSCULAS?
#ESTA EM MINÚSCULAS?
#ESTA CAPITALIZADA?
a = input('Digite: ')
print('Tipo primitivo : ', type(a) )
print('Contem espaços? ',a.isspace())
print('É número ? ',a.isnumeric())
print('É alfabético ? ',a.isalpha())
print('É alfanumérico ? ',a.isalnum())
print('Contem letras em maiúsculas ? ',a.isupper())
print('Contem minúsculas ? ',a.islower())