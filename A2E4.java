import java.util.Random;

public class A2E4 {
    public static void main(String[] args) {
        int min = 1;
        int max = 80;
        int value, mayorEdad = 0, menorEdad = 0;
        Random random = new Random();

        for (int i = 1; i <= 20; i++) {
            value = random.nextInt(max + min) + min;
            if (value >= 18) {
                mayorEdad++;
            } else {
                menorEdad++;
            }
        }
        System.out.println("Los mayores de edad son: " + mayorEdad);
        System.out.println("Los menores de edad son: " + menorEdad);
    }
}
