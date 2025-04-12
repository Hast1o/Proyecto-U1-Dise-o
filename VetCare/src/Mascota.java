import java.util.ArrayList;

public class Mascota {
    String nombre;
    String especie;
    String raza;
    int edad;
    Float peso;
    int nro_chip;
    String estado_salud;
    ArrayList<HistorialMedico> historial;
    Dueño dueño_mascota;

    //Constructor
    public Mascota(String nombre, String especie, String raza, int edad, Float peso, String estado_salud, Dueño dueño_mascota) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.estado_salud = estado_salud;
        this.historial = new ArrayList<>();
        this.dueño_mascota = dueño_mascota;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Float getPeso() {
        return peso;
    }
    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public int getNro_chip() {
        return nro_chip;
    }
    public void setNro_chip(int nro_chip) {
        this.nro_chip = nro_chip;
    }

    public String getEstado_salud() {
        return estado_salud;
    }
    public void setEstado_salud(String estado_salud) {
        this.estado_salud = estado_salud;
    }

    public ArrayList<HistorialMedico> getHistorial() {
        return historial;
    }
    public void setHistorial(ArrayList<HistorialMedico> historial) {
        this.historial = historial;
    }

    public Dueño getDueño_mascota() {
        return dueño_mascota;
    }
    public void setDueño_mascota(Dueño dueño_mascota) {
        this.dueño_mascota = dueño_mascota;
    }
}
