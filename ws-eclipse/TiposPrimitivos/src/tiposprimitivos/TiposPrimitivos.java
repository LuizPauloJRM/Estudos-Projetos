package tiposprimitivos;
public class TiposPrimitivos{
	public static void main(String[] args) {
		String nome= "Luiz Paulo";
		float nota = 8.5f;
		
		
		
		System.out.print("A nota é" +nota);
		System.out.printf("Sua nota é %.2f\n", nota);//formatação número real com 2 casas decimais \n (Qubra a linha no float)  
		System.out.printf("Sua nota é %.2f", nota);//formatação número real 
		System.out.format("Sua nota é de %s é %.4f\n",nome,nota);
		System.out.format("Sua nota é de %s é %.1f\n",nome,nota);
	
	}

}
