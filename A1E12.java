import java.util.Scanner;

public class A1E12 {
    public static void main(String[] args) {
        Double celsius, intercambio;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los grados en celsius para hacer el intercambio a fahrenheit");
            celsius = scanner.nextDouble();
            intercambio = (celsius * 9/5) + 32;
        System.out.println("La temperatura de celsius a fahrenheit es: " + intercambio);
        scanner.close();
    }
}
