/**
 * 
 */

/**
 * @author chavez
 *
 */
public class Soldado extends Militar {

	   	/* (non-Javadoc)
	    * @see Militar#getHoras()
	 	*/
		public int getHoras() {
	        return super.getHoras()*2; // trabaja el  doble que el militar 
	    }
	    
	    /* (non-Javadoc)
	     * @see Militar#getSalario()
	     */
	    public double getSalario() {
	        return super.getSalario()-10000; // Q30,000.00 / anio
	    }
	    
	    /* (non-Javadoc)
	     * @see Militar#getDiasVacaciones()
	     */
	    public int getDiasVacaciones() {
	        return super.getDiasVacaciones()/2;  // 5 dias de vacaciones pagadas
	    }

	    /**
	     * 
	     */
	    public void recibeOrden(){
	    	System.out.println("Ordene mi General");
	    }
	
}
