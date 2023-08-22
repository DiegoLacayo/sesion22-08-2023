import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner lector = new Scanner(System.in);

        float Altura, Anchuar, Largo;

        System.out.println("Altura: ");
        Altura = lector.nextFloat();
        System.out.println("Anchuar: ");
        Anchuar = lector.nextFloat();
        System.out.println("Largo: ");
        Largo = lector.nextFloat();

        float Volumen = Altura * Anchuar * Largo;
        System.out.println("El Volumen de Anchuar es de: " + Volumen + " Kilometros Australianos ");
        lector.close();


    }
}
