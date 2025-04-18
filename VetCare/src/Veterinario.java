import java.util.ArrayList;

public class Veterinario {
    private String nombre;
    private String rut;
    private String especialidad;
    private ArrayList<CitasMedicas> disponibilidad;

    public Veterinario(String _nombre, String _rut, String _especialidad) {
        this.nombre = _nombre;
        this.rut = _rut;
        this.especialidad = _especialidad;
        this.disponibilidad = new ArrayList<CitasMedicas>();
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<CitasMedicas> getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(ArrayList<CitasMedicas> disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public void mostrarVeterinario(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Rut: " + this.rut);
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println();
    }

    public boolean revisarDisponibilidad(String dia, String mes, String hora){
        for(int i = 0; i < disponibilidad.size(); i++){
            if (dia.equals(disponibilidad.get(i).getDia())) {
                if (mes.equals(disponibilidad.get(i).getMes())) {
                    if (hora.equals(disponibilidad.get(i).getHora())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void agregarCita(CitasMedicas cita){
        disponibilidad.add(cita);
    }

    
}
