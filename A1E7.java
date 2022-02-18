import java.util.Random;


public class A1E7 {
    public static void main(String[] args) {
        int min = 10;
        int max = 50;
        int value, operacion, operacion1;
        Random random = new Random();
        
        value = random.nextInt(max + min) + min;

        System.out.println(value);
            operacion = (value * 15) / 100;
            operacion1 = value - operacion;
        System.out.println("El numero ingresado disminuido al 15% es: " + operacion1);
    }
    
}
