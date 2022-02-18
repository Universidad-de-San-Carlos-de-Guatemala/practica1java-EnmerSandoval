import java.util.Scanner;

public class A1E16 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ingrese el primer numero para ver cual es el mayor.");
            num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero.");
            num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero");
            num3 = scanner.nextInt();
        
        if (num1 > num2)
        {
            if (num1 > num3){
            System.out.println("El primer numero es el mayor.");
            }
        }
        else 
        {
            if (num2 > num3)
            {
                System.out.println("El segundo numero es el mayor");
            }
        }
        if (num3 > num1)
        {
            if (num3 > num2)
            {
                System.out.println("El tercer numero es el mayor");
            }
        }

        scanner.close();
    }
}
