import java.util.Scanner;

public class A1E9 {
    public static void main(String[] args) {
            String palabra1, palabra2;
            String intercambio;
            Scanner scanner = new Scanner(System.in);

       System.out.println("Intercambio de Palabras");
       System.out.println("Ingrese la primer palabra");
            palabra1 = scanner.nextLine();
       System.out.println("Ingrese la segunda palabra");
            palabra2 = scanner.nextLine();
            
            intercambio = palabra1;
            palabra1 = palabra2;
            palabra2 = intercambio;
        System.out.println("El contenido de la primer palabra es: " + palabra1 + " el contenido de la segunda es: " + palabra2 );
        scanner.close();

    }
}
