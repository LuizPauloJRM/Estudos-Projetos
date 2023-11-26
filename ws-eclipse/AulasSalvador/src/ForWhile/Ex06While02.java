package ForWhile;

public class Ex06While02 {

	public static void main(String[] args) {
		int i,produto;
		produto=1;
		for(i=1;i<=5;i++) {
			produto= produto * i;
			System.out.println("Produto parcial="+produto);
			
		}
		System.out.println("Produto final ="+produto);
	}

}
