public class ejercicio3 {
    public static void main(String[] args) {
        int horas = 48; //horas trabajadas
        int tarifa = 5000; //Tarifa pagada por hora trabajada
        double porcentaje = 0.125; //porcentaje de retencion de la fuente

        int salarioBruto = horas * tarifa; //Salario bruto es igual a las horas trabajadas por la tarifa pagada
        double retencion = salarioBruto * porcentaje; //porcentaje de retencion de la fuente del salario bruto
        int salarioNeto = salarioBruto - (int) retencion;// Salario neto 

        //Salida
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Retención en la fuente: $" + retencion);
        System.out.println("Salario neto: $" + salarioNeto);
    }
}
