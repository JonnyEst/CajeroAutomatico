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
        System.out.println(casos());
        System.out.println("¿Que desea realizar?");
        System.out.println("1. Retirar dinero \n" +
                "2. Enviar dinero \n" +
                "3. Salir");

        int valorAntiguo = cajero.getSaldo().getSaldoAntiguo();
        System.out.println(valorAntiguo);


    }


    public static Saldo casos(){
        Cajero cajero = new Cajero();
        int numero= cajero.getSaldo().getSaldoAntiguo();
        Saldo saldo = new Saldo();
        saldo.getSaldoAntiguo();
        return saldo;
    }

    public static void menuCase(){
        Scanner input = new Scanner(System.in);
        Cajero cajero = new Cajero();
        int valorAntiguo = cajero.getSaldo().getSaldoAntiguo();

        System.out.println("1. Retirar dinero \n" +
                "2. Enviar dinero \n" +
                "3. Salir");

        Saldo saldo = new Saldo();

        int num =input.nextInt();
  /*      switch (num){
            case 1:
                System.out.println("Digite el valor a retirar");
                int num2 = input.nextInt();
                int result = valorAntiguo-num2;
                System.out.println("Resultado: "+result);
                int res=0;
                System.out.println("Exito! saldo actual: "+res );
              break;
            case 2:
                enviarDinero();
              break;
            default:
                System.out.println("Ha sido un placer atenderlo.");
        }*/

    }
    public static Integer retirarDinero(int num2){
        Saldo saldo = new Saldo();
        Cajero cajero = new Cajero();
        int saldoViej=cajero.getSaldo().getSaldoAntiguo();
        int num3;
        int resource=6;
        int resultado=saldoViej-num2;

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
