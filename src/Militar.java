/**
 * 
 */

/**
 * @author chavez
 *
 */

// CC2006, Lab 4
// Una clase para representar a los militares en general.

/**
 * @author chavez
 *
 */
public class Militar {
	
    /**
     * @return las horas que trabaja
     */
    public int getHoras() {
        return 40;           // trabaja 40 horas / semana
    }
    
    /**
     * @return el salario
     */
    public double getSalario() {
        return 40000.0;      // Q40,000.00 / anio
    }
    
    /**
     * @return los dias de vacaciones
     */
    public int getDiasVacaciones() {
        return 10;           // 2 semanas de vacaciones pagadas
    }

    /**
     * @return color del formulario
     */
    public String getFormularioVacaciones() {
        return "amarillo";     // use el formulario amarillo
    }
}
