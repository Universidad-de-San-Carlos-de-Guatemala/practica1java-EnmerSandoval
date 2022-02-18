import java.util.Scanner;

public class A1E1 {
    public static void main(String[] args) {

        int num1, num2, operacion;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido Usuario");
        System.out.println("\n");
        System.out.println("Ingrese la primera cantidad a sumar.");
            num1 = scanner.nextInt();
        System.out.println("Ingrese la segunda cantidad a sumar.");
            num2 = scanner.nextInt();
            operacion = num1 + num2;
        System.out.println("El resultado es: " + operacion);
        
            scanner.close();
    }
}
