import java.util.*;

public class A2E8 {

	public static void main(String[] args)  {
		int n;
		String s="a";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Multiplos de 5");
		while (!s.equals("a")) {
			n = 5*(int)(Math.random()*1000);
			System.out.println("Multiplo de 5 : "+n);
			System.out.println(" Escriba: s, si desea que el programa acabe, si no, presione ENTER");
			s = scanner.next();
		}
        scanner.close();
	}


}