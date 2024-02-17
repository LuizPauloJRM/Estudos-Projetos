package Atividades;

import java.util.Arrays;

public class Vetores03 {

	public static void main(String[] args) {
		double v[] = {3.5,2.75,9,-4,5};
		Arrays.sort(v);
		for (double valor:v) {//Pàra cada elemento de v coloque dentro de valor
			System.out.println(valor + " ");
		}

	}

}
