import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        int a; //definir edad de Juan como entero
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese edad de Juan:");
        a = entrada.nextInt(); //edad de Juan
        int edalberto = 2* a /3;//edad de Alberto
        int edana = 4* a /3; //edad de Ana
        int edmama= a + edalberto + edana; //edad de la Mama

        System.out.println("Las edades son: Alberto = " + edalberto + " Juan = " + a + " Ana = " + edana + " Mama = "+ edmama); //Salida
        
    }
}
