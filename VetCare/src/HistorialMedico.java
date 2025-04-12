public class HistorialMedico {
    private Mascota mascota_vista;
    private String fecha;
    private String observaciones;
    private String diagnostico;
    private String tratamiento_reco;
    private boolean requiere_control;

    public HistorialMedico(Mascota _mascota_vista, String _fecha, String _observaciones, String _diagnostico, String _tratamiento_reco, boolean _requiere_control) {
        this.mascota_vista = _mascota_vista;
        this.fecha = _fecha;
        this.observaciones = _observaciones;
        this.diagnostico = _diagnostico;
        this.tratamiento_reco = _tratamiento_reco;
        this.requiere_control = _requiere_control;
    }

    public Mascota getMascota_vista() {
        return mascota_vista;
    }

    public void setMascota_vista(Mascota mascota_vista) {
        this.mascota_vista = mascota_vista;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento_reco() {
        return tratamiento_reco;
    }

    public void setTratamiento_reco(String tratamiento_reco) {
        this.tratamiento_reco = tratamiento_reco;
    }

    public boolean isRequiere_control() {
        return requiere_control;
    }

    public void setRequiere_control(boolean requiere_control) {
        this.requiere_control = requiere_control;
    }
    
}
