import java.util.Scanner;

public class A1E13 {
    public static void main(String[] args) {
        double pi = 3.1416;
        double radio, altura, operacion;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Para calcular el volumen del cilindro ingrese el radio.");
            radio = scanner.nextDouble();
        System.out.println("Ingrese la altura.");
            altura = scanner.nextDouble();

            operacion = pi * radio * radio * altura;
        System.out.println("El volumen del cilindro con los datos ingresados es: " + operacion);
        scanner.close();

    }
}