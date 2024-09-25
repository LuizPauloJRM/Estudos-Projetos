#While com for continue break, else ...
"""
For-> Sabe o inicio e o fim 

"""
for i in range(10):
    if i == 2:
        print("i é 2, pulando ...")
        continue
    if i == 8:
        print("i é 8, seu else não é executado")
        break
        
    for j in range (1,3):#Range de 1 e 3 
        print(i,j)
    else:
        print("For completo com sucesso!")
    