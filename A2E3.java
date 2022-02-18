import java.util.Scanner;

public class A2E3 {
    public static void main(String[] args) {
        int factorial = 1, numero = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero que desea para encontrar su factorial.");
        numero = scanner.nextInt();

        while (numero != 0) {
            factorial *= numero;

            numero--;
        }
        System.out.println("El factorial del numero ingresado es: " + factorial);

        scanner.close();
    }
}
