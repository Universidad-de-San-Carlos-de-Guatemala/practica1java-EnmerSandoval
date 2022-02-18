package Ejercicios2;
import java.util.Scanner;

public class A2E13 {

    public static void main(String[] args) {

        try (Scanner reader = new Scanner(System.in)) {
            {

                int OPERACION = 0;
                int Salir = 1;
                int num1 = 0;
                int num2 = 0;
                int SUMA = 0;
                int MULTI = 0;

                do {

                    System.out.println(
                            "ingrese el operacion, Suma: ingrese 0, multiplicacion: ingrese 1 O 2 PARA SALIR");
                    OPERACION = reader.nextInt();


                    if (OPERACION == 0) {
                        System.out.println("Ingrese el primer numero");
                        num1 = reader.nextInt();
                        System.out.println("Ingrese el segundo numero");
                        num2 = reader.nextInt();
                        SUMA = num1 + num2;
                        System.out.println("EL RESUSLTADO ES: " + SUMA);

                    } else if (OPERACION == 1) {
                        System.out.println("Ingrese el primer numero");
                        num1 = reader.nextInt();
                        System.out.println("Ingrese el segundo numero");
                        num2 = reader.nextInt();
                        MULTI = num1 * num2;
                        System.out.println("EL RESUSLTADO ES: " + MULTI);

                    }
                    if (OPERACION == 2) {

                         Salir++ ;

                    } 

                } while (Salir != 2);
            }
        }
    }
}