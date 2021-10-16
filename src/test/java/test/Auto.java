package test;

public class Auto 
{
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	
	public int cantidadAsientos() 
	{
		return this.asientos.length;
	}
	
	public String verificarIntegridad() 
	{
		
		if (motor.registro != this.registro) 
		{
			return "Las piezas no son originales";
		}
		for (int i = 0; i < this.asientos.length; i++ ) 
		{
			if (asientos[i].registro != this.registro) 
			{
				return "Las piezas no son originales";
			}
		}
		
		return "Auto original";
	} 
}
