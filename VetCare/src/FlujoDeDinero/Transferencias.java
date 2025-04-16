package FlujoDeDinero;
import java.util.Scanner;
public class Transferencias extends Pagos{

    public Transferencias(int _abono) {
        super(_abono);
    }

    @Override
    public void pagar(int precio_final) {
        Scanner scanner = new Scanner(System.in);
        int monto = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("cuanto es el abono:");
            try {
                monto = Integer.parseInt(scanner.nextLine());
                if (monto < 0 || monto > precio_final) {
                    System.out.println("El monto debe ser un número positivo y no puede exceder el precio final. Intente de nuevo.");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            }
        }
        setAbono(monto);
    }
    
}
