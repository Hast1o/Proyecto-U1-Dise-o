package FlujoDeDinero;
import java.util.Scanner;
public class Seguro extends Pagos{
    private int numero_poliza;
    private String aseguradora;
    private int porcenta_cubierto;

    public Seguro(int _abono, int _numero_poliza, String _aseguradora, int _porcenta_cubierto) {
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

    public int getPorcenta_cubierto() {
        return porcenta_cubierto;
    }

    public void setPorcenta_cubierto(int porcenta_cubierto) {
        this.porcenta_cubierto = porcenta_cubierto;
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
                if (monto < 0 || monto > precio_final || !(calcular_cubierto(precio_final, monto))) {
                    if(monto < 0 || monto > precio_final) {
                        System.out.println("El monto debe ser un número positivo y no puede exceder el precio final. Intente de nuevo.");
                    } else {
                        System.out.println("El monto abonado no está cubierto por el seguro. Intente de nuevo.");
                    }
                } else {
                    setAbono(monto);
                    System.out.println("El monto abonado está cubierto por el seguro.");
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            }
        }   
    }

    public boolean calcular_cubierto(int monto_total,int monto_abonado) {
        System.out.println("el monto total es: " + monto_total);
        System.out.println("el monto abonado es: " + monto_abonado);
        int calculo = (monto_total * porcenta_cubierto) / 100;
        System.out.println("el monto cubierto por el seguro es: " + calculo);
        if (monto_abonado <= calculo) {
            return true; 
        } else {
            return false; 
        }
    }

    public void confirgurarSeguro(){
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        String entrada = "";
        int porcentaje = 0;
        while(!validInput){
            try {
                System.out.println("ingrese el numero de la poliza (recuerde que la poliza debe ser de 6 digitos): ");
                entrada = scanner.nextLine();
                if(entrada.matches("\\d{6}")){
                    this.setNumero_poliza(Integer.parseInt(entrada));
                    validInput = true;
                }else{
                    System.out.println("el numero de la poliza no es valido, debe ser de 6 digitos");
                }
            }catch (Exception e) {
                System.out.println("el numero de la poliza no es valido, debe ser de 6 digitos");
            }
        }
        System.out.println("ingrese el nombre de la aseguradora: ");
        this.setAseguradora(scanner.nextLine());
        validInput = false;
        while(!validInput){
            try {
                System.out.println("ingrese el porcentaje cubierto por el seguro (recuerde que el porcentaje debe ser entre 0 y 100): ");
                porcentaje = Integer.parseInt(scanner.nextLine());
                if(porcentaje < 0 || porcentaje > 100){
                    System.out.println("el porcentaje cubierto no es valido, debe ser entre 0 y 100");
                }else{
                    this.setPorcenta_cubierto(porcentaje);
                    validInput = true;
                }
            }catch (Exception e) {
                System.out.println("el porcentaje cubierto no es valido, debe ser entre 0 y 100");
            }
        }
        System.out.println("el seguro ha sido configurado con exito, el numero de la poliza es: " + this.getNumero_poliza() + " y el porcentaje cubierto es: " + this.getPorcenta_cubierto() + "%");
    }
}
