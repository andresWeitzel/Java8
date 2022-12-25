package lambdas.predicados;

import java.util.function.Predicate;

public class AnalisisRendimiento {
	
	public static void main(String[] args) {
		
		
		/*
		 * VAMOS A COMPROBAR QUE LA PROGRAMACION FUNCIONAL NO ES MAS EFICIENTE
		 * QUE LA ESTRUCTURADA PARA OPERACIONES ARITMETICAS. CAPAZ LO SEA PARA 
			PROPOSITOS DE ALMACENAMIENTO. LA CLAVE ES SU LEGIBILIDAD, LIMPIEZA 
			Y COMPACTACION 
		 * 
		 * */
		
		//--------------------- NUMERO ENTERO CON LAMBDA -------------------------
				System.out.println("\n===== NÚMERO ENTERO CON LAMBDA =======");
				long inicio01 = System.nanoTime();

				//Predicate<Integer> predicateEntero = (num) ->num*121212112 > 11111212;
				//Predicate<Integer> predicateEntero = (num) ->((num*121212112 > 11111212) && (num*12126666 > 234234232)) ;
				//No podemos trabajar con fors dentro del Predicate
				/*
				Predicate<Integer> predicateEntero = (num) ->
				(for(int i=0; i < 121212121;i++) {
					(num/121212112 < 11111212)
				)};
				*/
				
				Predicate<Integer> predicateEntero = (num) ->
				(num*121212112 > 11111212) || (num*12126666 > 234234232)
				&&(num/121212112 < 11111212) && (num*12126666 == 234234232)
				&&(num/121212112 > 11111212) || (num*12126666 != 234234232)
				&&(num/121212112 != 11111212) && (num*12126666 == 234234232)
				&&(num/121212112 == 11111212) || (num*12126666 < 234234232)
				&&(num/121212112 != 11111212) && (num*12126666 == 234234232)
				&&(num/121212112 == 11111212) || (num*12126666 < 234234232)
				&&(num/121212112 != 11111212) && (num*12126666 == 234234232)
				&&(num/121212112 == 11111212) || (num*12126666 < 234234232)
				&&(num/121212112 == 11111212) || (num*12126666 < 234234232)
				&&(num/121212112 != 11111212) && (num*12126666 == 234234232)
				&&(num/121212112 == 11111212) || (num*12126666 < 234234232);
			
			
			
				
				boolean resultado01 = predicateEntero.test(121231);
			
				long finIntConLambda = System.nanoTime() - inicio01;
				
				
				//Analisis de tiempo recuperado desde variables, menor margen de error
				
				System.out.println(resultado01);
				
				System.out.println("Duración: " + finIntConLambda+ " nanoSeg / "+finIntConLambda/1000000+" miliSeg");
				
				
				
				//--------------------- NUMERO ENTERO SIN LAMBDA -------------------------
				System.out.println("\n===== NÚMERO ENTERO SIN LAMBDA =======");
				
				long inicio001 = System.nanoTime();
				
				double numEntrada = 121231;
				
				//boolean comparacion = ((numEntrada*121212112) > 11111212) ? true : false;
				/*
				boolean comparacion=false;
				
				if((numEntrada*121212112) > 11111212) {comparacion=true;}
				else {comparacion=false;}
				*/
				
				boolean comparacion=false;
				
				if(
				(numEntrada*121212112 > 11111212) || (numEntrada*12126666 > 234234232)
				&&(numEntrada/121212112 < 11111212) && (numEntrada*12126666 == 234234232)
				&&(numEntrada/121212112 > 11111212) || (numEntrada*12126666 != 234234232)
				&&(numEntrada/121212112 != 11111212) && (numEntrada*12126666 == 234234232)
				&&(numEntrada/121212112 == 11111212) || (numEntrada*12126666 < 234234232)
				&&(numEntrada/121212112 != 11111212) && (numEntrada*12126666 == 234234232)
				&&(numEntrada/121212112 == 11111212) || (numEntrada*12126666 < 234234232)
				&&(numEntrada/121212112 != 11111212) && (numEntrada*12126666 == 234234232)
				&&(numEntrada/121212112 == 11111212) || (numEntrada*12126666 < 234234232)
				&&(numEntrada/121212112 == 11111212) || (numEntrada*12126666 < 234234232)
				&&(numEntrada/121212112 != 11111212) && (numEntrada*12126666 == 234234232)
				&&(numEntrada/121212112 == 11111212) || (numEntrada*12126666 < 234234232)
				
				) {comparacion=true;}
				else {comparacion=false;}
			
				long finIntSinLambda = System.nanoTime() - inicio001;
				
				System.out.println(comparacion);
				
				System.out.println("Duración: " + finIntSinLambda+ " nanoSeg / "+finIntSinLambda/1000000+" miliSeg");
				
				
				
				
				System.out.println("\n============================================");
			
				//--------------------- NUMERO DOUBLE CON LAMBDA-------------------------
				System.out.println("\n===== NÚMERO DOUBLE CON LAMBDA =======");
				
				long inicio02 = System.nanoTime();

				Predicate<Double> multiplPredicateDouble = (num) ->
				(num*121212112d > 11111212d) || (num*12126666 > 234234232d)
				&&(num/121212112d < 11111212d) && (num*12126666 == 234234232d)
				&&(num/121212112d > 11111212d) || (num*12126666 != 234234232d)
				&&(num/121212112d != 11111212d) && (num*12126666 == 234234232d)
				&&(num/121212112d == 11111212d) || (num*12126666 < 234234232d)
				&&(num/121212112d != 11111212d) && (num*12126666 == 234234232d)
				&&(num/121212112d == 11111212d) || (num*12126666 < 234234232d)
				&&(num/121212112d != 11111212d) && (num*12126666 == 234234232d)
				&&(num/121212112d == 11111212d) || (num*12126666 < 234234232d)
				&&(num/121212112d == 11111212d) || (num*12126666 < 234234232d)
				&&(num/121212112d != 11111212d) && (num*12126666 == 234234232d)
				&&(num/121212112d == 11111212d) || (num*12126666 < 234234232d);
			
				boolean resultado02 = multiplPredicateDouble.test(121231d);
			
				long finDoubleConLambda = System.nanoTime() - inicio02;
				
				
				//Analisis de tiempo recuperado desde variables, menor margen de error
				
				System.out.println(resultado02);
				
				System.out.println("Duración: " + finDoubleConLambda+ " nanoSeg / "+finDoubleConLambda/1000000+" miliSeg");
				
				
				//--------------------- NUMERO DOUBLE SIN LAMBDA -------------------------
				System.out.println("\n===== NÚMERO DOUBLE SIN LAMBDA =======");
				
				long inicio002 = System.nanoTime();
				
				double numEntrada02 = 121231d;
				
				//boolean comparacion = ((numEntrada*121212112) > 11111212) ? true : false;
				/*
				boolean comparacion=false;
				
				if((numEntrada*121212112) > 11111212) {comparacion=true;}
				else {comparacion=false;}
				*/
				
				boolean comparacion02=false;
				
				if(
				(numEntrada02*121212112d > 11111212d) || (numEntrada02*12126666d > 234234232d)
				&&(numEntrada02/121212112d < 11111212d) && (numEntrada02*12126666d == 234234232d)
				&&(numEntrada02/121212112d > 11111212d) || (numEntrada02*12126666d != 234234232d)
				&&(numEntrada02/121212112d != 11111212d) && (numEntrada02*12126666d == 234234232d)
				&&(numEntrada02/121212112d == 11111212d) || (numEntrada02*12126666d < 234234232d)
				&&(numEntrada02/121212112d != 11111212d) && (numEntrada02*12126666d == 234234232d)
				&&(numEntrada02/121212112d == 11111212d) || (numEntrada02*12126666d < 234234232d)
				&&(numEntrada02/121212112d != 11111212d) && (numEntrada02*12126666d == 234234232d)
				&&(numEntrada02/121212112d == 11111212d) || (numEntrada02*12126666d < 234234232d)
				&&(numEntrada02/121212112d != 11111212d) && (numEntrada02*12126666d == 234234232d)
				&&(numEntrada02/121212112d == 11111212d) || (numEntrada02*12126666d < 234234232d)
				&&(numEntrada02/121212112d != 11111212d) && (numEntrada02*12126666d == 234234232d)
				
				) {comparacion02=true;}
				else {comparacion02=false;}
			
				long finDoubleSinLambda = System.nanoTime() - inicio002;
				
				System.out.println(comparacion02);
				
				System.out.println("Duración: " + finDoubleSinLambda+ " nanoSeg / "+finDoubleSinLambda/1000000+" miliSeg");
				
				
				
				System.out.println("\n============================================");
				//--------------------- RENDIMIENTO -------------------------
				System.out.println("\n===== DIFERENCIA NÚMERO DOUBLE/ENTERO CON/SIN LAMBDA =======");
				
				//Comprobamos la diferencia y quien es mas grande	
				
				boolean comprConLambda = (finIntConLambda > finDoubleConLambda) ? true : false;
				boolean comprSinLambda = (finIntSinLambda > finDoubleSinLambda) ? true : false;
				
				boolean enteroMasGrandeConLambda = false;
				boolean enteroMasGrandeSinLambda = false;
				
				long variacionConLambda=0;
				long variacionSinLambda=0;
				
				if(comprConLambda) {
					variacionConLambda= finIntConLambda - finDoubleConLambda;
					enteroMasGrandeConLambda = true;
					}
				else {variacionConLambda= finDoubleConLambda - finIntConLambda;}
				
				
				if(comprSinLambda) {
					variacionSinLambda= finIntSinLambda - finDoubleSinLambda;
					enteroMasGrandeSinLambda = true;
					}
				else {variacionSinLambda= finDoubleSinLambda - finIntSinLambda;}
				
				
				if(enteroMasGrandeConLambda) {
					System.out.println("La Lambda Entera tardó "+variacionConLambda+" nanoSeg más que la Lambda Double");
				}else {
					System.out.println("La Lambda Double tardó "+variacionConLambda+" nanoSeg más que la Lambda Entera");
				}
				
				if(enteroMasGrandeSinLambda) {
					System.out.println("La Operación Entera tardó "+variacionSinLambda+" nanoSeg más que la Operación Double");
				}else {
					System.out.println("La Operación Double tardó "+variacionSinLambda+" nanoSeg más que la Operación Entera");
				}
				
				
				
				/*
				 * ACLARACIONES: SE SABE QUE UN ENTERO PESA MENOS EN MEMORIA QUE UN DECIMAL
				 * Y EN SISTEMAS DIGITALES PARA COMPUTADORAS UN ENTERO ES REPRESENTADO POR 
				 * UN NUMERO DE PUNTO FIJO Y UN DECIMAL POR UN NUMERO DE PUNTO FLOTANTE
				 * a) precisión simple: F(2, 24, −125, 128) implementado en una longitud de palabra N = 32 bits,
					b) precisión doble: F(2, 53, −1021, 1024) implementado en una longitud de palabra N = 64 bits

				 * https://www.dsi.fceia.unr.edu.ar/downloads/digital_II/representacion2008.pdf
				 * https://www.famaf.unc.edu.ar/~vmarconi/fiscomp/representacion-numeros.pdf
				 * 
				 * RECOMIENDO..
				 * https://programmerclick.com/article/7505611111/
				 * 
				 * SE ANALIZARON VARIAS COMPROBACIONES ENTRE TIPOS DE DATOS Y CANTIDAD DE
				 * PROCESOS NUMERICOS, ES IMPORTANTE SABER QUE POR ASUNTOS DE OPTIMIZACION
				 * Y RENDIMIENTOS,(POR LO QUE SÉ) LA GRAN MAYORIA DE LOS LENGUAJES Y SISTEMAS
				 * ADOPTAN UN METODO DE EXPRESION DE NUMERO DE PUNTO FLOTANTE PARA PUNTOS FIJOS.
				 * ENTONCES JAVA PROCESA MÁS RAPIDO NUMEROS DECIMALES QUE 
				 * ENTEROS. POR ENDE PARA LOS CASOS DE TENER O NO LAMBAS SIEMPRE SERA MÁS
				 * RAPIDO EL USO DE DECIMALES. HAY ALGUNAS DUDAS QUE SIGO TENIENDO DE IGUAL FORMA
				 * 
				 * ¿SERA QUE JAVA GESTIONA MAS RAPIDO LOS DECIMALES POR UNA DE SUS CAUSAS
				 * QUE AL TRABAJAR CON DECIMALES TENEMOS UNA COMBINACION DISPONIBLE MAS
				 * GRANDE QUE CON ENTEROS?, POR ENDE CASI NUNCA LLEGAMOS A LOS LIMITES DE LOS
				 * VALORES MAXIMOS EN DECIMALES Y ENTEROS SI, POR ESO SERIA MAS RAPIDO..
				 * 
				 * ¿OTRA CAUSA PODRIA SER QUE NATURALMENTE UN DECIMAL AL OCUPAR MAS ESPACIO
				 * EN MEMORIA QUE UN ENTERO TENGA MAYOR IMPORTANCIA EN CALCULO ARITMETICO
				 * POR PARTE DEL PROCESADOR PARA OPERACIONES QUE ENTEROS, POR ENDE LOS PROCESADORES
				 * MODERNO ENFATIZAN EN ELLO?? 
				 * 
				 * 
				 * PODEMOS VERIFICAR CON ITERACIONES PARA ENTEROS Y DECIMALES
				 * 
				 * long inicio01 = System.nanoTime();
				
				int num = 12312;
				for (int i = 0; i < 1000000; i++) {
					int res = num * 12121212;
				}

				long fin = System.nanoTime() - inicio01;

				System.out.println("Duración: " + fin + " nanoSeg / " + fin / 1000000 + " miliSeg");

				
				
				
				
			long inicio02 = System.nanoTime();
				
				double num02 = 12312d;
				for (int i = 0; i < 1000000; i++) {
					double res = num02 * 12121212d;
				}

				long fin02 = System.nanoTime() - inicio02;

				System.out.println("Duración: " + fin02 + " nanoSeg / " + fin02 / 1000000 + " miliSeg");

				
				 * 
				 * 
				 * 
				
				 *  
				 * PODEMOS CONCLUIR QUE AUMENTANDO EL NUMERO DE OPERACIONES Y PESO NUMERICO
				 * LA PROGRAMACION FUNCIONAL ES MUCHISIMO MAS LENTA QUE LA ESTRUCTURA PARA
				 * MANEJO DE ENTEROS QUE DECIMALES. ES EVIDENTE QUE ES POCO EFICIENTE EL USO
				 * DE WRAPPERS(LADO DE LA PROG FUNCIONAL) COMPARADO CON TIPOS NATIVOS, POR 
				 * ENDE EL TIEMPO DE PROCECESAMIENTO NATURALEMNTE SERA MAS LENTO
				 * 
				 * DEDE EL PUNTO DE VISTA POSITIVO, LA FUNCIONAL APLICA UN CODIGO MAS LIMPIO
				 *  Y REUTILIZABLE. SE DEBERIA ANALIZAR CON EL GC Y COMPARANDO MAS VARIABLES Y
				 *  OBJETOS
				 * 
				 * */
				
				
		
		
		
		
		
		
		
		
		
	}

}
