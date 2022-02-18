import java.util.Scanner;

public class A2E6 {
    public static void main(String[] args) {
        int edades, operacion1 = 0, operacion2 = 0, mayor = 0, menor = 0;
        int promedio1, promedio2;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            System.out.println("Ingrese la edad de las 100 personas.");
            edades = scanner.nextInt();
            if (edades >= 25) {
                operacion1 += mayor;
                mayor++;
            } else if (edades <= 25) {
                operacion2 += menor;
                menor++;
            }
        }
        promedio1 = operacion1 / mayor;
        promedio2 = operacion2 / menor;

        System.out.println("El promedio de edad que tienen las personas mayores a 25 anos es: " + promedio1);
        System.out.println("El promedio de edad que tienen las personas menores a 25 anos es: " + promedio2);

        scanner.close();
    }
}
