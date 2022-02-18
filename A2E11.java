public class A2E11 {

	public static void main(String[] args) {
		double cantnumpares, i, impares, numdoc, numpares, pares, promedionumpares;
		int major, n;
		major = 0;
		impares = 0;
		pares = 0;
		numpares = 0;
		numdoc = 0;

		cantnumpares = 0;
		for (i=1;i<=10;i++) {
			 n = (int)(Math.random()*36);
			if ((n%2==0)) {
				if (n==0) {
					System.out.println("El numero 0 se ha omitido");
				} else {
					pares = pares+n;
					numpares = numpares+1;
					cantnumpares = numpares;
				}
			} else {
				impares = impares+1;
			}
			
			if (n<24 && n>13) {
				numdoc = numdoc+1;
			}
			if (n > major) {
				n = major;
			}
		}
		promedionumpares = pares/cantnumpares;
		System.out.println("El numero mayor es: "+major);
		System.out.println("Cantidad de numeros impares: "+impares);
		System.out.println("Promedio de numeros pares: "+promedionumpares);
	}


}