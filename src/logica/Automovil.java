package logica;

public class Automovil extends Vehiculo{
	
	public Automovil(double cilindraje, double peso, double tamanoTanque)
	{
		super(cilindraje, peso, tamanoTanque);
	}
	
	@Override
	public double calcularAutonomia()
	{
		return (15*10*10*10*10 / (this.cilindraje + peso)) * tamanoTanque;
	}
}
