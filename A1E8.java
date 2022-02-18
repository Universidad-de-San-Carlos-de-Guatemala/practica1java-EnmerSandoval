import java.util.Scanner;

public class A1E8 {
    public static void main(String[] args) {
        int num1, num2, num3, operacion;

        Scanner scanner = new Scanner(System.in);

    System.out.println("Bienvenido usuario, para sacar el promedio ingrese tres numeros");
    System.out.println("Ingrese el primer numero");
        num1 = scanner.nextInt();
    System.out.println("Ingrese el segundo numero."); 
        num2 = scanner.nextInt();
    System.out.println("Ingrese el tercer numero");
        num3 = scanner.nextInt();
    
            operacion = (num1 + num2 + num3) / 3;
    System.out.println("El promedio de los 3 numeros ingresados es: " + operacion);
    scanner.close();

    }
}
