package lambdas.consumidoras;


public class LambdasTipoConsumidorasListasStreamFilterMapClaseCompras {
public static void main(String[] args) {
	
	
	
	
	
	
}

//PRIMERAMENTE CAMBIE EL EMPAQUETAMIENTO DEL CURSO A MAVEN
/*
 * 1)Clic der sobre el proyecto->Configure->convert to maven proyect
 * 2)DEjamos todo por defecto MENOS EL PACKAGIN, LO CAMBIAMOS A POM
 * 3)Esperamos que reconfigure todo e importamos lombok
 * */

//PARA DESCARGAR Y CONFIGURAR LOMBOK EN ECLIPSE ...
//https://programmerclick.com/article/95721584982/
	
//LUEGO AÑADIMES EL .JAR AL PROYECTO A TRAVES DEL POM.XML
/*1)BUSCAMOS PROYECT LOMBOK (EL XML) EN MAVEN REPOSITORIES
 * 2)
 * <!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.24</version>
    <scope>provided</scope>
</dependency>

3)Copiar y pegar el xml en el pom


4)Solucion de algunos problemas en eclipse
https://stackoverflow.com/questions/45461777/lombok-problems-with-eclipse-oxygen
 *  
 * */


class Compras {

	int id;
	String categoria;
	String producto;
	int cantidad;
	double precio;

	public Compras(int id, String categoria, String producto, int cantidad, double precio) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Compras() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Compras [id=" + id + ", categoria=" + categoria + ", producto=" + producto + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}

}

}