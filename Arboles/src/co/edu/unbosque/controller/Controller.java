package co.edu.unbosque.controller;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.view.View;

public class Controller {
	
	private ClaseX m;
	private View gui;
	
	public Controller() {
		m = new ClaseX();
		gui = new View();
		funcionar();
	}
	
	public void funcionar() {
		m.crearABB();
		//gui.mostrarPreorden(m.getAb().getRaiz());
		//gui.mostrarInorden(m.getAb().getRaiz());
		gui.mostrarPosorden(m.getAb().getRaiz());
	}
}
