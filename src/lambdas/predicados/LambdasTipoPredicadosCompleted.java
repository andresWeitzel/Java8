package lambdas.predicados;

import java.util.function.Predicate;

public class LambdasTipoPredicadosCompleted {
	
	public static void main(String[] args) {
		
		
		System.out.println("***************************************************************");
		System.out.println("** LAS LAMBDA DE TIPO PREDICADOS SON EXPRESIONES");
		System.out.println("QUE ACEPTAN UN PARÁMETRO O VARIOS Y DEVUELVEN UN VALOR LÓGICO");
		System.out.println("***************************************************************\n");
		
		
		
		//https://mkyong.com/java8/java-8-predicate-examples/
		//https://www.ecodeup.com/entendiendo-paso-a-paso-las-expresiones-lambda-en-java/
		//https://www.adictosaltrabajo.com/2015/12/04/expresiones-lambda-con-java-8/
		//https://www.geeksforgeeks.org/java-8-predicate-with-examples/
		System.out.println("\n==================================================");
		System.out.println("======== Predicados Lambdas Tipo String =========");
		System.out.println("==================================================\n");

		System.out.println("n--- Comparar Longitud una Cadena ---");
		
		
		Predicate<String> cadenaDeTexto = (c1) -> c1.length() > 5;
		
		System.out.println(cadenaDeTexto.test("Este es un texto!"));
		
		
		System.out.println("n--- Comparar Longitud de 2 Cadenas con Comparador OR ---");
		
		Predicate<String> cadenaDeTexto02 = (cadena01) -> cadena01.length() > 5;
		
		System.out.println(
				cadenaDeTexto02.test("Esto es una texto")
				|| cadenaDeTexto02.test("Esto es otro texto") 
				);
		
		

		System.out.println("\n--- Comparar Longitud de 1 Cadena con Comparador OR en Predicado---");
		
		
		Predicate<String> cadenaDeTexto03 = 
				(cadena01) -> 
							cadena01.length() > 5
							|| cadena01.length() < 5;
		
		
		
		System.out.println(cadenaDeTexto03.test("dasdasad"));
		
		
		System.out.println("\n==================================================");
		System.out.println("======== Predicados Lambdas Tipo Integer =========");
		System.out.println("==================================================\n");
		
		int numControl = 12;
		int numComparar = 10;

		System.out.println("\n--- Comparamos 2 Números ---");
		
		Predicate<Integer> num02 = n1 -> (n1 > numControl);

		System.out.println(num02.test(numComparar));
		
		
		
		System.out.println("\n--- Comparamos 2 Números con Comparador OR ---");
		
		Predicate<Integer> num03 = n1 -> (n1 > numControl);

		System.out.println(num03.test(30) || num03.test(32));
		
		
		
		System.out.println("\n--- Comparamos 2 Números con Comparador AND ---");
		
		Predicate<Integer> num04 = n1 -> (n1 < numControl);

		System.out.println(num04.test(30) && num04.test(32));
		


		System.out.println("\n--- Comparamos 2 Números con 2 Expresiones Función OR ---");
		

		System.out.println(num03.or(num02).test(30));

	

		System.out.println("\n--- Comparamos 2 Números con 2 Expresiones Función AND ---");
		

		System.out.println(num03.and(num04).test(30));
		
	
		System.out.println("\n==================================================");
		System.out.println("======== Predicados Lambdas Tipo Decimal(Double) =========");
		System.out.println("==================================================\n");
	
		
		
		double numControl02 = 1289.12;
		double numComparar02 = 1289.12;

		System.out.println("\n--- Comparamos 2 Números ---");
		
		Predicate<Double> num05 = n1 -> (n1 > numControl02);

		System.out.println(num05.test(numComparar02));
		
		
		

		System.out.println("\n--- Comparamos la Igualdad de Numeros/Objetos ---");
		
		Predicate<Double> num06 = n1 -> (n1.equals(numControl02));

		System.out.println(num06.test(numComparar02));
		
		
		
		System.out.println("\n--- Comparamos la Desigualdad de Numeros/Objetos ---");
		
		Predicate<Double> num07 = n1 -> (n1 != 0.7);

		System.out.println(num07.negate().test(0.22));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
