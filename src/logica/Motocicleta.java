package logica;

public class Motocicleta extends Vehiculo
{
	
	public Motocicleta(double cilindraje, double peso, double tamanoTanque)
	{
		super(cilindraje, peso, tamanoTanque);
	}
	
	@Override
	public double calcularAutonomia()
	{
		return (8*10*10*10*10 / (cilindraje + 2*peso)) * tamanoTanque;
	}
}
