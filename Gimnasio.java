import java.util.ArrayList;
import java.util.List;

public class Gimnasio {
    private String nombre;
    private final List<String> actividades;
    private final List<String> usuariosRegistrados;

    // Constructor
    public Gimnasio(String nombre) {
        this.nombre = nombre;
        this.actividades = new ArrayList<>(List.of("Yoga", "Boxeo", "Funcional"));
        this.usuariosRegistrados = new ArrayList<>();
    }

    public void mostrarActividades() {
        System.out.println("Actividades disponibles en el gimnasio " + nombre + ":");
        for (String actividad : actividades) {
            System.out.println("- " + actividad);
        }
    }

    public void agregarActividad(String nuevaActividad) {
        if (nuevaActividad != null && !nuevaActividad.trim().isEmpty()) {
            actividades.add(nuevaActividad);
            System.out.println("Actividad '" + nuevaActividad + "' agregada al gimnasio " + nombre + ".");
        } else {
            System.out.println("Error: El nombre de la actividad no puede estar vacío.");
        }
    }

    public void registrarUsuario(String usuario) {
        if (usuario != null && !usuario.trim().isEmpty()) {
            usuariosRegistrados.add(usuario);
            System.out.println("Usuario '" + usuario + "' registrado en el gimnasio " + nombre + ".");
        } else {
            System.out.println("Error: El nombre del usuario no puede estar vacío.");
        }
    }

    public void mostrarUsuariosRegistrados() {
        System.out.println("Usuarios registrados en " + nombre + ":");
        if (usuariosRegistrados.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            for (String usuario : usuariosRegistrados) {
                System.out.println("- " + usuario);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre del gimnasio no puede estar vacío.");
        }
    }
}
