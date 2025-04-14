package FlujoDeDinero;
public class Pagos {
    protected int abono;

    public int getAbono() {
        return abono;
    }

    public void setAbono(int abono) {
        this.abono = abono;
    }

    public Pagos(int _abono){
        this.abono = _abono;
    }

    public void pagar(int precio_final){
        System.out.println("Pago realizado por " + abono + " unidades monetarias.");
    }
}
