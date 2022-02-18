import java.util.Scanner;
public class A1E18 {
    public static void main(String[] args) {
        String num1;
        int num2 = 0;
        int numero1 = 0, numero2 = 0, numero3 = 0, numero4 = 0;

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una numero no mayor a cuatro digitos");
            num1 = scanner.nextLine();
        
        for (int n = 0; n < num1.length(); n++){
            num2++;
        }
        
        if (num2 > 4)
        {
            System.out.println("El numero ingresado es mayor a 4 digitos");
        }
        
        if (num2 == 1)
        {
            System.out.println("d1= " + num1.substring(0,1));
            numero1 = Integer.parseInt(num1.substring(0,1));
            System.out.println("La suma es: " + numero1);
        }


        if (num2 == 2)
        {
            System.out.println("d1= " + num1.substring(0,1));
            System.out.println("d2= " + num1.substring(1,2));
            numero1 = Integer.parseInt(num1.substring(0,1));
            numero2 = Integer.parseInt(num1.substring(1,2));
            System.out.println("La suma es: " + numero1 + numero2);
        }


        if (num2 == 3)
        {
            System.out.println("d1= " + num1.substring(0,1));
            System.out.println("d2= " + num1.substring(1,2));
            System.out.println("d3= " + num1.substring(2,3));
            numero1 = Integer.parseInt(num1.substring(0,1));
            numero2 = Integer.parseInt(num1.substring(1,2));
            numero3 = Integer.parseInt(num1.substring(2,3));
            System.out.println("La suma es: " + numero1 + numero2 + numero3);

        }
        if (num2 == 4)
        {
            System.out.println("d1= " + num1.substring(0,1));
            System.out.println("d2= " + num1.substring(1,2));
            System.out.println("d3= " + num1.substring(2,3));
            System.out.println("d4= " + num1.substring(3,4));
            numero1 = Integer.parseInt(num1.substring(0,1));
            numero2 = Integer.parseInt(num1.substring(1,2));
            numero3 = Integer.parseInt(num1.substring(2,3));
            numero4 = Integer.parseInt(num1.substring(3,4));
            System.out.println("La suma es: " + numero1 + numero2 + numero3 + numero4);

        }
        

        scanner.close();
   
   
    }
}
