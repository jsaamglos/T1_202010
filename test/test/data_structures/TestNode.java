package test.data_structures;

import model.data_structures.Node;

public class TestNode
{
    private Node<String> nodo;

    public TestNode()
    {
        
    }

    public void  setUp1()
    {
        nodo = new Node<String>("Test1", null);
    }

    public void setUp2()
    {
        nodo = new Node<String>("Test2", new Node<String>("anterior", null));
        new Node<String>("siguiente", nodo);
    }

}