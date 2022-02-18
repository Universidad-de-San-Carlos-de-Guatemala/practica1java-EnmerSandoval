import java.util.Scanner;

public class A1E4 {
    public static void main(String[] args) {
        int num, cuadrado, cubo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido Usuario");
        System.out.println("Ingrese un numero para hallar el cuadrado y el cubo del mismo.");
            num = scanner.nextInt();
            cuadrado = num * num;
            cubo = num * num * num;
        System.out.println("El cuadrado del numero ingresado es: " + cuadrado);
        System.out.println("El cubo del numero ingresado es: " + cubo);
        scanner.close();
    }
}
