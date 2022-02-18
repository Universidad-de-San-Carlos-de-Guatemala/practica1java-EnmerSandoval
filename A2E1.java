import java.util.Scanner;
import java.util.Random;

public class A2E1 {
    public static void main(String[] args) {
        int n, value, pares, totalPares = 0, totalImpares = 0;
        int min = 1;
        int max = 100;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese el numero de numeros aleatorios que quiere.");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            value = random.nextInt(max + min) + min;
            System.out.println(value);
            pares = value % 2;
            if (pares == 0) {
                totalPares++;

            } else {
                totalImpares++;

            }

        }
        System.out.println("Los numeros pares son: " + totalPares);
        System.out.println("Los numeros impares son: " + totalImpares);
        scanner.close();
    }
}