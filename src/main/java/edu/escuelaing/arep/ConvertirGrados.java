package edu.escuelaing.arep;

/*
 * Clase que se encarga de realizar la operacion de conversion
 * Autor: Carlos Amorocho
 */
public class ConvertirGrados 
{

	/*
	 * Realiza la conversion a grados Celsius
	 * @Param fahrenheit Valor en grados Fahrenheit que se desea convertir
	 * @Return Devuelve el respectivo valor en grados Celsius
	 */
	public static double celsius(double fahrenheit)
	{
		double celsius = (fahrenheit-32)*(0.5556);
        return celsius;
	}
}
