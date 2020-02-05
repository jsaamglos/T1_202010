package model.data_structures;

public interface IListaEncadenada<T> {

	/**
	 * Retornar el numero de elementos presentes en la lista.
	 * 
	 * @return
	 */
	public int darTamano();

	/**
	 * Retornar el elemento en la posicion i
	 * 
	 * @param i
	 *            posicion de consulta
	 * @return elemento de consulta. null si no hay elemento en posicion.
	 */
	public T darElemento(T dato);

	/**
	 * Se agrega un nuevo elemento a la lista
	 * 
	 * @param dato
	 *            nuevo elemento
	 */
	public void agregarElemento(T dato);

	/**
	 * Buscar un dato en la lista.
	 * 
	 * @param dato
	 *            Objeto de busqueda en el lista
	 * @return elemento encontrado en la lista (si existe). null si no se
	 *         encontro el dato.
	 */
	public T buscarElemento(T dato);

	/**
	 * Eliminar un dato de la lista..
	 * 
	 * @param dato
	 *            Objeto de eliminacion en la lista.
	 */
	public void eliminarElemento(T dato);

	/**
	 * Verifica si la lista esta vacia
	 * 
	 * @return True si esta vacia, False de lo contrario
	 */
	public boolean isEmpty();

	/**
	 * Retorna el primer elemento de la lista.
	 * 
	 * @return El primer elemento de la lista.
	 */
	public T darPrimerElemento();

	/**
	 * Retorna el ultimo elemento de la lista.
	 * 
	 * @return El ultimo elemento de la lista.
	 */
	public T darUltimoElemento();

	/**
	 * A�ade un elemento en la primera posicion de la lista.
	 * 
	 * @param dato
	 *            El nuevo elemento que se va a a�adir.
	 */
	public void setPrimero(T dato);

	/**
	 * A�ade un elemento en la ultima posicion de la lista.
	 * 
	 * @param dato
	 *            El elemento que se quiere a�adir.
	 */
	public void setUltimo(T dato);

	/**
	 * Se elimina el primer elemento de la lista y se retorna el que ahora es el
	 * primer elemento
	 * 
	 * @return El nuevo elemento que ahora es el primero (nulo si la lista es
	 *         vacia.)
	 */
	public T eliminarPrimero();

	/**
	 * Se elimina el ultimo elemento de la lista y se retorna el que ahora es el
	 * ultimo elemento
	 * 
	 * @return El nuevo elemento que ahora es el ultimo (nulo si la lista es
	 *         vacia.)
	 */
	public T eliminarUltimo();

}
