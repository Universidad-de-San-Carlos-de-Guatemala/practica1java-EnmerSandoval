import java.util.Scanner;
public class A1E14 {
    public static void main(String[] args) {
        int num1, num2, operacion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para calcular si dos numeros son divisibles ingrese el primer numero");
            num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero.");
            num2 = scanner.nextInt();
            operacion = num1 % num2;
        if (operacion == 0){
            System.out.println("El segundo numero es divisble del primero");
        }

        else {
            System.out.println("El segundo numero no es divisible");
        }

        scanner.close();
    }
}
