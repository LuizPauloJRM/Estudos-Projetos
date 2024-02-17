package Atividades;

import java.util.Arrays;

public class Vetores04 {

	public static void main(String[] args) {
		int vet[] = {3,7,6,1,9,4,2};
		for (int v:vet) {
			System.out.print(v+" ");
		}
		System.out.print("");
		int p=Arrays.binarySearch(vet, 1);
		System.out.print("O valor esta na posição "+p);

	}

}
