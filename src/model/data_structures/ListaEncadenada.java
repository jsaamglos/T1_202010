public class ListaEncadenada <T>
{
    //apuntador a primer elemento
    private Node<T> primerElemento;

    //apuntador a ultimo elemento
    private Node<T> ultimoElemento;

    //tamaño de la lista    
    private int tamaño;

    //constructor
    public ListaEncadenada()
    {
        tamaño = 0;
    }

    //agrega un elemento
    public void agregarElemento(T dato)
    {
        
        if(primerElemento == null)
        {
            Node nodo = new Node(dato, null);
            //agrega el nodo como ultimo y primer elemento
            primerElemento = nodo;
            ultimoElemento = nodo;
        }else
        {
            //pone el elemento al final de la fila
            ultimoElemento = new Node(ultimoElemento);
            ultimoElemento = nodo;
        }

        //incrementa el tamaño
        tamaño++;
    }

    //retorna el tamaño de la lista 
    public int darTamaño()
    {
        return tamaño;
    }

    //retorna el elemento dado por parametro
    public boolean existeElemento(T dato)
    {
        //crea nodo igual al primer elemento
        Node nodo = primerElemento;

        //itera los elementos hasta que se acaben o encuentre el elemento
        while(nodo != null && !nodo.getElemento().equals(dato))
        {
            nodo = nodo.getSiguiente();
        }

        //retorna true si encontro el elemento
        return nodo != null;
    }

    public void eliminarElemento(T dato)
    {
        //crea nodo igual al primer elemento
        Node nodo = primerElemento;

        //itera los elementos hasta que se acaben o encuentre el elemento
        while(nodo != null && !nodo.getElemento().equals(dato))
        {
            nodo = nodo.getSiguiente();
        }

        //se encontro el nodo?
        if(nodo != null)
        {
            //borra el nodo de la existencia
            nodo.getAnterior().setSiguiente(nodo.getSiguiente());
            nodo.getSiguiente().setAnterior(nodo.getAnterior());

            //baja en uno el tamaño
            tamaño--;

        }else
        {
            //Bruh, no esta el nodo
            System.out.println("No se encontro el elemento a eliminar.");
        }

    }

    //existen elementos en la lista?
    public boolean isEmpty()
    {
        return tamaño == 0;
    }

    //retorna primer elemento
    public T darPrimerElemento()
    {
        return primerElemento.darElemento();
    }

    //retorna ultimo elemento
    public T darUltimoElemento()
    {
        return ultimoElemento.darElemento();
    }

}