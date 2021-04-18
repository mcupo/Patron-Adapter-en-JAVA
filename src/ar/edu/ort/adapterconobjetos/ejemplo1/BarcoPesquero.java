package ar.edu.ort.adapterconobjetos.ejemplo1;

//Clase Adaptable
public class BarcoPesquero implements BarcoAMotor{

	@Override
	public void navegar() {
		System.out.println("El barco pesquero esta navegando");
	}
}