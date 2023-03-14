package view;

import br.edu.fateczl.sort.Sort;

public class main {

	public static void main(String[] args) {
		int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		
		Sort sort = new Sort();
		//vetor  = sort.mergeSort(vetor,0,vetor.length -1);
		vetor  = sort.bubbleSort(vetor);
		
		System.out.println("");
		System.out.println("========================");
		for(int valor: vetor) {
			System.out.print(valor+" ");
		}
		System.out.println("");
		System.out.println("========================");
	}

}
