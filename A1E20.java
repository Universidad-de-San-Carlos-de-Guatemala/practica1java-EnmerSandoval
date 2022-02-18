import java.util.Scanner;
public class A1E20 {
    public static void main(String[] args) {
        int numero, numeroGuardado, invertido = 0, resto;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero de 5 digitos para verificar si es capicua.");
            numero = scanner.nextInt();

            numeroGuardado = numero;

        while( numero > 0 ) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
           
         }
        if (numeroGuardado == invertido) {
            System.out.println("El numero es capicua");
        }else {
            System.out.println("El numero no es capicua.");
        }
        
        scanner.close();
        
    }
}
