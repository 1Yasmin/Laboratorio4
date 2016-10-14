/**
 * 
 */

/**
 * @author chavez
 *
 *Ejercicio 3
 *Utiliza las clases de alarma y timbre que nos dieron
 *
 *
 *
 */
public class AlarmaEmergencia extends Alarma2{

	public void m1() {
		System.out.println("emergencia 1");
 }
	
	public void m2() {
		super.m1();
		super.m2();
		
 }
	
	 public String toString() {
		 String cadena = "Emergencia  "+ super.toString();
		 return cadena;
	 }
	
}
