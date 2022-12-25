package lambdas.proveedoras;

import java.util.function.Supplier;

public class LambdasProveedorasObjetos {
	
	public static void main(String[] args) {
		
		Cliente objeto = new Cliente(1,"Jaime","Gomez");
		
		
		Supplier<String> cliente01=() -> objeto.toString();
		
		Supplier<String> cliente01Formato=() -> 
			"\n=== Información del Cliente ====\n"
			+"\n | ID : " + objeto.getId()
			+"\n | Nombre : " + objeto.getNombre()
			+"\n | Apellido : " + objeto.getApellido();
		
		
		
		Supplier<Cliente> cliente02=() -> new Cliente(2,"Marcela","Gutierrez");
		
		
		
		
		System.out.println("\n-------------------------");
		
		System.out.println(cliente01.get());
		
		System.out.println(cliente01Formato.get());
		
		System.out.println("\n-------------------------");
		
		System.out.println(cliente02.get());
		System.out.println("\n-------------------------");
		
		System.out.println(cliente02.get());
		
		
		
		
		
		
		Cliente objeto02 = new Cliente(3,"Alvaro","Paez");
		Cliente objeto03 = new Cliente(4,"Julieta","Castro");
		
		
		Supplier<String> clientes=() ->
		"\n=== Clientes ====\n"
		+"\n=== Información del Cliente03 ====\n"
		+"\n | ID : " + objeto02.getId()
		+"\n | Nombre : " + objeto02.getNombre()
		+"\n | Apellido : " + objeto02.getApellido()
		+"\n\n=== Información del Cliente04 ====\n"
		+"\n | ID : " + objeto03.getId()
		+"\n | Nombre : " + objeto03.getNombre()
		+"\n | Apellido : " + objeto03.getApellido();
	
		
		Supplier<String> clientesResumido=() ->
		"\n=== Clientes ====\n"
		+objeto02.toString()
		+"\n"
		+objeto03.toString();
	
		
		System.out.println("\n-------------------------");
		
		System.out.println(clientes.get());
		
		System.out.println("\n-------------------------");
		
		System.out.println(clientesResumido.get());
		
		
		
		
		
		
		
		
		
	}
	
	
		
		
	}
class Cliente{

	int id;
	String nombre;
	String apellido;
	
	
	public Cliente() {
		
	};
	
	public Cliente(int id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	

}
