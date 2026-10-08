package software1;

public class Videojuego {
    public String nombre;
    public String genero;
    String version;
    boolean activo;

    public void mostrarInformacion() {
        System.out.println("Juego: " + nombre + "| Genero: " + genero);
    }
    public void iniciar (){
        activo = true;
        System.out.println("Iniciando " + nombre + ".....");
    }
    void cerrar(){
        activo = false;
        System.out.println("Cerrando " + nombre + ".....");
    }
    void mostrarVersion(){
        System.out.println("Version instalada: " + version);
    }
}
