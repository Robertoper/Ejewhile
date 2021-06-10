import java.util.Random;

public class Dados {
    public static void main(String[] args) {
        int dado1;
        int dado2;
        Random numeroAleatorio= new Random();
        System.out.println("¡AQUI VAN LAS TIRADAS!");

        int valorDado1= numeroAleatorio.nextInt(6)+1;
        int valorDado2= numeroAleatorio.nextInt(6)+1;
        System.out.println("Dado#1= "+ valorDado1);
        System.out.println("Dado#2= "+ valorDado2);


    }

}
