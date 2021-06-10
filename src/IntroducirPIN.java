import java.util.Scanner;

public class IntroducirPIN {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int pin= 1234;
        int entrada;
        System.out.println("BIENVENIDO AL BANCO DEL LUISMA");
        System.out.println("Introduzca PIN: ");
        entrada= teclado.nextInt();

        while (entrada!=pin){
            System.out.println("PIN INCORRECTO. PRUEBE DE NUEVO");
            System.out.println("INTRODUZCA SU PIN");
            entrada= teclado.nextInt();
        }
        System.out.println("PIN CORRECTO. PUEDE ACCEDER A SU CUENTA");
    }
}
