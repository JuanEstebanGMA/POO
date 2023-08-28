import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        float SUMA = 0; //Definir la suma como float ya que la prueba indica que tiene decimales
        float x = 20;
        SUMA= SUMA + x;
        float y = 40;
        x = x+y*y;
        SUMA= SUMA + x / y; //respectiva operacion 
        System.out.println("EL VALOR DE LA SUMA ES: "+ SUMA);//Salida

        
    }
    
}
