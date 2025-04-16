import java.util.ArrayList;

public class Mascota {
    private String nombre;
    private String especie;
    private String raza;
    private int meses;
    private int años;
    private double peso;
    private int nro_chip;
    private String estado_salud;
    private ArrayList<HistorialMedico> historial;
    private Dueño dueño_mascota;

    public Mascota(String _nombre, String _especie, String _raza, int _meses, int _años, double _peso, int _nro_chip, String _estado_salud, Dueño _dueño_mascota) {
        this.nombre = _nombre;
        this.especie = _especie;
        this.raza = _raza;
        this.años =_años;
        this.meses = _meses;
        this.peso = _peso;
        this.nro_chip = _nro_chip;
        this.estado_salud = _estado_salud;
        this.historial = new ArrayList<HistorialMedico>();
        this.dueño_mascota = _dueño_mascota;
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

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
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

    public void setDueño(Dueño dueño_mascota) {
        this.dueño_mascota = dueño_mascota;
    }

    public void mostrarMascota(){
        System.out.println(" Nombre : " + this.nombre);
        System.out.println(" Especie : " + this.especie);
        System.out.println(" Raza : " + this.raza);
        System.out.println(" Edad : " + this.años + " años y " + this.meses + " meses");
        System.out.println(" Peso : " + this.peso + " Kg");
        System.out.println(" Estado de salud : " + this.estado_salud);
        if (this.nro_chip == 0) {
            System.out.println(" No hay chip ingresado");
        }else{
            System.out.println(" Numero de chip : " + this.nro_chip);
        }
        System.out.println();
    }

    public void agregarHistorial(HistorialMedico historialMedico){
        historial.add(historialMedico);
    }

    public void mostrarHistorial(){
        if (historial.size() == 0) {
            System.out.println("No hay historial disponible");
        }else{
            System.out.println("Historial de " + this.nombre);
            for(int i = 0; i < historial.size(); i++){
                historial.get(i).mostrarHistorial();
            }
        }
    }
}
