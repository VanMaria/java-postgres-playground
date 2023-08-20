package com.example;

public class tresMaisUm {
    public static void main (String[] args) {
        int numero = 13;
        System.out.println("Iniciando...\n"	+	numero);
        while (numero != 1){
            if ( numero % 2 == 0 ) {
                System.out.print(" numero é par: " + numero); // imprime na msm linha
                numero /=2;
            }
            else {
                System.out.println(" numero é impar: "+ numero); // pula uma linha
                numero = (3 * numero * 3) + 1;
            }
        }
    }
    
}
