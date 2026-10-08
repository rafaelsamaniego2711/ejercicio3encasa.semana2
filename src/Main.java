package software1;
public class Main {
    public static void main(String[] args){
        Videojuego juego1 = new Videojuego();
        Videojuego juego2 = new Videojuego();
        Videojuego juego3 = new Videojuego();

        juego1.nombre = "Cuphead";
        juego1.genero = "plataformas";
        juego1.version = "1.0";

        juego2.nombre = "God of War";
        juego2.genero = "accion/aventura";
        juego2.version = "5.0";

        juego3.nombre = "FC26";
        juego3.genero = "deportes";
        juego3.version = "3.0";

        juego1.mostrarInformacion();
        juego1.iniciar();
        juego1.mostrarVersion();

        System.out.println("--------------------");
        juego2.mostrarInformacion();
        juego2.iniciar();
    }
}