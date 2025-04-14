import java.util.ArrayList;

public class Dueño {
    private String nombre;
    private String rut;
    private String correo;
    private String direccion;
    private int telefono;
    private ArrayList<Mascota> mascotas;

    public Dueño(String _nombre, String _rut, String _correo, String _direccion, int _telefono) {
        this.nombre = _nombre;
        this.rut = _rut;
        this.correo = _correo;
        this.direccion = _direccion;
        this.telefono = _telefono;
        this.mascotas = new ArrayList<Mascota>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    
    public void mostrarDueño(){
        System.out.println("Nombre : " + this.nombre);
        System.out.println("Rut : " + this.rut);
        System.out.println("Correo : " + this.correo);
        System.out.println("Direccion : " + this.direccion);
        System.out.println("Telefono : " + this.telefono);
        if (mascotas.size() == 0) {
            System.out.println("No hay mascota asociada");
        }else{
            System.out.println("Mascota / Mascotas : \n");
            for(int i = 0; i < mascotas.size(); i++){
                mascotas.get(i).mostrarMascota();
            }
        }
    }

    public void agregarMascota(Mascota nueva){
        mascotas.add(nueva);
    }
}
