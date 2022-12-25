package lambdas.proveedoras;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class LambdasProveedorasBanner {
	
	public static void main(String[] args) {
	
//http://www.java2s.com/Tutorials/Java/java.util.function/Supplier/index.htm
		
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		int dia = localDateTime.getDayOfMonth();
		int mes = localDateTime.getMonthValue();
		int anio = localDateTime.getYear();
		int hours  = localDateTime.getHour();
		int minutes = localDateTime.getMinute();
		int seconds = localDateTime.getSecond();
		 
	
		Supplier<String> bannerIngreso= ()->
			"\n=== Bienvenido/a al Sistema de Gestión ====\n"
			+"\n | Fecha de Ingreso --> "+dia
			+"/"+mes
			+"/"+anio+" |"
			+"\n | Horario de Ingreso --> "+hours
			+":"+minutes
			+":"+seconds + " |";
			
		Supplier<String> operacionFallida= ()->
			"\n=== Operación Fallida ====\n"
			+"\n | Fecha --> "+dia
			+"/"+mes
			+"/"+anio+" |"
			+"\n | Horario--> "+hours
			+":"+minutes
			+":"+seconds + " |";	
			
			
			
		try {
			System.out.println(bannerIngreso.get());
			
			int x= 4/0;
			
		} catch (Exception e) {

			System.out.println(operacionFallida.get().toString());
			
			e.printStackTrace();
		}	
		
		
		
	}
	

}
