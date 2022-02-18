import java.util.Scanner;

public class A1E3 {
    public static void main(String[] args) {
        int num, doble, triple;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido usuario");
        System.out.println("Ingrese el numero para hallar el doble y el triple del numero ingresado.");
            num = scanner.nextInt();
            doble = num * 2;
            triple = num * 3;
        System.out.println("El doble del numero ingresado es: " + doble);
        System.out.println("El triple del numero ingresado es: " + triple);
        scanner.close();
    }
}
