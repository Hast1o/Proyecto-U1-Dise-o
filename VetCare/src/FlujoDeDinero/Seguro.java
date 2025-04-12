package FlujoDeDinero;
public class Seguro extends Pagos{
    private int numero_poliza;
    private String aseguradora;
    private float porcenta_cubierto;

    public Seguro(int _abono, int _numero_poliza, String _aseguradora, float _porcenta_cubierto) {
        super(_abono);
        this.numero_poliza = _numero_poliza;
        this.aseguradora = _aseguradora;    
        this.porcenta_cubierto = _porcenta_cubierto;
    }

    public int getNumero_poliza() {
        return numero_poliza;
    }

    public void setNumero_poliza(int numero_poliza) {
        this.numero_poliza = numero_poliza;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    public float getPorcenta_cubierto() {
        return porcenta_cubierto;
    }

    public void setPorcenta_cubierto(float porcenta_cubierto) {
        this.porcenta_cubierto = porcenta_cubierto;
    }
    
}
