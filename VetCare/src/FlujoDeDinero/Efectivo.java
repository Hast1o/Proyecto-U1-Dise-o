package FlujoDeDinero;
import java.util.Scanner;
public class Efectivo extends Pagos {

    public Efectivo(int _abono) {
        super(_abono);
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
