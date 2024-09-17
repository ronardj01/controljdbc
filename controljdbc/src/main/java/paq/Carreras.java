package paq;

/**
 *
 * @author luisa
 */
public class Carreras {

    // Atributos
    private int idcarreras;
    private String carrera;

    // Constructor
    public Carreras() {
        //vacio
    }

    public Carreras(String carrera) {
        this.carrera = carrera;
    }
    
    //Getters
    public int getIdcarreras() {
        return idcarreras;
    }

    public String getCarrera() {
        return carrera;
    }
    
    //setters

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    //Métodos

    @Override
    public String toString() {
        return "Carreras{" + "idcarreras=" + idcarreras + ", carrera=" + carrera + '}';
    }
    
}
