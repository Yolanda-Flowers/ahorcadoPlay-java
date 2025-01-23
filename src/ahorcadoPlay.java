import java.util.Scanner;

public class ahorcadoPlay {
    public static void main(String[] args) throws Exception {
        // Clase scanner permite al usuario escribir.
        Scanner scanner = new Scanner(System.in);
        // Declaraciones y asignaciones
        String palabraSacreta = "torta";
        int intentosMax = 10;
        int intentos = 0;
        boolean esCorracta = false;
        // Arreglos
        char[] letrasEncontradas = new char[palabraSacreta.length()];

        // estructura de contrrol iterativa bucle For
        for (int i = 0; i < letrasEncontradas.length; i++) {
            letrasEncontradas[i] = '_';
            System.out.println(letrasEncontradas[i]);
        }

        while (!esCorracta && intentos < intentosMax) {
            System.out.println("Palabra adivinada: " + String.valueOf(letrasEncontradas));

            System.out.println("Introduce una letra por favor! ");

            char letra = scanner.next().charAt(0);

            boolean existeletra = false;

            for (int i = 0; i < palabraSacreta.length(); i++) {
                if (Character.toUpperCase(palabraSacreta.charAt(i)) == Character.toUpperCase(letra)) {
                    letrasEncontradas[i] = letra;
                    existeletra = true;
                }
            }

            if (!existeletra) {
                intentos++;
                System.out.println("Letra Incorrecta! Solo quedan " + (intentosMax - intentos) + " Intentos.");
            }

            if (String.valueOf(letrasEncontradas).toUpperCase().equals(palabraSacreta.toUpperCase())) {
                esCorracta = true;
                System.out.println("Felicidades, has adivinado la palabra: " + palabraSacreta.toUpperCase());
            }

        }

        if (!esCorracta) {
            System.out.println("Te has quedado sin intentos, la palabra era: " + palabraSacreta.toUpperCase());
        }

        scanner.close();

    }
}
