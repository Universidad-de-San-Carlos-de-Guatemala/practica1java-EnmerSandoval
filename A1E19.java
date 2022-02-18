import java.util.Random;

public class A1E19 {
    public static void main(String[] args) {

        int min = 1;
        int max = 30;
        int value, operacion;

        Random random = new Random();

        value = random.nextInt(max + min) + min;
        System.out.println(value);
        operacion = value % 5;

        if (operacion == 0 && value < 26) {
            System.out.println("Correcto");
        } 

    }
}
