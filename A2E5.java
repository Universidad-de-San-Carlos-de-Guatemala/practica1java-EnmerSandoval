import java.util.Scanner;

public class A2E5 {
    public static void main(String[] args) {
        int personas, edad, mujeres = 0, hombres = 0;
        boolean sexo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas que quiere registrar con edad y sexo.");
        personas = scanner.nextInt();

        for (int i = 1; i <= personas; i++) {
            System.out.println("Ingrese la edad.");
            edad = scanner.nextInt();
            System.out.println("Ingrese el sexo siendo false femenino y true masculino.");
            sexo = scanner.nextBoolean();
            if (edad >= 18 && sexo == false) {
                mujeres++;
            } else if (edad < 18 && sexo == true) {
                hombres++;
            }
        }
        System.out.println("Las mujeres mayores de edad son: " + mujeres);
        System.out.println("Los hombres menores de edad son: " + hombres);

        scanner.close();
    }
}
