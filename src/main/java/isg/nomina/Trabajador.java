

package isg.nomina;


/**
 *
 * @author T
 */
public class Trabajador {
private int id;
private String nombre;
private int  horastrabajadas;
private float sueldobase;

    public Trabajador() {
    }

    public Trabajador(int id, String nombre, int horastrabajadas, float sueldobase) {
        this.id = id;
        this.nombre = nombre;
        this.horastrabajadas = horastrabajadas;
        this.sueldobase = sueldobase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public float getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(float sueldobase) {
        this.sueldobase = sueldobase;
    }


}