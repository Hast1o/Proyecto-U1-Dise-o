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

    public void configurarTarjeta(){
        Scanner scanner = new Scanner(System.in);
        String entrada = "";
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Ingrese el número de la tarjeta (formato: **** **** **** ****): ");
            entrada = scanner.nextLine();
            if (entrada.matches("\\d{4} \\d{4} \\d{4} \\d{4}")) {
                validInput = true;
                this.setNumero(entrada);
            } else {
                System.out.println("Número de tarjeta inválido. Debe tener 16 dígitos.");
            }
        }
        validInput = false;
        while (!validInput) {
            System.out.println("Ingrese el tipo de tarjeta (Debito o Credito): ");
            entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("Debito") || entrada.equalsIgnoreCase("Credito")) {
                validInput = true;
                this.setTipo(entrada);
            } else {
                System.out.println("Tipo de tarjeta inválido. Debe ser 'Debito' o 'Credito'.");
            }
        }
        validInput = false;
        while (!validInput) {
            System.out.println("ingrese el nombre del titular (Nombre y dos apellidos): ");
            entrada = scanner.nextLine().trim();
            String[] partes = entrada.split("\\s+");
            if (partes.length == 3 && entrada.matches("([A-Za-zÁÉÍÓÚáéíóúÑñ]+\\s){2}[A-Za-zÁÉÍÓÚáéíóúÑñ]+")) {
                validInput = true;
                this.setTitular(entrada);
            } else {
                System.out.println(" Formato inválido. Debes ingresar un nombre y dos apellidos.");
            }
        }
        validInput = false;
        while (!validInput) {
            System.out.print("Ingresa la fecha de expiración (MM/YY): ");
            entrada = scanner.nextLine().trim();
            if (entrada.matches("(0[1-9]|1[0-2])/\\d{2}")) {
                validInput = true;
                this.setFechaEx(entrada);
            } else {
                System.out.println("Formato inválido. Usa el formato MM/YY (ej: 05/28).");
            }
        }
        System.out.println("Tarjeta configurada correctamente.");
        System.out.println("Número de tarjeta: " + this.getNumero());
        System.out.println("Tipo de tarjeta: " + this.getTipo());
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Fecha de expiración: " + this.getFechaEx());
    }
}
