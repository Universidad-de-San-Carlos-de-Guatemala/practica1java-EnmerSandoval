import java.util.Scanner;

public class A1E10 {
    public static void main(String[] args) {
        int base, altura, permitro, area;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base y la altura del area y permitro de un rectangulo.");
        System.out.println("Ingrese la base del rectangulo.");
            base = scanner.nextInt();
        System.out.println("Ingrese la altura del rectangulo.");
            altura = scanner.nextInt();
            
            permitro = (2*base) + (2*altura);
            area = base * altura;
        System.out.println("El area del rectangulo es: " + area + " el permitro de es: " + permitro );
        scanner.close();
        
    }
}
