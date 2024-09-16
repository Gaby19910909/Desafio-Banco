import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cliente = "Tony Stark";
        System.out.println("Nombre del cliente: "+ cliente);
        String cuenta = "corriente";
        System.out.println("Tipo de cuenta: "+ cuenta);
        double saldo = 1599.99;
        System.out.println("Saldo disponible:"+ saldo);
        int opcion;

        do {


            System.out.println("Escriba el numero de la opcion deseada:");

            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("9 - Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actual es:" + saldo);
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que quieres retirar?");
                    int dineroRetiro = sc.nextInt();
                    if (dineroRetiro > saldo) {

                        System.out.println("Operacion NO EXITOSA, Saldo a retirar mayor al saldo actual. Intente de nuevo ");
                    } else {
                        System.out.println("Saldo restante: " + (saldo - dineroRetiro));
                        break;
                    }
                case 3:
                    System.out.println("¿Cual es el valor que vas a depositar?");
                    int dineroDeposito = sc.nextInt();
                    System.out.println("Saldo actualizado es:" + (saldo + dineroDeposito));
                    break;
                case 9:
                    System.out.println("Finalizacion del programa. Muchas gracias por usar nuestro servicios");
                    break;

                default:
                    System.out.println("Opcion no valida intente de nuevo");

            }
        }while (opcion!=9);
        }

    }
