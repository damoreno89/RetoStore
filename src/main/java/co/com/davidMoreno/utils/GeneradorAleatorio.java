package co.com.davidMoreno.utils;

import java.util.Random;

public class GeneradorAleatorio {

    private static final String[] NOMBRES = {"Juan", "María", "Carlos", "Laura", "Pedro", "Ana", "Luis", "Sofía"};
    private static final String CARACTERES_CONTRASENA = "0123456789";

    public static void main(String[] args) {
        String nombreAleatorio = generarNombreAleatorio();
        String contrasenaAleatoria = generarContrasenaAleatoria(5);

        System.out.println("Nombre aleatorio: " + nombreAleatorio);
        System.out.println("Contraseña aleatoria: " + contrasenaAleatoria);
    }

    public static String generarNombreAleatorio() {
        Random random = new Random();
        int indiceAleatorio = random.nextInt(NOMBRES.length);
        return NOMBRES[indiceAleatorio];
    }

    public static String generarContrasenaAleatoria(int longitud) {
        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(CARACTERES_CONTRASENA.length());
            char caracterAleatorio = CARACTERES_CONTRASENA.charAt(indiceAleatorio);
            contrasena.append(caracterAleatorio);
        }
        return contrasena.toString();
    }
}
