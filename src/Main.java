import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Cajero cajero = new Cajero();

        System.out.println("Bienvenido, Elija si es cuenta de ahorros o corriente: ");
        cajero.setTipoCuenta(input.nextLine());
        System.out.println("Digite su contraseña: ");
        cajero.setContraseña(input.nextLine());

        Saldo saldo = new Saldo();
        saldo.setSaldoAntiguo(1000000);
        cajero.setSaldo(saldo);

        System.out.println("Su saldo es: "+ cajero.getSaldo().getSaldoAntiguo());
        System.out.println("¿Que desea realizar?");
        menuCase();
    }

    public static void menuCase(){
        Scanner input = new Scanner(System.in);


        System.out.println("1. Retirar dinero " +
                "2. Enviar dinero " +
                "3. Salir");

        Saldo saldo = new Saldo();

        int num =input.nextInt();
        switch (num){
            case 1:
                System.out.println("Digite el valor a retirar");
                int num2=input.nextInt();
                int res=retirarDinero(num2);
                System.out.println("Exito! saldo actual: "+res );
              break;
            case 2:
                enviarDinero();
              break;
            default:
                System.out.println("Ha sido un placer atenderlo.");
        }

    }
    public static int retirarDinero(int num2){
        Scanner input = new Scanner(System.in);
        Saldo saldo = new Saldo();
        int resultado=saldo.getSaldoAntiguo()-num2;
        return resultado;
    }

    public static void enviarDinero(){
        Scanner input = new Scanner(System.in);

        Cajero cajero = new Cajero();
        System.out.println("Digite el numero de la cuenta: ");
        cajero.setNumeroCuenta(input.nextLine());
        System.out.println("Digite el valor a enviar: ");
        int dinero=input.nextInt();
        Saldo saldo = new Saldo();
        saldo.setSaldoNuevo(saldo.getSaldoAntiguo()-dinero);
        saldo.setSaldoAntiguo(saldo.getSaldoNuevo());
        cajero.setSaldo(saldo);
    }

}
