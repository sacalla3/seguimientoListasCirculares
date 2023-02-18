package ui;

import java.util.Scanner;
import model.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();
        Boolean startMenu = true;

    
        while(startMenu){

            System.out.println("Seleccione una opcion: \n [1] Dar Turno \n [2] Mostrar turno actual \n [3] Pasar turno \n [4] Seguir \n [0] Salir");
            
            switch(sc.nextInt()){

                case 1:{
                    controller.agregarTurno();
                    System.out.println("Turno agregado");
                    break;
                }
                case 2:{
                    System.out.println("Turno actual: " + controller.mostrarTurno());
                    break;
                }
                case 3:{
                    controller.pasarTurno();
                    System.out.println("Turno saltado");
                    break;
                }
                case 4:{
                    controller.seguirTurno();
                    System.out.println("Turno eliminado");
                    break;
                }
                case 0:{
                    System.out.println("Saliendo...");
                    startMenu = false;
                    break;
                }
            }

        System.out.println("***");
        controller.getList().print();
        }
    }
}
