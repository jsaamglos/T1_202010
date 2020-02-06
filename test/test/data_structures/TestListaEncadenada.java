package test.data_structures;

import model.data_structures.ListaEncadenada;

public class TestListaEncadenada
{
    ListaEncadenada<String> lista;

    public TestListaEncadenada()
    {

    }

    public void setUp1()
    {
        lista = new ListaEncadenada<String>();
    }

    public void setUp2()
    {
        lista = new ListaEncadenada<String>();
        lista.agregarElemento("Primero");
        lista.agregarElemento("Segundo");
        lista.agregarElemento("Tercero");
    }

    
}