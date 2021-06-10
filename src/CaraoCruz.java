import java.util.Random;
import java.util.Scanner;

public class CaraoCruz {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Random numeroAleatorio= new Random();

        String otravez;


        while ( otravez.equals("s")){
            int lanza=numeroAleatorio.nextInt(2);
            String moneda;

            if (lanza ==1);
                moneda= "CARA";
            else
                moneda="CRUZ";

            System.out.println("Has lanzado una moneda y ha salido..."+ moneda);
            System.out.print("¿Quieres lanzar de nuevo(s/n)?");
            otravez= teclado.next();
        }
    }
}
