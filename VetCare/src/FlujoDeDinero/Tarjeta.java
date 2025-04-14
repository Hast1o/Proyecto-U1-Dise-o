package FlujoDeDinero;
import java.util.Scanner;
public class Tarjeta extends Pagos {
    private String numero;
    private String tipo;
    private String titular;
    private String fechaEx;

    
    public Tarjeta(int _abono, String _numero, String _tipo, String _titular, String _fechaEx) {
        super(_abono);
        this.numero = _numero;
        this.tipo = _tipo;
        this.titular = _titular;
        this.fechaEx = _fechaEx;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getFechaEx() {
        return fechaEx;
    }

    public void setFechaEx(String fechaEx) {
        this.fechaEx = fechaEx;
    }

    @Override
    public void pagar(int precio_final) {
        System.out.println("cuanto es el abono:\n");
        Scanner scanner = new Scanner(System.in);
        int monto = scanner.nextInt();
        setAbono(monto);
        scanner.close();
    }
}
