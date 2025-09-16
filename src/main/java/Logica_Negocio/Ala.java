
package Logica_Negocio;

/**
 *
 * @author Santiago Lopez
 */
public class Ala {

    public String posicion;
    public String tamaño;

    public Ala() {
    }

    public Ala(String posicion, String tamaño) {
        this.posicion = posicion;
        this.tamaño = tamaño;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
