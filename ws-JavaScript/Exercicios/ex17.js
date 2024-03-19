var agora = new Date()
var diaSem = agora.getDay()
switch(diaSem){//Testar valores pontuais "0,1,2,3,4,5,6..."
    case 0:
        console.log('Domingo')
        break
    case 1:
        console.log('Segunda')
        break
    // outros dias...
    default:
        console.log('Dia inválido')
        break
}
