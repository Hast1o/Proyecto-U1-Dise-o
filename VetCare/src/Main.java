import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Dueño> dueños = new ArrayList<>();
        ArrayList<Servicios> servicios_dispo = new ArrayList<>();
        ArrayList<Veterinario> veterinarios = new ArrayList<>();
        ArrayList<CitasMedicas> citas = new ArrayList<>();
        Veterinario veterinario1 = new Veterinario("Jose Iturra", "21.603.528-3", "Traumatologia");
        Veterinario veterinario2 = new Veterinario("Hernan Silva", "21.487.685-K", "Ugencias");
        Veterinario veterinario3 = new Veterinario("Nicolas Cavieres", "20.269.345-8", "General");
        veterinarios.add(veterinario1);
        veterinarios.add(veterinario2);
        veterinarios.add(veterinario3);
        Dueño dueño1 = new Dueño("Benjamin Alarcon", "9.729.880-7", "balarcon22@alumnos.utalca.cl", "Chacabuco 269 Curico", 962217060);
        Dueño dueño2 = new Dueño("Jose Gomez", "9.800.301-0", "jgomez22@alumnos.utalca.cl", "Balmaceda 245 Curico", 956832099);
        dueños.add(dueño1);
        dueños.add(dueño2);
        Mascota mascota1 = new Mascota("Joaquin", "Gato","Mau Egipcio", 2, 1, 4.6, 9530, "Sano", dueño1);
        Mascota mascota2 = new Mascota("Athenea","Perro","Pitbull", 6, 0, 17, 0, "Sano", dueño2);
        Mascota mascota3 = new Mascota("Spike", "Perro", "Quiltro", 9, 14, 7, 1201, "Sano", dueño2);
        Servicios servicio1 = new Servicios("Castracion", "X01", "Estirilizacion", 40000, "40 minutos", "El animal no debe pasar los 2 años");
        servicios_dispo.add(servicio1);
        ArrayList <Servicios> aux_ser = new ArrayList<>();
        aux_ser.add(servicio1);
        Servicios servicio2 = new Servicios("Lavado", "Y01", "Bañar al animal", 20000, "20 minutos", "Ninguna");
        servicios_dispo.add(servicio2);
        CitasMedicas cita1 = new CitasMedicas("16", "04", "10:30", "Esterilizacion", mascota2, veterinario1, aux_ser, 0, 0);
        citas.add(cita1);
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
            }else if (respuesta.equalsIgnoreCase("SI")){
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
            }else{
                System.out.println("No valido, intentelo nuevamente");
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
            if (codigo.equalsIgnoreCase(servicios_dispo.get(i).getCodigo())) {
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

    public static void mostrarMascotaDe(Dueño dueño){
        System.out.println("Mascotas de " + dueño.getNombre());
        int cantidad_mascotas = dueño.getMascotas().size();
        if (cantidad_mascotas == 0) {
            System.out.println("No hay mascota asociada");
        }else{
            for(int i = 0; i < cantidad_mascotas; i++){
                dueño.getMascotas().get(i).mostrarMascota();
            }
        }        
    }

    public static void mostrarTodasLasMascotas(ArrayList<Dueño> dueños){
        if (dueños.size() == 0) {
            System.out.println("No hay mascotas que mostrar");
        }else{
            System.out.println("Todas las mascotas en el sistema: \n");
            int contador = 1;
            for(int i = 0; i < dueños.size(); i++){
                for(int j = 0; j < dueños.get(i).getMascotas().size(); j++){
                    System.out.println("Numero mascota: " + contador);
                    System.out.println("Nombre mascota: " + dueños.get(i).getMascotas().get(j).getNombre());
                    System.out.println("Rut dueño: " + dueños.get(i).getRut());
                    System.out.println();
                    contador++;
                }
            }
        }
    }

    public static Veterinario escogerVeterinario(ArrayList<Veterinario> veterinarios){
        Scanner sc = new Scanner(System.in);
        String veterinario = "";
        int numero = -1;
        System.out.println("Veterinarios Dispónibles: ");
        for(int i = 0; i < veterinarios.size(); i++){
            System.out.println(i + 1 + ". " + veterinarios.get(i).getNombre());
        }
        while (veterinario.equals("")) {
            System.out.println("¿Que veterinario desea escoger? Ingrese el numero correspondiente");
            veterinario = sc.nextLine();
            try{
                numero = Integer.parseInt(veterinario) - 1;
            }catch (Exception e){
                System.out.println("Opcion no valida, intentelo nuevamente");
            }
            if (0 > numero || numero > veterinarios.size() - 1) {
                veterinario = "";
                System.out.println("Numero no valido, intentelo nuevamente");
            }else{
                //numero valido
            }
        }
        return veterinarios.get(numero);
    }
    
    public static Mascota escogerMascota(ArrayList<Dueño> dueños){
        mostrarTodasLasMascotas(dueños);
        Scanner sc = new Scanner(System.in);
        String mascota = "";
        int numero = -1;
        int index = -1;
        while (mascota.equals("")) {
            System.out.println("Ingrese numero de la mascota");
            mascota = sc.nextLine();
            try{
                numero = Integer.parseInt(mascota) - 1; 
            }catch (Exception e){
                System.out.println("No valido, intentelo nuevamente");
            }
            if (0 > numero) {
                System.out.println("Numero no valido, intentelo nuevamente");
                mascota = "";
            }else{
                int contador = 0;
                for(int i = 0; i < dueños.size(); i++){
                    int largo = dueños.get(i).getMascotas().size();
                    contador+= largo;
                    if (numero < contador) {
                        numero = contador - numero;
                        numero = largo - numero;
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("Numero no valido, intentelo nuevamente");
                    mascota = "";
                }
            }
        }
        return dueños.get(index).getMascotas().get(numero);
    }
    
    public static CitasMedicas agendarCita(ArrayList<Veterinario> veterinarios, ArrayList<Dueño> dueños, ArrayList<Servicios> servicios_dispo){
        Scanner sc = new Scanner(System.in);
        Veterinario veterinario = escogerVeterinario(veterinarios);
        Mascota mascota = escogerMascota(dueños);
        String motivo = "";
        String servicio = "";
        boolean valida = true;
        String dia = "";
        String mes = "";
        String hora = "";
        ArrayList<Servicios> solicitados = new ArrayList<>();
        while (valida) {
            System.out.println("En que horario quieres agendar tu hora: ");
            while (dia.equals("") && mes.equals("")) {
                int nro_dia = 0;
                int nro_mes = 0;
                System.out.println("Que dia quieres agendar hora: DD/MM");
                dia = sc.nextLine();
                String[] separador = dia.split("/");
                dia = separador[0];
                mes = separador[1];
                try{
                    nro_dia = Integer.parseInt(dia);
                    nro_mes = Integer.parseInt(mes);
                    if (nro_dia < 1 || nro_dia > 31) {
                        System.out.println("Dia no valido, intentelo nuevamente");
                        dia = "";
                        mes = "";
                    }else{} // dia valido
                    if (nro_mes < 1 ||nro_mes > 12) {
                        System.out.println("Mes no valido, intentelo nuevamente");
                        dia = "";
                        mes = "";
                    }else{}//mes valido
                }catch (Exception e){
                    System.out.println("No valido, intentelo nuevamente");
                    dia = "";
                    mes = "";
                }
            }
            while (hora.equals("")) {
                String minutos = "";
                int nro_hora = 0;
                int nro_minuto = 0;
                System.out.println("Que hora quiere agendar: HH:MM 24 hrs");
                hora = sc.nextLine();
                String[] separador = hora.split(":");
                hora = separador[0];
                minutos = separador[1];
                try{
                    nro_hora = Integer.parseInt(hora);
                    nro_minuto = Integer.parseInt(minutos);
                    if (nro_hora < 0 || nro_hora > 23) {
                        System.out.println("Hora no valida, intentelo nuevamente");
                        hora = "";
                    }else{}//hora valida
                    if (nro_minuto < 0 || nro_minuto > 59) {
                        System.out.println("Minutos no validos, intentelo nuevamente");
                        hora = "";
                    }else{}//minuto valido
                }catch (Exception e){
                    System.out.println("Hora no valida, intentelo nuevamente");
                    hora = "";
                }
            }
            valida = veterinario.revisarDisponibilidad(dia, mes, hora);
            if (valida) {
                System.out.println("Esta hora no esta disponible");
            }else{
                System.out.println("Hora disponible");
            }
        }
        while (motivo.equals("")) {
            System.out.println("Cual es el motivo de su consulta: ");
            motivo = sc.nextLine();
            if (motivo.equals("")) {
                System.out.println("Motivo no valido, intentelo denuevo");
            }
        }
        while (servicio.equals("")) {
            System.out.println("Desea solicitar algun servicio?  SI/NO");
            servicio = sc.nextLine();
            if (servicio.equalsIgnoreCase("SI")) {
                while (servicio.equalsIgnoreCase("SI")) {
                    System.out.println("Que servicio desea solicitar ? Ingrese 0 para salir y el indice para seleccionar el servicio");
                    for(int i = 0; i < servicios_dispo.size(); i++){
                        System.out.println((i + 1)+"." + servicios_dispo.get(i).getNombre());
                        System.out.println("Costo: " + servicios_dispo.get(i).getCosto());
                    }
                    String solicitado = "";
                    while (solicitado.equals("")) {
                        solicitado = sc.nextLine();
                        int nro_solicitado = -1;
                        try{
                            nro_solicitado = Integer.parseInt(solicitado);
                            if (nro_solicitado == 0) {
                                servicio = "salir";
                            }else if (nro_solicitado < 0 || nro_solicitado > servicios_dispo.size()) {
                                System.out.println("Numero no valido, intentelo nuevamente");
                            }else{
                                if (solicitados.contains(servicios_dispo.get(nro_solicitado - 1))){
                                    System.out.println("Este servicio ya fue solicitado");
                                }else{
                                    solicitados.add(servicios_dispo.get(nro_solicitado - 1));
                                    System.out.println("Servicio solicitado con exito");
                                }
                            }
                        }catch (Exception e){
                            System.out.println("No valido, intentelo nuevamente");
                        }
                    }
                    System.out.println();
                }
            }else if (servicio.equalsIgnoreCase("NO")) {
                System.out.println("No se solicita ningun servicio");
            }else{
                System.out.println("No valido, intentelo nuevamente");
                servicio = "";
            }
        }
        CitasMedicas nueva = new CitasMedicas(dia, mes, hora, motivo, mascota, veterinario, servicios_dispo, 0 ,0);
        veterinario.agregarCita(nueva);
        return nueva;
    }

    public static void realizarCita(CitasMedicas cita){
        cita.setEstado("REALIZADA");
    }

    public static void cancelarCita(CitasMedicas cita){
        cita.setEstado("CANCELADA");
    }
}
