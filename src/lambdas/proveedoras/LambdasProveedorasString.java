package lambdas.proveedoras;

import java.util.function.Supplier;

public class LambdasProveedorasString {
	
	public static void main(String[] args) {
		
		String titulo = "Titulo de algun Libro";
		String temario ="Este es el Temario del Libro formato enumeración";
		String cuerpo= "Este es el cuerpo del libro. "
				+ "Todo el desarrollo del libro esta en este parrafo";
		String bibliografia ="Esta es la bibliografia de este libro";
		
		int cantidadPaginas = 224;
		int cantidadVentas=2334;
		int precio = 10;
		
		
		Supplier<String> libro = () -> 
					"\n== Desarrollo del Libro =="
					+"\n1) "+titulo
					+"\n2) "+temario
					+"\n3) "+cuerpo
					+"\n4) "+bibliografia
					+"\n\n== Datos del Libro =="
					+"\n * Cantidad de Paginas : "+cantidadPaginas
					+"\n * Cantidad de Ventas : "+cantidadVentas
					+"\n * Precio : "+precio+" USD";
		
		System.out.println(libro.get());
	}

}
