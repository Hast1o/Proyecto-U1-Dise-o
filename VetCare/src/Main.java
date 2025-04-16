import java.util.ArrayList;
import java.util.Scanner;

import FlujoDeDinero.Efectivo;
import FlujoDeDinero.Pagos;
import FlujoDeDinero.Seguro;
import FlujoDeDinero.Tarjeta;
import FlujoDeDinero.Transferencias;

public class Main {
    public static void main(String[] args) throws Exception {

    }

    public static void pagar(CitasMedicas _cita){
        
        boolean validar = false;
        Scanner scanner = new Scanner(System.in);
        int opcionInt = 0;
        while(!validar){
            try {
                System.out.println("Usted debe: "+_cita.getDeuda()+" como desea pagar:");
                System.out.println("1. Efectivo\n2. Tarjeta\n3. Transferencia bancaria\n4. seguro");
                opcionInt = Integer.parseInt(scanner.nextLine());
                if(opcionInt < 1 || opcionInt > 4){
                    System.out.println("opcion no valida, ingrese un numero entre 1 y 4");
                }else{
                    validar = true;
                }
            } catch (Exception e) {
                System.out.println("las opciones son solo numeros, ingrese un numero entre 1 y 4");
            }
        }
        if(opcionInt == 1){
            System.out.println("pago en efectivo");
            Efectivo efectivo = new Efectivo(0);
            efectivo.pagar(_cita.getDeuda());
            if(efectivo.getAbono() == 0){
                System.out.println("no se puede pagar 0, vuelva a intentar");
                return;
            }else{
                _cita.calcular_deuda(efectivo.getAbono());
                _cita.agregar_pago(efectivo);
            }
        }else if(opcionInt == 2){
            System.out.println("pago con tarjeta de credito");
            Tarjeta tarjeta = new Tarjeta(0,"null", "null", "null", "null");
            tarjeta.configurarTarjeta();
            tarjeta.pagar(_cita.getDeuda());
            if(tarjeta.getAbono() == 0){
                System.out.println("no se puede pagar 0, vuelva a intentar");
                return;
            }else{
                _cita.calcular_deuda(tarjeta.getAbono());
                _cita.agregar_pago(tarjeta);
            }
        }else if(opcionInt == 3){
            System.out.println("pago por transferencia bancaria");
            Transferencias transferencia = new Transferencias(0);
            transferencia.pagar(_cita.getDeuda());
            if(transferencia.getAbono() == 0){
                System.out.println("no se puede pagar 0, vuelva a intentar");
                return;
            }else{
                _cita.calcular_deuda(transferencia.getAbono());
                _cita.agregar_pago(transferencia);
            }
        }else if(opcionInt == 4){
            System.out.println("pago por seguro");
            Seguro seguro = new Seguro(0, 0,"null",  0);
            seguro.confirgurarSeguro();
            seguro.pagar(_cita.getDeuda());
            if(seguro.getAbono() == 0){
                System.out.println("no se puede pagar 0, vuelva a intentar");
                return;
            }else{
                _cita.calcular_deuda(seguro.getAbono());
                _cita.agregar_pago(seguro);
            }
        }
    }
}
