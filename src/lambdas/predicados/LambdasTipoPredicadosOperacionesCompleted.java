package lambdas.predicados;

import java.util.function.Predicate;

public class LambdasTipoPredicadosOperacionesCompleted {
	
	public static void main(String[] args) {
		
		

		System.out.println("\n==================================================");
		System.out.println("======== Predicados Lambdas Tipo Decimal(Double) =========");
		System.out.println("==================================================\n");
	
		

		System.out.println("\n--- Operamos sobre un numero y comparamos su igualdad con otro numero ---");
		
		Predicate<Double> decimal01 = n1 -> (n1.sum(n1, 12.2) > 24.5);
		
		System.out.println(decimal01.test(3.3));
		
	
		
		
System.out.println("\n--- Operamos sobre un numero y comparamos su igualdad con  otra operacion---");
		
		Predicate<Double> decimal02 = n1 -> (n1.sum(n1, 12.2) > (24.5 * 89.1));
		
		System.out.println(decimal02.test(3.3));
		
	
		
	System.out.println("\n--- Comparamos el maximo de dos numeros con otro ---");
		
	Predicate<Double> decimal03 = n1 -> (n1.max(n1, 17.4) < (67.7 - 7.7));
	
	System.out.println(decimal03.test(32.3));
	
		
		
		
	}

}
