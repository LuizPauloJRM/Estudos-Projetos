package Atividades;

public class TiposPrimitivos {

	public static void main(String[] args) {
		Float nota= 8.5f;//real
		String nome="Luiz";
		System.out.println("A sua nota é: "+nota);
		System.out.printf("A sua nota é %f: " ,nota);//formatado
		System.out.printf("A sua nota é %.1f: " ,nota);//1 casa decimal
		System.out.printf("A sua nota é %.8f: " ,nota);
		System.out.printf("A sua nota é %f: " ,nota);
		System.out.printf("A  nota de %s é %.1f: ",nome ,nota);
	}

}
