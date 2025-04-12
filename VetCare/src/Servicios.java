public class Servicios {
    private String nombre;
    private int codigo;
    private String descripcion;
    private int costo;
    private String duracion;
    private String restriccion;

    public Servicios(String _nombre, int _codigo, String _descripcion, int _costo, String _duracion, String _restriccion) {
        this.nombre = _nombre;
        this.codigo = _codigo;
        this.descripcion = _descripcion;
        this.costo = _costo;
        this.duracion = _duracion;
        this.restriccion = _restriccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(String restriccion) {
        this.restriccion = restriccion;
    }
    
}
