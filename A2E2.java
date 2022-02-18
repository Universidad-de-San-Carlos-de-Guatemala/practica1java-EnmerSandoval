import java.util.Scanner;

public class A2E2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero para llegar hasta 1.");
        n = scanner.nextInt();

        for (int i = n; i >= 1; i = i - 1) {
            System.out.println(i);
        }

        scanner.close();

    }
}
