package pooproyecto;

public class Revisor {
    // Atributos
    private String usuario;
    private String contraseña;
    private String especialidad;
    private int numeroArticulosRevisados;
    private TipoUsuario rol;

    // Constructor
    public Revisor(String usuario, String contraseña, String especialidad, int numeroArticulosRevisados, TipoUsuario rol) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.especialidad = especialidad;
        this.numeroArticulosRevisados = numeroArticulosRevisados;
        this.rol = rol;
    }

    // Método aceptarArticulo
    public boolean aceptarArticulo(Articulo articulo) {
        // Aquí iría la lógica para aceptar un artículo.
        // Por simplicidad, supongamos que siempre se acepta el artículo.
        System.out.println("Artículo aceptado: " + articulo.getTitulo());
        numeroArticulosRevisados++;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumeroArticulosRevisados() {
        return numeroArticulosRevisados;
    }

    public void setNumeroArticulosRevisados(int numeroArticulosRevisados) {
        this.numeroArticulosRevisados = numeroArticulosRevisados;
    }

    public TipoUsuario getRol() {
        return rol;
    }

    public void setRol(TipoUsuario rol) {
        this.rol = rol;
    }
}