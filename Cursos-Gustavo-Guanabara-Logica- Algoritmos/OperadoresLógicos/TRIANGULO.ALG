Algoritmo "triangulo"

Var
   L1,L2,L3:Real
   EQ,ES: Logico
   


Inicio
      escreva ("Digite primeiro lado:")
      leia(L1)
      escreva("Digite segundo lado:")
      leia(L2)
      escreva("Digite terceiro lado:")
      leia(L3)
      EQ <-(L1=L2) e (L2=L3)
      ES <-(L1<>L2) e (L2<>L3) e (L1<>L3)
      escreval ("O triangulo e EQUILATERO?", EQ)
      escreval ("O triangulo e ESCALENO?", ES)


Fimalgoritmo