package pooproyecto;

public class Articulo {
    private String titulo;
    private String contenido;

    public Articulo(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}