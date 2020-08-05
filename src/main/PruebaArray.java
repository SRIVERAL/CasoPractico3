package main;

public class PruebaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array arregloFijo = new Array();
		
		arregloFijo.rellenar(2);
		arregloFijo.rellenar(4);
		arregloFijo.rellenar(10);
		arregloFijo.rellenar(7);
		arregloFijo.rellenar(5);
		arregloFijo.rellenar(3);
		
		arregloFijo.visualizar();
		
		
		
		Array arreglo = new Array();
		
		arreglo.rellenar();
		
		//arreglo.ordenar();
		
		arreglo.visualizar();
		
	}

}
