public class A2E7 {
    public static void main(String[] args) {
      double contadorPares = 0, contadorImpares = 0, contadorCeros = 0, porcentajePares = 0, porcentajeImpares = 0, porcentajeCeros;
        
        for(int i= 0; i < 15; i++){
            int numeroAleatorio = (int) Math.floor(Math.random()*37);
            System.out.println(numeroAleatorio);
            if (numeroAleatorio == 0) {
                contadorCeros++;
            } else{
                if ((numeroAleatorio % 2) == 0) {
                    contadorPares++;
                } else {
                    contadorImpares++;
                }
            }
        }
        System.out.println("Cantidad de numeros pares: " + contadorPares);
        System.out.println("Cantidad de numeros impares: " + contadorImpares);
        System.out.println("Cantidad de ceros: " + contadorCeros);
        porcentajeCeros = (contadorCeros / 15) * 100;
        porcentajeImpares = (contadorImpares / 15) * 100;
        porcentajePares = (contadorPares /15) * 100;
        System.out.println("Porcentaje de numeros pares: " + porcentajePares + "%");
        System.out.println("Porcentaje de numeros impares: " + porcentajeImpares + "%");
        System.out.println("Porcentaje de ceros: " + porcentajeCeros + "%");
        
    }
}
