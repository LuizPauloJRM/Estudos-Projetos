//calcular IMC
//peso/altura*altura

//< 16 - Magreza grave
//16 a < 17 - Magreza moderada
//17 a < 18,5 - Magreza leve
//18,5 a < 25 - Saudável
//25 a < 30 - Sobrepeso
// 30 a < 35 - Obesidade Grau I
//35 a < 40 - Obesidade Grau II (severa)
//>= 40 - Obesidade Grau III (mórbida)
package Ex01;
import java.util.Scanner;
public class Ex01 {

	public Ex01() {
	double peso;
	double altura;
	Scanner sc = new Scanner(System.in);	
	//Primeiro vamos informar um peso 
	System.out.println("Digite o seu peso");
	peso=sc.nextDouble();
	System.out.println("Digite sua altura");
	altura=sc.nextDouble();
	//calcular IMC
	double imc=peso/(altura*altura);
	System.out.println("Seu IMC é: " + imc);
	 // vamos mostrar a classificação
    if(imc < 16){
      System.out.println("Sua classificação é Magreza grave");  
    }
    else if((imc >= 16) && (imc < 17)){
      System.out.println("Sua classificação é Magreza moderada");  
    }
    else if((imc >= 17) && (imc < 18.5)){
      System.out.println("Sua classificação é Magreza leve");  
    }
    else if((imc >= 18.5) && (imc < 25)){
      System.out.println("Sua classificação é Saudável");  
    }
    else if((imc >= 25) && (imc < 30)){
      System.out.println("Sua classificação é Sobrepeso");  
    }
    else if((imc >= 30) && (imc < 35)){
      System.out.println("Sua classificação é Obesidade Grau I");  
    }
    else if((imc >= 35) && (imc < 40)){
      System.out.println("Sua classificação é Obesidade Grau II");  
    }
    else{
      System.out.println("Sua classificação é Obesidade Grau III (mórbida)");   
    }
	}

}
