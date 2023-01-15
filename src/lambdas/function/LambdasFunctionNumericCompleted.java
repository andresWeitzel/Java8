package lambdas.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdasFunctionNumericCompleted {
	
	public static void main(String[] args) {
		

		List<String> listadoProductos = 
				new ArrayList<String>(Arrays.asList("Tomate","Zapallo","Pollo"));
		
		
		Function<List<String>, Double> calcularPrecio 
		= (List<String> listadoInput) -> 
		{
			listadoInput.addAll(Arrays.asList("Calabaza","Papas","Pure"));
			
			double precio=0;
			
			for(String producto : listadoProductos) {
				
				System.out.println(producto);
				if (producto == "Pollo") {precio+=1500;}
				else if (producto == "Tomate") {precio+=900;}
				else if (producto == "Papas") {precio+=500;}
			}
			
			
			return precio;
		};
				
		
		
		System.out.println(listadoProductos);
		
		System.out.println(calcularPrecio.apply(listadoProductos));
	}

}
