public class Node <T>
{
    //apuntador al siguiente elemento
    private Node siguienteElemento;

    //apuntador al elemento anterior
    private Node anteriorElamento;

    //elemento
    private T elemento;

    //constructor
    public Node(T elemento, Node anterior)
    {
        this.elemento = elemento;
        anteriorElamento = anterior;
        anterior.setSiguiente(this);
    }

    //da el elemento siguiente
    public Node getSiguiente()
    {
        return siguienteElemento;
    }

    //da el elemento anterior
    public Node getAnterior()
    {
        return anteriorElamento;
    }

    //agrega el siguiente
    public void setSiguiente(Node nodo)
    {
        siguiente = nodo;
    }

    //agrega el anterior
    public void setAnterior(Node nodo)
    {
        anterior = nodo;
    }

    //returna el elemento
    public T getElemento()
    {
        return elemento;
    }

}