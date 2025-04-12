import java.util.ArrayList;

public class Veterinario {
    String nombre;
    String especialidad;
    String rut;
    ArrayList<CitasMedicas> disponibilidad;
    //Constructor
    public Veterinario(String nombre, String especialidad, String rut) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    
    public ArrayList<CitasMedicas> getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(ArrayList<CitasMedicas> disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
    
}
