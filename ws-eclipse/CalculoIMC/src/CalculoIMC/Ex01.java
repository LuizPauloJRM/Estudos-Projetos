package CalculoIMC;
import java.util.Scanner;
public class Ex01 {
//imc=peso/altura elevado por 2
//a) < 16 - Magreza grave
//b) 16 a < 17 - Magreza moderada
//c) 17 a < 18,5 - Magreza leve
//d) 18,5 a < 25 - Saudável
//e) 25 a < 30 - Sobrepeso
//f) 30 a < 35 - Obesidade Grau I
//g) 35 a < 40 - Obesidade Grau II (severa)
//h) >= 40 - Obesidade Grau III (mórbida)

	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);  
		     
		    // vamos solicitar o peso e a altura da pessoa
		    System.out.print("Informe seu peso: ");
		    double peso = Double.parseDouble(entrada.nextLine());
		    System.out.print("Informe sua altura: ");
		    double altura = Double.parseDouble(entrada.nextLine()); 
		     
		    // vamos calcular o IMC
		    double imc = peso / (altura * altura);
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
		     
		    System.out.println("\n");

	}

}
