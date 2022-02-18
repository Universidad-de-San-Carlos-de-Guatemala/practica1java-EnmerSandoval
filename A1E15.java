
import java.util.Scanner;


public class A1E15 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero para ver si es positivo, negativo o nulo.");
            num = scanner.nextInt();
        
            if (num > 0)
            {
                System.out.println("El numero es positvo");
            }

            else if (num < 0)
            {
                System.out.println("El numero es negativo.");
            }
            if (num == 0 )
            {
                System.out.println("El numero es nulo.");
            }
            
            scanner.close();
    }
}
