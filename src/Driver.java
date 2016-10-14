/**
 * 
 */

/**
 * @author chavez
 *
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldado miSoldado = new Soldado();
		Militar miMilitar = new Militar();
		
		System.out.println("Horas del general: "+miMilitar.getHoras());
		System.out.println("Horas del soldado: "+miSoldado.getHoras());
		
		System.out.println("Salario del general: "+miMilitar.getSalario());
		System.out.println("Salario del general: "+miSoldado.getSalario());
		
		System.out.println("Dias de vacaciones del general: "+miMilitar.getDiasVacaciones());
		System.out.println("Dias de vacaciones del soldado: "+miSoldado.getDiasVacaciones());
		

		System.out.println("Método del general que no utiliza soldado: "+miMilitar.getFormularioVacaciones());
		
		System.out.println("Metodo propio del soldado: ");
				miSoldado.recibeOrden();

		
		
	}

}
