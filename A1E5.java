import java.util.Scanner;



public class A1E5 {
    public static void main(String[] args) {
        int num, suma;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido Usuario");
        System.out.println("Ingresar un numero para conocer el que le sigue.");
            num = scanner.nextInt();
                suma = num + 1;
        System.out.println("El numero siguiente al ingresado es: " + suma);
        scanner.close();

    }
}
