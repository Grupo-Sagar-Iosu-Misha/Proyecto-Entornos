
public class Main {
    public static void main(String[] args) {

    }

    public static void registrarTarea(String titulo, String descripcion, String fechaVencimiento) {
        if (contador < MAX_TAREAS) {
            titulos[contador] = titulo;
            descripciones[contador] = descripcion;
            fechasVencimiento[contador] = fechaVencimiento;
            contador++;
            System.out.println("Tarea '" + titulo + "' registrada.");
        } else {
            System.out.println("No se pueden registrar más tareas. Límite alcanzado.");
        }
    }

    public static void listarTareas() {
        if (contador == 0) {
            System.out.println("No hay tareas registradas.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println("Título: " + titulos[i] + ", Descripción: " + descripciones[i] + ", Fecha de vencimiento: " + fechasVencimiento[i]);
            }
        }
    }


}