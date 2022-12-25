package lambdas.comparacion.tipos;

import java.util.function.Predicate;

public class AnalisisRendimientoNumeric {
	
	public static void main(String[] args) {
		
		//TODOS LOS TIPOS DE LAMBDAS SE IMPLEMENTAN A TRAVES DE INTERFACES
		//Tomar el concepto de lo que hace cada tipo de lambda no en si
		//quien lo implementa
		
		/*
		 * Supplier<T>: esta función se debe utilizar cuando se 
		 * necesiten generar objetos sin requerir argumentos. Por 
		 * ejemplo para realizar una inicialización perezosa.
		 * 
		Consumer<T> esta en cambio es el opuesto de Supplier ya que 
		consume, acepta como argumento el tipo T sin devolver ningún 
		valor de retorno.
		
		Function<T,R> esta interfaz permite definir una función que 
		acepta un parámetro de tipo T y devuelve un resultado del tipo
		 R pudiendo aplicarle alguna transformación u operación.
		 
		BiFunction<T,R,S> esta interfaz permite definir una función 
		que acepta dos parámetros de tipo T y R, devolviendo un 
		resultado del tipo S. Normalmente serán operaciones de 
		agregación u operadores binarios como la suma, resta, etc..
		
		
		 Predicate<T> la interfaz predicado debe devolver forzosamente
		 un boolean dado un objeto de tipo T, normalmente utilizado 
		 para filtrar elementos de una colección.
		 * 
		 * 
		 * */

		
	}

}
