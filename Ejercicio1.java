import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

            //Agregar el system.in
            Scanner s = new Scanner(System.in);

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
            String j1 = s.nextLine();

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
            Scanner s2 = new Scanner(System.in);
            //agregar el s2
            String j2 = s2.nextLine();
            //agregar boolean
    boolean evaluar = true;
    if (j1.equals(j2)) {
                System.out.println("Empate");
            } else {
        int g = 2;
        switch (j1) {
            case "piedra": {
                if (j2.equals("tijeras")) {
                    g = 1;
                }
            }
            //agregar break;
            break;

            case "papel": {
                if (j2.equals("piedra")) {
                    g = 1;

                }
                //agregar break
                break;
            }

                case "tijera": {
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    //agregar break
                    break;

                }
                default:{
                    //agregar sout y evaluar para salir en la siguiente impresion
                    System.out.println("Valor invalido");
                    evaluar = false;

                }
            }
            //agregar clausula
            if(evaluar){
                System.out.println("Gana el jugador " + g);
            }

        }

    }


}
