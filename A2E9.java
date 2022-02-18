import java.util.*;

public class A2E9 {

	public static void main(String[] args) {
		double ctrl, promed, t1, t2, t3;
		Scanner scanner = new Scanner(System.in);

		ctrl = 0;
		t1 = 1;
		t2 = 1;

			System.out.println("Ingrese la temperatura en grados celsiuis en rango de 5 a 15");
			t1 = scanner.nextDouble();
			System.out.println("Ingrese la temperatura en grados celsiuis en rango de 5 a 15");
			t2 = scanner.nextDouble();

			t3 = t1 + t2;
	
	

			if (t1<5 || t1>15 || t2<5 || t2>15) {
				System.out.println("Temperatura no valida ");
			}
			else {
				ctrl++;
			}	
		
		
		
		promed = t3/ctrl;
		System.out.println("El promedio de temperaturas es: "+promed);
		scanner.close();
	}


}