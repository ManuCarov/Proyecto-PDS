public class Ofertas {
    private String nombre;
    private String ubicacion;
    private String requisito;
    private String palabras;
    private String descripcion;


    public Ofertas(String nombre, String ubicacion, String requisito, String palabras, String descripcion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.requisito = requisito;
        this.palabras = palabras;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public String getPalabras() {
        return palabras;
    }

    public void setPalabras(String palabras) {
        this.palabras = palabras;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
