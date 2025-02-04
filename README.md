# Prácticas java 
import java.util.*;

class Paciente {
    String nombre;
    int edad;
    String telefono;

    public Paciente(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + " | Edad: " + edad + " | Tel: " + telefono;
    }
}

class Cita {
    Paciente paciente;
    String fecha;
    String hora;

    public Cita(Paciente paciente, String fecha, String hora) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Cita para " + paciente.nombre + " el " + fecha + " a las " + hora;
    }
}

class GestorCitas {
    private List<Cita> citas = new ArrayList<>();

    public void agendarCita(Paciente paciente, String fecha, String hora) {
        citas.add(new Cita(paciente, fecha, hora));
        System.out.println("Cita agendada con éxito.");
    }

    public void listarCitas() {
        if (citas.isEmpty()) {
            System.out.println("No hay citas registradas.");
        } else {
            for (Cita cita : citas) {
                System.out.println(cita);
            }
        }
    }

    public void cancelarCita(String nombrePaciente, String fecha) {
        citas.removeIf(c -> c.paciente.nombre.equalsIgnoreCase(nombrePaciente) && c.fecha.equals(fecha));
        System.out.println("Cita cancelada si existía.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorCitas gestor = new GestorCitas();
        
        while (true) {
            System.out.println("\n1. Registrar paciente");
            System.out.println("2. Agendar cita");
            System.out.println("3. Listar citas");
            System.out.println("4. Cancelar cita");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea
            
            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.println("Paciente registrado con éxito.");
                    break;
                case 2:
                    System.out.print("Nombre del paciente: ");
                    String nombreCita = scanner.nextLine();
                    System.out.print("Fecha (DD/MM/AAAA): ");
                    String fecha = scanner.nextLine();
                    System.out.print("Hora (HH:MM): ");
                    String hora = scanner.nextLine();
                    gestor.agendarCita(new Paciente(nombreCita, 0, ""), fecha, hora);
                    break;
                case 3:
                    gestor.listarCitas();
                    break;
                case 4:
                    System.out.print("Nombre del paciente: ");
                    String nombreCancelar = scanner.nextLine();
                    System.out.print("Fecha de la cita: ");
                    String fechaCancelar = scanner.nextLine();
                    gestor.cancelarCita(nombreCancelar, fechaCancelar);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
