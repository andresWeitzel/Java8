package lambdas.consumidoras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdasTipoConsumidorasSinDefinicion {
	
	public static void main(String[] args) {
		
		List<Double> listaNums = 
				new ArrayList<Double>(Arrays.asList(2.33,2.2,5.23,7.88));
		
		//==============================================
		System.out.println("\n===== LAMBDA CONSUMER SIN DECLARACION ====");
		
		
		//No declaramos la funcion de tipo consumer, solo la usamos		
		listaNums.stream().forEach(numero->System.out.println(numero));
			
	}

}
