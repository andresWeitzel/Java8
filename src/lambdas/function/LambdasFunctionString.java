package lambdas.function;


import java.util.function.Function;

public class LambdasFunctionString {

	public static void main(String[] args) {
		//https://www.arteco-consulting.com/introduccion-a-java-lambda/

		
		//El primer parametro del generic indica la entrada y el segundo
		//la devolucion

		Function<String, String> listado = (String listadoSuperm)->{
			return listadoSuperm.concat(", Cebolla 1 Kg");
		};
		
		//Podemos compactar aún más la lambda
		Function<String, String> listado02 = listadoSuperm -> listadoSuperm.concat(", Cebolla 1Kg");
		
		System.out.println(listado.apply("Morron 1Kg, Tomates 1Kg, Lechuga 1Kg"));
		System.out.println(listado02.apply("Morron 1Kg, Tomates 1Kg, Lechuga 1Kg"));
		
		
		
		//-----------------------------------------------------------------
		System.out.println("\n");
		
		Function<String, String> libroDescr = (String libro)->{
			String donQuijMancha = "== Don Quijote de la Mancha​ ==\n es una novela escrita"
					+ " por el español Miguel de Cervantes Saavedra. Publicada su"
					+ " primera parte con el título de El ingenioso hidalgo don "
					+ "Quijote de la Mancha a comienzos de 1605, es la obra más "
					+ "destacada de la literatura española y una de las principales"
					+ " de la literatura universal";
			
			String seniorAnillos = "== El Señor de los Anillos ==\n Su historia se desarrolla en la Tercera Edad "
					+ "del Sol de la Tierra Media, un lugar ficticio poblado por "
					+ "hombres y otras razas antropomorfas como los hobbits, los "
					+ "elfos o los enanos, así como por muchas otras criaturas "
					+ "reales y fantásticas.";
			
			String libroSelec = (libro=="Don Quijote de la Mancha") 
					? donQuijMancha  : seniorAnillos;
			
			return libroSelec;
	
		};
		
		System.out.println(libroDescr.apply("Otro"));
		System.out.println(libroDescr.apply("Don Quijote de la Mancha"));
		
		
	}
	
}
