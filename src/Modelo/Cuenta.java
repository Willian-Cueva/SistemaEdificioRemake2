package Modelo;

public class Cuenta {
    private long id;
    private String usario;
    private String clave;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsario() {
        return usario;
    }

    public void setUsario(String usario) {
        this.usario = usario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+": "+id+" "+usario+" "+clave;
    } 
}
