import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = entrada.nextDouble(); //Definimos el radio con un double para poder aplicar las ecuacion de area y perimetro

        double area = Math.PI * radio * radio; //area de la circuferencia
        double circunferencia = 2 * Math.PI * radio; //Perimetro del circulo 
        //Salida
        System.out.println("El área del círculo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + circunferencia);

    }
}