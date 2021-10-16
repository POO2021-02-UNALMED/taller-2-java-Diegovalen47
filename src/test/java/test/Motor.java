package test;

public class Motor 
{
	
	int numeroCilindros;
	String tipo;
	int registro;
	
	public void cambiarRegistro(int registro) 
	{
		this.registro = registro;
		return;
	}
	
	public void asignarTipo(String tipo) 
	{
		if (tipo.equalsIgnoreCase("electrico")) 
		{
			this.tipo = tipo;
		} 
		else if (tipo.equalsIgnoreCase("gasolina")) 
		{
			this.tipo = tipo;
		}
		return;
	}
}
