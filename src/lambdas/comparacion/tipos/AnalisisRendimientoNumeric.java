package lambdas.comparacion.tipos;

import java.util.function.Predicate;

public class AnalisisRendimientoNumeric {
	
	public static void main(String[] args) {
		
		//TODOS LOS TIPOS DE LAMBDAS SE IMPLEMENTAN A TRAVES DE INTERFACES
		//Tomar el concepto de lo que hace cada tipo de lambda no en si
		//quien lo implementa
		
		/*
		 * Supplier<T>: esta funci�n se debe utilizar cuando se 
		 * necesiten generar objetos sin requerir argumentos. Por 
		 * ejemplo para realizar una inicializaci�n perezosa.
		 * 
		Consumer<T> esta en cambio es el opuesto de Supplier ya que 
		consume, acepta como argumento el tipo T sin devolver ning�n 
		valor de retorno.
		
		Function<T,R> esta interfaz permite definir una funci�n que 
		acepta un par�metro de tipo T y devuelve un resultado del tipo
		 R pudiendo aplicarle alguna transformaci�n u operaci�n.
		 
		BiFunction<T,R,S> esta interfaz permite definir una funci�n 
		que acepta dos par�metros de tipo T y R, devolviendo un 
		resultado del tipo S. Normalmente ser�n operaciones de 
		agregaci�n u operadores binarios como la suma, resta, etc..
		
		
		 Predicate<T> la interfaz predicado debe devolver forzosamente
		 un boolean dado un objeto de tipo T, normalmente utilizado 
		 para filtrar elementos de una colecci�n.
		 * 
		 * 
		 * */

		
	}

}
