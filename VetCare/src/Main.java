import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Dueño> dueños = new ArrayList<>();
        ArrayList<Mascota> mascotas = new ArrayList<>();
        ArrayList<Servicios> servicios_dispo = new ArrayList<>();
        ArrayList<Veterinario> veterinarios = new ArrayList<>();
        ArrayList<CitasMedicas> citas = new ArrayList<>();
        Dueño ejeDueño = new Dueño("Hernan Silva", "21.487.685-K", "HernanSilva@gmail.com", "Santa Elena 1234", 988347205);
        Mascota ejeMascota = new Mascota("Athenea", "Perro", "Pitbull", 6, 0, 15.2, 0, "Sano", ejeDueño);
        Mascota ejeMascota2 = new Mascota("Spike", "Perro", "Quiltro", 10, 14, 7.5, 123456, "Sano", ejeDueño);
        ejeDueño.agregarMascota(ejeMascota);
        ejeDueño.agregarMascota(ejeMascota2);
        Veterinario ejeVeterinario = new Veterinario("Nicolas Silva", "11.953.377-5", "Ninguna");
        Servicios ejServicios = new Servicios("Lavado", "XA15", "basicamente lavar a ty perro", 1000, "aprox media hora", "No hay restriccion");
        HistorialMedico ejMedico = new HistorialMedico("12/01/2024", "Se encuentra con lesion en la pierna izquierda", "Lesion pierna", "Ibuprofeno a la vena", false);
        HistorialMedico ejMedico2 = new HistorialMedico("15/01/2024", "Se le infecto la pierna", "Muerte por infeccion", "Ninguno", false);
        ejeMascota.agregarHistorial(ejMedico);
        ejeMascota.agregarHistorial(ejMedico2);
        mostrarHistorialDe(ejeMascota);
    }

    public static Dueño crearDueño(){
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String rut = "";
        String correo = "";
        String direccion = "";
        String telefono = "";
        int nro_telefono = 0;
        while(nombre.equals("")){
            System.out.print("Ingrese nombre y apellido: ");
            nombre = sc.nextLine();
            if (nombre.equals("")) {
                System.out.println("Nombre no valido, intentelo nuevamente");
            }
        }
        while (rut.equals("")) {
            System.out.print("Ingrese su rut: ");
            rut = sc.nextLine();
            if (rut.equals("")) {
                System.out.println("Rut no valido, intentelo nuevamente");
            }
        }
        while (correo.contains("@") == false) {
            System.out.print("Ingrese su correo: ");
            correo = sc.nextLine();
            if (correo.contains("@") == false) {
                System.out.println("Correo no valido, intentelo nuevamente");
            }
        }
        while(direccion.equals("")){
            System.out.print("Ingrese su direccion: ");
            direccion = sc.nextLine();
            if (direccion.equals("")) {
                System.out.println("Direccion no valida, intentelo nuevamente");
            }
        }
        while(telefono.equals("")){
            System.out.print("Ingrese su telefono: ");
            telefono = sc.nextLine();
            try{
                nro_telefono = Integer.parseInt(telefono);
            }catch (Exception e){
                telefono = "";
                System.out.println("Telefono no valido, intentelo nuevamente");
            }
            if (nro_telefono <= 0) {
                System.out.println("Telefono no valido, intentelo nuevamente");
                telefono = "";
            }
        }
        Dueño dueño_mascota = new Dueño(nombre, rut, correo, direccion, nro_telefono);
        System.out.println("Dueño creado con exito \n");
        return dueño_mascota;
    }

    public static Mascota crearMascota(Dueño dueño_mascota){
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String especie = "";
        String raza = "";
        String años = "";
        int nro_años = 0;
        String meses = "";
        int nro_meses = 0;
        String peso = "";
        Double nro_peso = 0.0;
        String estado = "";
        String chip = "";
        int nro_chip = 0;
        while (nombre.equals("")) {
            System.out.print("Ingrese nombre de la mascota: ");
            nombre = sc.nextLine();
            if (nombre.equals("")) {
                System.out.println("Nombre no valido, intentelo nuevamente");
            }
        }
        while (especie.equals("")) {
            System.out.print("Ingrese especie de la mascota: ");
            especie = sc.nextLine();
            if (especie.equals("")) {
                System.out.println("Especie no valida, intentelo nuevamente");
            }
        }
        while (raza.equals("")) {
            System.out.print("Ingrese raza de la mascota: ");
            raza = sc.nextLine();
            if (raza.equals("")) {
                System.out.println("Raza no valida, intentelo nuevamente");
            }
        }
        while (años.equals("")) {
            System.out.print("Ingrese años de la mascota: ");
            años = sc.nextLine();
            try{
                nro_años = Integer.parseInt(años);
            }catch (Exception e){
                System.out.println("Años no validos, intentelo nuevamente");
                años = "";
            }
            if (nro_años < 0) {
                System.out.println("Años no validos, intentelo nuevamente");
                años = "";
            }
        }
        while (meses.equals("")) {
            System.out.print("Ingrese meses de la mascota: ");
            meses = sc.nextLine();
            try{
                nro_meses = Integer.parseInt(meses);
            }catch (Exception e){
                System.out.println("Meses no validos, intentelo nuevamente");
                meses = "";
            }
            if (nro_meses < 0 || nro_meses > 11) {
                System.out.println("Meses no validos, intentelo nuevamente");
                meses = "";
            }
        }
        while (peso.equals("")) {
            System.out.print("Ingrese peso de la mascota en kilos: ");
            peso = sc.nextLine();
            try{
                nro_peso = Double.parseDouble(peso);
            }catch( Exception e){
                System.out.println("Peso no valido, intentelo nuevamente");
                peso = "";
            }
            if (nro_peso <= 0.0) {
                System.out.println("Peso no valido, intentelo nuevamente");
                peso = "";
            }
        }
        while (estado.equals("")) {
            System.out.print("Ingrese estado de salud de la mascota: ");
            estado = sc.nextLine();
            if (estado.equals("")) {
                System.out.println("Estado no valido, intentelo nuevamente");
            }
        }
        String respuesta = "";
        while (respuesta.equals("")) {
            System.out.print("¿Su mascota posee chip? SI/NO   ");
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("NO")) {
                System.out.println("Mascota sin chip");
            } else if (respuesta.equalsIgnoreCase("SI")){
                System.out.print("Ingrese chip de la mascota: ");
                chip = sc.nextLine();
                try{
                    nro_chip = Integer.parseInt(chip);
                }catch (Exception e){
                    System.out.println("Chip no valido, intentelo nuevamente");
                    chip = "";
                }
                if (nro_chip < 0) {
                    System.out.println("Chip no valido, intentelo nuevamente");
                    chip = "";
                }
            }
        }
        Mascota nueva = new Mascota(nombre, especie, raza, nro_meses, nro_años, nro_peso, nro_chip, estado, dueño_mascota);
        System.out.println("Mascota creada con exito \n");
        return nueva;
    }

    public static Veterinario crearVeterinario(){
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String especialidad = "";
        String rut = "";
        while(nombre.equals("")){
            System.out.print("Ingrese nombre y apellido: ");
            nombre = sc.nextLine();
            if (nombre.equals("")) {
                System.out.println("Nombre no valido, intentelo nuevamente");
            }
        }
        while(especialidad.equals("")){
            System.out.print("Ingrese especialidad: ");
            especialidad = sc.nextLine();
            if (especialidad.equals("")) {
                System.out.println("Especialidad no valida, intentelo nuevamente");
            }
        }
        while(rut.equals("")){
            System.out.print("Ingrese rut: ");
            rut = sc.nextLine();
            if (rut.equals("")) {
                System.out.println("Rut no valido, intentelo nuevamente");
            }
        }
        Veterinario nuevo = new Veterinario(nombre, rut, especialidad);
        return nuevo;
    }

    public static Servicios crearServicio(ArrayList<Servicios> servicios_dispo){
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String codigo = "";
        String descripcion = "";
        String costo = "";
        int nro_costo = 0;
        String duracion = "";
        String restriccion = "";
        while (nombre.equals("")) {
            System.out.print("Ingrese nombre del servicio: ");
            nombre = sc.nextLine();
            if (nombre.equals("")) {
                System.out.println("Nombre no valido, intentelo nuevamente");
            }
        }
        while (codigo.equals("")) {
            System.out.print("Ingrese codigo del servicio: ");
            codigo = sc.nextLine();
            if (codigo.equals("")) {
                System.out.println("Codigo no valido, intentelo nuevamente");
            }else{
                int indiceCodigoExiste = existeCodigo(servicios_dispo, codigo);
                if (indiceCodigoExiste != -1) {
                    System.out.println("Este codigo ya existe");
                    codigo = "";
                }
            }
        }
        while (descripcion.equals("")) {
            System.out.print("Ingrese descripcion del servicio: ");
            descripcion = sc.nextLine();
            if (descripcion.equals("")) {
                System.out.println("Descripcion no valida, intentelo nuevamente");
            }
        }
        while (costo.equals("")) {
            System.out.print("Ingrese costo del servicio: ");
            costo = sc.nextLine();
            try{
                nro_costo = Integer.parseInt(costo);
            }catch (Exception e){
                System.out.println("Costo no valido, intentelo nuevamente");
                costo = "";
            }
            if (nro_costo <= 0) {
                System.out.println("Costo no valido, intentelo nuevamente");
                costo = "";
            }
        }
        while (duracion.equals("")) {
            System.out.print("Ingrese duracion del servicio: ");
            duracion = sc.nextLine();
            if (duracion.equals("")) {
                System.out.println("Duracion no valida, intentelo nuevamente");
            }
        }
        while (restriccion.equals("")) {
            System.out.print("Ingrese restriccion del servicio: ");
            restriccion = sc.nextLine();
            if (restriccion.equals("")) {
                System.out.println("Restriccion no valida, intentelo nuevamente");
            }
        }
        Servicios nuevo = new Servicios(nombre, codigo, descripcion, nro_costo, duracion, restriccion);
        return nuevo;
    }

    public static int existeCodigo(ArrayList<Servicios> servicios_dispo, String codigo){
        for(int i = 0; i < servicios_dispo.size(); i++){
            if (codigo.equals(servicios_dispo.get(i).getCodigo())) {
                return i;
            }else{
                //Son codigos distintos
            }
        }
        return -1;
    }

    public static void crearHistorial(Mascota mascota){
        Scanner sc = new Scanner(System.in);
        String fecha = "";
        String observaciones = "";
        String diagnostico = "";
        String tratamiento_reco = "";
        String requiere_control = "";
        boolean requiere = false;
        while (fecha.equals("")) {
            System.out.print("Ingrese fecha DD/MM/YYYY  ");
            fecha = sc.nextLine();
            if (fecha.equals("")) {
                System.out.println("Fecha no valida, intentelo nuevamente");
            }
        }
        while (observaciones.equals("")) {
            System.out.print("Ingrese alguna observacion: ");
            observaciones = sc.nextLine();
            if (observaciones.equals("")) {
                System.out.println("Observacion no valida, intentelo nuevamente");
            }
        }
        while (diagnostico.equals("")) {
            System.out.println("Ingrese diagnostico: ");
            diagnostico = sc.nextLine();
            if (diagnostico.equals("")) {
                System.out.println("Diagnostico no valido, intentelo nuevamente");
            }
        }
        while (tratamiento_reco.equals("")) {
            System.out.println("Ingrese el tratamiento recomendado: ");
            tratamiento_reco = sc.nextLine();
            if (tratamiento_reco.equals("")) {
                System.out.println("Tratamiento no valido, intentelo nuevamente");
            }
        }
        while (requiere_control.equals("")) {
            System.out.println("¿Requiere otro control? SI/NO   ");
            requiere_control = sc.nextLine();
            if (requiere_control.equalsIgnoreCase("SI")) {
                requiere = true;
            }else if (requiere_control.equalsIgnoreCase("NO")) {
                requiere = false;
            }else{
                System.out.println("No valido, intentelo nuevamente");
            }
        }
        HistorialMedico historialMedico = new HistorialMedico(fecha, observaciones, diagnostico, tratamiento_reco, requiere);
        mascota.agregarHistorial(historialMedico);
    }

    public static void mostrarHistorialDe(Mascota mascota){
        mascota.mostrarHistorial();
    }

    
}
