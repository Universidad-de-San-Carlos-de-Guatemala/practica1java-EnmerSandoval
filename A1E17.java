import java.util.Scanner;

public class A1E17 {
    public static void main(String[] args) {
        int lado1, lado2, lado3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para ver el tipo de triangulo que es ingrese el primer lado.");
        lado1 = scanner.nextInt();
        System.out.println("Ingrese el segundo lado del triangulo.");
        lado2 = scanner.nextInt();
        System.out.println("Ingrese el tercer lado del triangulo.");
        lado3 = scanner.nextInt();

        if (lado1 == lado2) {
            if (lado2 == lado3) {
                System.out.println("Es un triangulo Equilatero");
            }
        }

        if (lado1 == lado2) {
            if (lado1 != lado3) {
                System.out.println("El triangulo es Isoceles.");
            }
        }

        else if (lado1 > lado2) {
            if (lado1 == lado3) {
                System.out.println("Es un triangulo es Isoceles");
            }
        }

        if (lado2 == lado3) {
            if (lado1 != lado3) {
                System.out.println("Es un triangulo Isoceles");
            }
        }
        if (lado1 != lado2) {
            if (lado2 != lado3) {
                if (lado3 != lado1) {
                    System.out.println("Es un triangulo Escaleno.");
                }
            }
        }
        scanner.close();
    }
}
