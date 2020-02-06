package model.logic;

import model.data_structures.ArregloDinamico;
import model.data_structures.IListaEncadenada;
import model.data_structures.ListaEncadenada;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
	/**
	 * Atributos del modelo del mundo
	 */
	private IListaEncadenada datos;

	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo() {
		datos = new ListaEncadenada();
	}

	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo
	 * 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano() {
		return datos.darTamano();
	}

	/**
	 * Requerimiento de agregar dato
	 * 
	 * @param dato
	 */
	public void agregar(String dato) {
		datos.agregarElemento(dato);
	}

	/**
	 * Requerimiento buscar dato
	 * 
	 * @param dato
	 *            Dato a buscar
	 * @return dato encontrado
	 */
	public String buscar(String dato) {
		return datos.existeElemento(dato);
	}

	/**
	 * Requerimiento eliminar dato
	 * 
	 * @param dato
	 *            Dato a eliminar
	 * @return dato eliminado
	 */
	public void eliminar(String dato) {
		datos.eliminarElemento(dato);
	}

}
