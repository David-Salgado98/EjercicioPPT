import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {


            Scanner s = new Scanner(System.in);

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
            String j1 = s.nextLine();

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
            Scanner s2 = new Scanner(System.in);
            String j2 = s2.nextLine();
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
            break;

            case "papel": {
                if (j2.equals("piedra")) {
                    g = 1;

                }
                break;
            }

                case "tijera": {
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;

                }
                default:{
                    System.out.println("Valor invalido");
                    evaluar = false;

                }
            }
            if(evaluar){
                System.out.println("Gana el jugador " + g);
            }

        }

    }


}
