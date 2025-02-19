package principal;
import logica.Automovil;
import logica.Vehiculo;
import logica.Motocicleta;

public class Principal
{

	public static void main(String[] args)
	{	
		Vehiculo automovil = new Automovil(100, 50, 200);
		Vehiculo motocicleta = new Motocicleta(100, 50, 200);
		
		System.out.println("La autonomia del automovil es: " + automovil.calcularAutonomia() + " km");
		System.out.println("La autonomia de la motocicleta es: " + motocicleta.calcularAutonomia() + " km");
	}

}
