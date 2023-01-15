package lambdas.consumidoras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdasTipoConsumidorasListas {
	
	public static void main(String[] args) {
		
		//ES IMPORTANTE SABER QUE LAS LAMBDAS PUEDEN DECLARAR SU TIPO O NO
		//USANDO LISTAS U OTRA ESTRUCTURA DE DATO
		
		
		//Creamos una lista con numeros
		List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(1,2,33,44,555));
		
		
		//==============================================
		System.out.println("\n===== LAMBDA CONSUMER DECLARADA ====");
		//Declaramos una lambda de tipo consumer
		Consumer <List<Integer>> listaNumeros = 
				lista -> lista
				.stream()
				.forEach(numero ->System.out.println(numero));;
				
	
		//Invocamos el consumer
		listaNumeros.accept(numeros);

	
		
	}

}
