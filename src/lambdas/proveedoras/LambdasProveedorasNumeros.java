package lambdas.proveedoras;

import java.util.function.Supplier;

public class LambdasProveedorasNumeros {
	public static void main(String[] args) {
		
		int x=12;
		int y=12;
		
		int suma=x+y;
		int resta=x-y;
		int mult=x*y;
		int div=x/y;
		
		Supplier<Integer> sumaSupplier01 = () -> x + y;
		
		Supplier<Integer> sumaSupplier02 = () -> suma + y;
		
		Supplier<Integer> sumaSupplier03 = () -> suma + y + (334*4) + div;
		
		//Nos ahorramos convertir los posibles decimales y variables
		Supplier<Integer> sumaSupplier04 = () -> 10289 + (456*5) + (11/8);
		
		//Pero el mayor uso es en Strings y Objetos
		Supplier<String> calculadora = () -> 
		"\n=== CALCULADORA ====\n"
		+"\n Suma --> "+ (x+y)
		+"\n Resta --> "+ (x-y)
		+"\n Multiplicacion --> "+ (x*y)
		+"\n División --> "+ (x/y)
		;
		
		
		System.out.println(sumaSupplier01.get());
		System.out.println(sumaSupplier02.get());
		System.out.println(sumaSupplier03.get());
		System.out.println(sumaSupplier04.get());
		System.out.println(calculadora.get());
	}

}
