import java.util.Scanner;

public class A1E11 {
    public static void main(String[] args) {
        double centimetros, yardas, metros, pies, pulgadas;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad en centimetros que quiera convertir.");
            centimetros = scanner.nextDouble();
                yardas = centimetros * 0.0109361;
                metros = centimetros * 0.01;
                pies = centimetros * 0.0328084; 
                pulgadas = centimetros*  0.393701;
        System.out.println("La medida de centimetros a yardas es de: " + yardas);
        System.out.println("La medida de centimetros a metros es de: " + metros);
        System.out.println("La medida de centimetros a pies es de: " + pies);
        System.out.println("La medida de centimetros a pulgadas es de: " + pulgadas);
        scanner.close();
    }
}
