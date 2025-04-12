import java.util.ArrayList;

public class Mascota {
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private float peso;
    private int nro_chip;
    private String estado_salud;
    private ArrayList<HistorialMedico> historial;

    public Mascota(String _nombre, String _especie, String _raza, int _edad, float _peso, int _nro_chip, String _estado_salud) {
        this.nombre = _nombre;
        this.especie = _especie;
        this.raza = _raza;
        this.edad = _edad;
        this.peso = _peso;
        this.nro_chip = _nro_chip;
        this.estado_salud = _estado_salud;
        this.historial = new ArrayList<HistorialMedico>();
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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
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

    
}
