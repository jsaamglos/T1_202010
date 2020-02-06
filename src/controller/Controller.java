package controller;

import java.util.Scanner;

import model.logic.Modelo;
import view.View;

public class Controller {

	/* Instancia del Modelo */
	private Modelo modelo;

	/* Instancia de la Vista */
	private View view;

	/**
	 * Crear la vista y el modelo del proyecto
	 * 
	 * @param capacidad
	 *            tamaNo inicial del arreglo
	 */
	public Controller() {
		view = new View();
		modelo = new Modelo();
	}

	public void run() {
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		int dato = 0;
		String respuesta = "";

		while (!fin) {
			view.printMenu();

			int option = lector.nextInt();
			switch (option) {
			case 1:
				view.printMessage("--------- \nCargar Datos \nDar cantidad de datos cargados: ");
				int capacidad = lector.nextInt();
				modelo = new Modelo();
				view.printMessage("Se cargaron los Comparendos");
				view.printMessage("Numero actual de elementos " + modelo.darTamano() + "\n---------");
				break;

			case 3:
				view.printMessage("--------- \nDar OBJECTID a buscar: ");
				dato = Integer.parseInt(lector.next());
				respuesta = modelo.buscar(dato);
				if (respuesta != null) {
					view.printMessage("Dato encontrado: " + respuesta);
				} else {
					view.printMessage("Dato NO encontrado");
				}
				view.printMessage("Numero actual de elementos " + modelo.darTamano() + "\n---------");
				break;

			case 4:
				view.printMessage("--------- \nDar cadena (simple) a eliminar: ");
				dato = Integer.parseInt(lector.next());
				if (respuesta != null) {
					view.printMessage("Dato eliminado " + respuesta);
				} else {
					view.printMessage("Dato NO eliminado");
				}
				view.printMessage("Numero actual de elementos " + modelo.darTamano() + "\n---------");
				break;



			case 6:
				view.printMessage("--------- \n Hasta pronto !! \n---------");
				lector.close();
				fin = true;
				break;

			default:
				view.printMessage("--------- \n Opcion Invalida !! \n---------");
				break;
			}
		}

	}
}
