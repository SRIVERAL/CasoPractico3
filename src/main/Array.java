package main;

import java.util.Random;

public class Array {

	private int[] arreglo = new int[6];
	
	/*
	 * en cada elemento del array almacena el int que recibe como parámetro.
	 */
	
	public void rellenar(int i) {
		
		if (arreglo[0] == 0) {
			arreglo[0] = i;
		} else if (arreglo[1] == 0) {
			arreglo[1] = i;
		} else if (arreglo[2] == 0) {
			arreglo[2] = i;
		} else if (arreglo[3] == 0) {
			arreglo[3] = i;
		} else if (arreglo[4] == 0) {
			arreglo[4] = i;
		} else {
			arreglo[5] = i;
		}
			
		
	}
	
	/*
	 * en cada elemento del array almacena un int aleatorio del 1 al 49 
	 * y que no exista en otras posiciones; es decir, sin repetidos.
	 */
	
	public void rellenar() {
		
		Random genRandom = new Random();
		
		
		for (int j = 0; j < arreglo.length; j++) {
			
			int i = genRandom.nextInt(49) + 1;
			
			arreglo[j] = i;
						
		}
		
	}
	
	/*
	 * ordena los elementos del array de menor a mayor.
	 */
	
	public void ordenar() {
		
		int temp = 0;
		
		for (int i = 0; i < arreglo.length - 1; i++) {
			for (int j = 1; j < arreglo.length - i; j++) {
				if (arreglo[j] < arreglo[j-1]) {
					temp = arreglo[j];
					arreglo[j] = arreglo[j-1];
					arreglo[j-1] = temp;
				}
			}
		}
		
	}
	
	/*
	 * visualiza en pantalla los elementos del array
	 */
	
	public void visualizar() {
		
		ordenar();
		
		System.out.print("Visualizar --> { ");
		
		for (int j = 0; j < arreglo.length; j++) {
			System.out.print(arreglo[j] + ", ");
		}
		
		System.out.println(" }");
		
	}
	
}
