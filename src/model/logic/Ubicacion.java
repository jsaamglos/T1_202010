package model.logic;

import java.util.List;

public class Ubicacion {
	private String type;
	private List<Double> coord;

	public Ubicacion(String pType, List<Double> pCoord) {

		type = pType;
		coord = pCoord;

	}

}
