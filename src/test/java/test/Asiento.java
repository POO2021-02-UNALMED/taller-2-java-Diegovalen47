package test;

public class Asiento 
{
	
	String color;
	int precio;
	int registro;
	
	public void cambiarColor(String color) 
	{
		
		if (color.equalsIgnoreCase("rojo")) 
		{
			this.color = color;
		} 
		else if (color.equalsIgnoreCase("verde")) 
		{
			this.color = color;
		}
		else if (color.equalsIgnoreCase("amarillo")) 
		{
			this.color = color;
		}
		else if (color.equalsIgnoreCase("negro")) 
		{
			this.color = color;
		}
		else if (color.equalsIgnoreCase("blanco")) 
		{
			this.color = color;
		}
		
		return;
	}
	
}
