import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menu2 = 1;
        int menu1 = 1;

        //Instancias super epicas
        TamañoDeSalon Pequeño = new TamañoDeSalon("Pequeño");
        TamañoDeSalon Mediano = new TamañoDeSalon("Mediano");
        TamañoDeSalon Grande = new TamañoDeSalon("Grande");

        ArrayList<Salon> Eventos = new ArrayList<>();
        ArrayList<Salon> Salones = new ArrayList<>();

        Salones.add(new Salon("Disponible 1", null, Pequeño, null, null, 0));
        Salones.add(new Salon("Disponible 2", null, Mediano, null, null, 0));
        Salones.add(new Salon("Disponible 3", null, Grande, null, null, 0));
        Salones.add(new Salon("Disponible 4", null, Grande, null, null, 0));

        Controlador Array = new Controlador();

        while (menu1 == 1) {
            while (menu2 == 1) {
                System.out.println("\nHacer Reserva: \n1.Reservar Salones disponibles \n2.Ver eventos en espera \n3.Agregar evento \n4.Eliminar evento \n5.Salir");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        Array.MostrarSalones(Salones);
                        System.out.print("Elige un salón: ");
                        int SalonDisponible = scanner.nextInt();
                        scanner.nextLine();
                        if (SalonDisponible >= 1 && SalonDisponible <= Salones.size()) {
                            Salon reservado = Salones.get(SalonDisponible - 1);
                            System.out.println("Reservaste el " + reservado.getTipoDeSalon());
                            Eventos.add(reservado);
                            Salones.remove(reservado);
                        } else {
                            System.out.println("Opción inválida");
                        }
                        break;

                    case 2: 
                        Array.MostrarEventos(Eventos);
                        break;

                    case 3: //agregar evento
                        System.out.print("Nombre del evento: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Encargado: ");
                        String encargado = scanner.nextLine();
                        System.out.print("Tipo de salón (Pequeño, Mediano, Grande): ");
                        String tipo = scanner.nextLine();
                        TamañoDeSalon tipoSalon = new TamañoDeSalon(tipo);
                        System.out.print("Tipo de evento: ");
                        String tipoEvento = scanner.nextLine();
                        if(tipo.equals("Grande")){
                            if(tipoEvento.equalsIgnoreCase("gala")||tipoEvento.equalsIgnoreCase("conferencia")){
                                continue;
                            }
                            else{
                                System.out.println("Las salas grandes solo pueden ser conferencias o galas");
                                menu2 = 0;
                                menu1 = 0;
                                break;
                        }
                        }
                        System.out.print("Año del evento: ");
                        int anio = scanner.nextInt();
                        System.out.print("Mes del evento: ");
                        int mes = scanner.nextInt();
                        System.out.print("Día del evento: ");
                        int dia = scanner.nextInt();
                        System.out.print("Horario (HHMM): ");
                        int horario = scanner.nextInt();
                        scanner.nextLine();

                        Eventos.add(new Salon(nombre, encargado, tipoSalon, tipoEvento, LocalDate.of(anio, mes, dia), horario));
                        System.out.println("Evento agregado exitosamente!");
                        break;

                    case 4: //eliminar evento
                        Array.MostrarEventos(Eventos);
                        System.out.print("Ingresa el número del evento a eliminar: ");
                        int eliminar = scanner.nextInt();
                        scanner.nextLine();
                        if (eliminar >= 1 && eliminar <= Eventos.size()) {
                            Eventos.remove(eliminar - 1);
                            System.out.println("Evento eliminado.");
                        } else {
                            System.out.println("Número inválido.");
                        }
                        break;

                    case 5://salir
                        System.out.println("Saliste del programa con exito :D");
                        menu2 = 0;
                        menu1 = 0;
                        break;

                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
            }
        }
        scanner.close();
    }
}
