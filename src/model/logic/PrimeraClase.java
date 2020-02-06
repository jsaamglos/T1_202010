package model.logic;

import model.data_structures.ListaEncadenada;

public class PrimeraClase {
	private String type;
	private ListaEncadenada<Multa> features;
	private String nombre;
	private String crs;

	public PrimeraClase(String pType, ListaEncadenada<Multa> features, String pNombre, String pCrs) {
		type = pType;
		features = new ListaEncadenada<Multa>();
		nombre = pNombre;
		crs = pCrs;
	}

	public ListaEncadenada<Multa> getLista()
	{
		return features;
	}

	public String getType()
	{
		return type;
	}

	public String getNombre()
	{
		return nombre;
	}

	public String getCrs()
	{
		return crs;
	}
}
