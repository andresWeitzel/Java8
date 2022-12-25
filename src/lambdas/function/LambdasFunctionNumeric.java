package lambdas.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdasFunctionNumeric {
	
	public static void main(String[] args) {
		
		
		List<String> listadoProductos = new ArrayList<String>(Arrays.asList("Tomate","Zapallo","Pollo"));
		
		
		Function<List<String>,Double> calcularPrecio = (List<String> listado)->
		{
		listado.addAll(Arrays.asList("Calabaza","Papas","Pure"));
		double precio=0;	
		for(String elemento : listadoProductos) {
			if(elemento == "Pollo") {precio+=500;}
			else if(elemento == "Tomate") {precio+=100;}
			else if(elemento == "Papas") {precio+=50;}
			}
		return precio;
		};
		
		System.out.println(calcularPrecio.apply(listadoProductos));
		
		
	}
}
