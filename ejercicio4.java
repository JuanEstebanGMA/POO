import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        float a; //valor indicado como float para permitir decimales
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese a:");
        a = entrada.nextFloat();
        System.out.println("El cuadrado de " + a + " es " + a*a); //Salida del cuadrado del numero
        System.out.println("El cubo de " + a + " es " + a*a*a);//Salida del cubo del numero
    }
}
