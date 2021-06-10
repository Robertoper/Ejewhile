import java.util.Scanner;

public class whileContandno {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Escribe un mensaje, y lo mostrare 5 veces.");
        System.out.println("Mensaje: ");
        String mensaje= teclado.nextLine();

        int contador = 0;
        while (contador< 5){
            System.out.println((contador+1) + ". "+ mensaje);
            contador++;
        }
    }
}
