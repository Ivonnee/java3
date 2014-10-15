

package isg.nomina;

/**
 *
 * @author T
 */
public class Nomina {
    private Trabajador t;

    public Nomina(Trabajador t) {
        this.t = t;
    }

    public Nomina() {
    }
    
    
    public float pagarnomina(){
        float pago=t.getHorastrabajadas()*t.getSueldobase();
    System.out.println("Se pago la noina d "+t.getNombre()+" por "+pago);
    return pago; 
    } 
    
}
