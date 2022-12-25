package lambdas.predicados;

import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class LambdasTipoPredicadosObjetosCompleted {

	public static void main(String[] args) {

		Notebook notebook01 = new Notebook(1, "IdeaPad 3i", "Lenovo");
		Notebook notebook02 = new Notebook(2, "Notebook HP Pavilion", "HP");

		// ----------------------------------------------------------------

		Predicate<Integer> notebook01Id = id -> (id == notebook01.getId());
		Predicate<Integer> notebook02Id = id -> (id == notebook02.getId());

		System.out.println("\n == COMPARACION DE ID'S ==");
		System.out.println(notebook01Id.test(1));
		System.out.println(notebook02Id.test(2));

		// ----------------------------------------------------------------

		Predicate<String> notebook01Nombre = nombre -> (nombre == notebook01.getNombre());
		Predicate<String> notebook02Nombre = nombre -> (nombre == notebook02.getNombre());

		System.out.println("\n == COMPARACION DE Nombres ==");
		System.out.println(notebook01Nombre.test("IdeaPad 3i"));
		System.out.println(notebook02Nombre.test("Notebook HP Pavilion"));
		// ----------------------------------------------------------------

		Predicate<Notebook> notebook01Pred = obj -> (obj == notebook01);
		Predicate<Notebook> notebook02Pred = obj -> (obj == notebook02);

		System.out.println("\n == COMPARACION DE OBJETOS == ");

		System.out.println(notebook01Pred.test(notebook01));
		System.out.println(notebook02Pred.test(notebook02));

		// PODRIAMOS OBTENER LA DIRECCION DE MEMORIA EN LA QUE APUNTA LAS REFERENCIAS
		// DE LOS OBJETOS, PERO EN JAVA NO TIENE SENTIDO, YA QUE LA JVM JUNTO CON
		// EL GC LOS TRABAJA DE FORMA DINAMICA Y EN TIEMPO DE EJEC. OSEA LOS MUEVE
		// Y LOS ELIMINA COMO LES SEA MAS EFICIENTE.

		// ----------------------------------------------------------------

		// ----------------------------------------------------------------

	}

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Notebook {
	int id;
	String nombre;
	String marca;
}
