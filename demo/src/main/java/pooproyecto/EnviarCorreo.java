package pooproyecto;

import java.util.ArrayList;

public class EnviarCorreo {
    // Atributos
    private Articulo articulo;

    // Constructor
    public EnviarCorreo(Articulo articulo) {
        this.articulo = articulo;
    }

    // Método enviarCorreo
    public void enviarCorreo() {
        // Aquí iría la lógica para enviar un correo.
        System.out.println("Enviando correo sobre el artículo: " + articulo.getTitulo());
    }

    // Método asignarRevisores
    public void asignarRevisores(ArrayList<Revisor> revisores) {
        // Aquí iría la lógica para asignar revisores a un artículo.
        System.out.println("Asignando revisores para el artículo: " + articulo.getTitulo());
        for (Revisor revisor : revisores) {
            System.out.println("Revisor asignado: " + revisor.getUsuario() + " - Especialidad: " + revisor.getEspecialidad());
        }
    }
}
