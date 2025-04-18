import java.util.ArrayList;

import FlujoDeDinero.Pagos;

public class CitasMedicas {
    private String dia;
    private String mes;
    private String hora;
    private String motivo;
    private String estado; //pendiente, realizada, cancelada
    private Mascota mascota_asociada;
    private Veterinario veterinario_asignado;
    private ArrayList<Servicios> servicios_sol;
    private ArrayList<Pagos> pagos_asociados;
    private int deuda;
    private int costo_total;

    public CitasMedicas(String _dia, String _mes, String _hora, String _motivo, Mascota _mascota_asociada, Veterinario _veterinario_asignado, ArrayList<Servicios> _servicios_sol, int _deuda, int _costo_total) {
        this.dia = _dia;
        this.mes = _mes;
        this.hora = _hora;
        this.motivo = _motivo;
        this.estado = "PENDIENTE";
        this.mascota_asociada = _mascota_asociada;
        this.veterinario_asignado = _veterinario_asignado;
        this.servicios_sol = _servicios_sol;
        this.pagos_asociados = new ArrayList<Pagos>();
        this.deuda = _deuda;
        this.costo_total = _costo_total;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Mascota getMascota_asociada() {
        return mascota_asociada;
    }

    public void setMascota_asociada(Mascota mascota_asociada) {
        this.mascota_asociada = mascota_asociada;
    }

    public Veterinario getVeterinario_asignado() {
        return veterinario_asignado;
    }

    public void setVeterinario_asignado(Veterinario veterinario_asignado) {
        this.veterinario_asignado = veterinario_asignado;
    }

    public ArrayList<Servicios> getServicios_sol() {
        return servicios_sol;
    }

    public void setServicios_sol(ArrayList<Servicios> servicios_sol) {
        this.servicios_sol = servicios_sol;
    }

    public ArrayList<Pagos> getPagos_asociados() {
        return pagos_asociados;
    }

    public void setPagos_asociados(ArrayList<Pagos> pagos_asociados) {
        this.pagos_asociados = pagos_asociados;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public int getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(int costo_total) {
        this.costo_total = costo_total;
    }

    public void calcular_total() {
        int total = 10000;
        for (Servicios servicio : servicios_sol) {
            total += servicio.getCosto();
        }
        setCosto_total(total);
        setDeuda(total);
    }

    public void calcular_deuda(int monto_abonado) {
        setDeuda(getDeuda() - monto_abonado);
        if(getDeuda() == 0) {
            setEstado("Pagado");
            System.out.println("El monto total ha sido cubierto.");
        } else {
            setEstado("Pendiente");
            System.out.println("El monto total no ha sido cubierto. La deuda es de: " + getDeuda() + " pesos.");
        }
    }

    public void agregar_pago(Pagos pago) {
        pagos_asociados.add(pago);
    }
    
    
}
