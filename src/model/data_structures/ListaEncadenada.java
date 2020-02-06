package model.data_structures;

import java.util.Iterator;

public class ListaEncadenada<T> implements IListaEncadenada<T>, Iterable<T> {
    // apuntador a primer elemento
    private Node<T> primerElemento;

    // apuntador a ultimo elemento
    private Node<T> ultimoElemento;

    // tamano de la lista
    private int tamano;

    // constructor
    public ListaEncadenada() {
        tamano = 0;
    }

    // agrega un elemento
    public void agregarElemento(T dato) {

        if (primerElemento == null) {
            Node<T> nodo = new Node<T>(dato, null);
            // agrega el nodo como ultimo y primer elemento
            primerElemento = nodo;
            ultimoElemento = nodo;
        } else {
            // pone el elemento al final de la fila
            ultimoElemento = new Node<T>(dato, ultimoElemento);
        }

        // incrementa el tamano
        tamano++;
    }

    // retorna el tamano de la lista
    public int darTamano() {
        return tamano;
    }

    // retorna el elemento dado por parametro
    public boolean existeElemento(T dato) {
        // crea nodo igual al primer elemento
        Node<T> nodo = primerElemento;

        // itera los elementos hasta que se acaben o encuentre el elemento
        while (nodo != null && !nodo.getElemento().equals(dato)) {
            nodo = nodo.getSiguiente();
        }

        // retorna true si encontro el elemento
        return nodo != null;
    }

    public void eliminarElemento(T dato) {
        // crea nodo igual al primer elemento
        Node<T> nodo = primerElemento;

        // itera los elementos hasta que se acaben o encuentre el elemento
        while (nodo != null && !nodo.getElemento().equals(dato)) {
            nodo = nodo.getSiguiente();
        }

        // se encontro el nodo?
        if (nodo != null) {
            // borra el nodo de la existencia
            nodo.getAnterior().setSiguiente(nodo.getSiguiente());
            nodo.getSiguiente().setAnterior(nodo.getAnterior());

            // baja en uno el tamano
            tamano--;

        } else {
            // Bruh, no esta el nodo
            System.out.println("No se encontro el elemento a eliminar.");
        }

    }

    // existen elementos en la lista?
    public boolean isEmpty() {
        return tamano == 0;
    }

    // retorna primer elemento
    public T darPrimerElemento() {
        return primerElemento.getElemento();
    }

    // retorna ultimo elemento
    public T darUltimoElemento() {
        return ultimoElemento.getElemento();
    }

    //metodo de iterador
    @Override
    public Iterator<T> iterator() 
    {
        //crea iterador
        Iterator<T> i = new Iterator<T>()
        {
            private Node<T> actual;

            //metodo para saber si existe un siguiente
            @Override
            public boolean hasNext() {
            
                return actual.getSiguiente() != null;
            
            }

            //metodo para sacar el siguiente
            @Override
            public T next() {
            
                if(actual == null)
                {
                    actual = primerElemento;
                }else
                {
                    actual = actual.getSiguiente();
                }
              
                return actual.getElemento();
            }
        };

        //retorna el iterador
        return i;
    }

}