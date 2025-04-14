package FlujoDeDinero;
import java.util.Scanner;
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
    
    @Override
    public void pagar(int precio_final) {
        System.out.println("cuanto es el abono:\n");
        Scanner scanner = new Scanner(System.in);
        int monto = scanner.nextInt();
        if(calcular_cubierto(precio_final, monto)) {
            setAbono(monto);
            System.out.println("El monto abonado está cubierto por el seguro.");
        } else {
            System.out.println("El monto abonado excede la cobertura del seguro.");
        }
        scanner.close();
    }

    public boolean calcular_cubierto(int monto_total,int monto_abonado) {
        int calculo = (monto_total * (int)porcenta_cubierto) / 100;
        if (monto_abonado <= calculo) {
            return true; 
        } else {
            return false; 
        }
    }
}
