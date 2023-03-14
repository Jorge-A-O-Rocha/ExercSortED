package controller;

public class modulos {
	public modulos() {
		super();
	}
	

	public int[] bubbleSort(int[] vet) {
		int tamanho = vet.length;
		
		//rodadas
		for(int i = 0; i < tamanho; i++) {
		
		
			for(int j=0; j < tamanho -1 ; j++) {
				if(vet[j]> vet[j+1] ) {
					int aux = vet[j];
					vet[j]= vet[j+1];
					vet[j+1]=aux;
				}
			}
			
			for(int valor : vet ) {
				System.out.print(valor + " ");
			}
			
			System.out.println("Rodada# "+i);   
		}
	
		return vet;
				
	}
	
	
	public int[] mergeSort(int[]vet, int inicio, int fim) {
		System.out.println("Vetor da posição "+inicio+" até "+fim);
		
		if(inicio< fim) {
			int meio = (inicio+fim)/2;
			mergeSort(vet,inicio,meio);//esquerda
			mergeSort(vet,meio+1,fim);//direita
			intercala(vet,inicio,meio,fim);
		}
		return vet;
	}

	private void intercala(int[] vet, int inicio, int meio, int fim) {
		int novoVetor[] = 	new int[vet.length];
		for(int i = inicio; i <= fim; i++ ) {
			novoVetor[i] = vet[i];
			
		}
		
		int esq = inicio;
		int dir = meio +1;
		
		for(int cont = inicio; cont <= fim; cont++) {
			if(esq>meio) {
				vet[cont] = novoVetor[dir];
				dir++;
			}else if(dir> fim) {
				vet[cont]= novoVetor[esq];
				esq++;
			}else if(novoVetor[esq] < novoVetor[dir]) {
				vet[cont] = novoVetor[esq];
				esq++;
			}else {
				vet[cont] = novoVetor[dir];
				dir++;
			}
		}
		
	}
}
