package Modelo;

public class Habitacion {
    private long id;
    private int piso, capacidad;
    private float precio;
    private String obsevacion;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getObsevacion() {
        return obsevacion;
    }

    public void setObsevacion(String obsevacion) {
        this.obsevacion = obsevacion;
    }
}
