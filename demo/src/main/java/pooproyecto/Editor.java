package pooproyecto;

public class Editor {
    // Atributos
    private String usuario;
    private String contraseña;
    private String nombreJournal;
    private TipoUsuario rol;

    // Constructor
    public Editor(String usuario, String contraseña, String nombreJournal, TipoUsuario rol) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombreJournal = nombreJournal;
        this.rol = rol;
    }

    // Método publicaArticulo
    public boolean publicaArticulo(Articulo articulo) {
        // Aquí iría la lógica para publicar un artículo.
        // Por simplicidad, supongamos que siempre se puede publicar el artículo.
        System.out.println("Publicando artículo: " + articulo.getTitulo());
        return true;
    }

    // Getters y setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreJournal() {
        return nombreJournal;
    }

    public void setNombreJournal(String nombreJournal) {
        this.nombreJournal = nombreJournal;
    }

    public TipoUsuario getRol() {
        return rol;
    }

    public void setRol(TipoUsuario rol) {
        this.rol = rol;
    }
}