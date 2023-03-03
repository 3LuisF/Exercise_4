package ejercicio_4_edad;

import java.util.Scanner;

public class Ejercicio_4_Edad {

    public static void main(String[] args) {
        System.out.println("ingrese la edad de Juan");
        Scanner str_Juan = new Scanner(System.in);
        int Edad_Juan = str_Juan.nextInt();
        int Edad_Alberto = 2*(Edad_Juan/3);
        int Edad_Ana = 4*(Edad_Juan/3);
        int Edad_mama_Juan = Edad_Juan+Edad_Ana+Edad_Alberto;
        System.out.print("La edad de la Mama de Juan es: "+Edad_mama_Juan+"\nLa de Alberto es: "+Edad_Alberto+"\nLa de Ana es: "+Edad_Ana);
            
    }
    
}
