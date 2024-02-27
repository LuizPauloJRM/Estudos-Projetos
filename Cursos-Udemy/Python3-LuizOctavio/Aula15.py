#Entendendo o fluxo do interpretador em condicionais (If,else,elif)
#“Else” e “elif” depende do “if”, nao pode ser sozinhos , 
# somente o “if”.Pode ter quantas linhas ou blocos de código voce determinar 
entrada = input('Voce quer "entrar" ou "sair" do sistema ')
if entrada == 'entrar':
        print('Voce entrou no sistema')

elif entrada=='sair':
        print('Voce saiu do sistema')
