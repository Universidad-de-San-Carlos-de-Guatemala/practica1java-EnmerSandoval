import java.util.*;

public class A2E10 {

	public static void main(String[] args) {
		double multiplos, n, n1, sumatoria, sumatoria2;
		Scanner scanner = new Scanner (System.in);
		
		sumatoria = 0;
		multiplos = 0;
		sumatoria2 = 0;
		while (sumatoria<=1000) {
			System.out.println("Ingrese el primer numero");
			n = scanner.nextDouble();
			System.out.println("Ingrese el segundo numero");
			n1 = scanner.nextDouble();
			sumatoria2 = n + n1;
			System.out.println(+sumatoria);
			if ((n % 6==0)) {
				multiplos = multiplos++;
			} else {
				if ((n1 % 6==0)) {
					multiplos = multiplos++;
				} else {
					System.out.println("El numero NO es un multiplo de 6");
				}
				if (n>=1 && n<=10) {
					sumatoria2 += n;
				} else {
					if (n1>=1 && n1<=10) {
						sumatoria2 += n1;
					} else {
						System.out.println("No hay numeros entre 1 y 10");
					}
				}
			}
		}
		System.out.println("Cantidad de números multiplos de 6: "+multiplos);
		System.out.println("Sumatoria de números en el rango: l al 10: "+sumatoria2);
        scanner.close();
	}

    
}