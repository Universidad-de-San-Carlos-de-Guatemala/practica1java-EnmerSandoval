package Ejercicios2;
import java.util.Scanner;

public class A2E12 {

    public static void main(String[] args) {

        try (Scanner reader = new Scanner(System.in)) {
            {

                int F = 0;
                int E = 0;
                int H = 0;
                int sexo = 0;
                int HM = 0;
                int Pmujeres = 0;
                int Phombres = 0;
                int PM = 0;
                int PH = 0;
                int ed = 0;
                int EDAD = 0;
                int B = 0;
                int HH = 0;

                do {
                    System.out.println("ingrese el sexo, masculino (ingrese 1), femenino (ingrese 0)");
                    sexo = reader.nextInt();
                    if (sexo == 0) {
                        System.out.println("Ingrese la edad ");
                        E = reader.nextInt();
                        ed = ed + E;
                        B++;
                        F++;
                        System.out.println("Ingrese una altura ");
                        HH = reader.nextInt();
                        Pmujeres = Pmujeres + HH;
                        PM = Pmujeres / F;
                    } else if (sexo == 1) {
                        System.out.println("ingrese la edad ");
                        E = reader.nextInt();
                        ed = ed + E;
                        B++;
                        H++;
                        System.out.println("Ingrese una altura ");
                        HM = reader.nextInt();
                        Phombres = Phombres + HM;
                        PH = Phombres / H;
                    }
                } while (E != 0);
                EDAD = ed / B;
                System.out.println("el promedio de altura de los hombre es de " + PH + " y de las mujeres de " + PM
                        + ", la edad promedio es " + EDAD);
            }
        }
    }
}