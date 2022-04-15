import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digita tu nombre");
        String nombre = lectura.nextLine();

        System.out.println("Digita tu numero de celular");
         String numeroCelular = lectura.nextLine();

        System.out.println("Digita tu edad");
        int edad = lectura.nextInt();

        System.out.println("Bienvenido señor "+nombre+ ", es un placer para nosotros contar con una persona de  "+edad+ "\n" + " años. " +
        "proximamente nos comunicaremos con usted al numero " + numeroCelular);

    }
}
