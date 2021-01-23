/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paginawebvintage;

import java.util.Scanner;

/**
 *
 * @author Alicia Canlas
 */
public class PaginaWebVintage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        boolean salir=false;
        int opcion=0;
        
        do {
            System.out.println("Gracias por visitarnos. En Vintage encontrará muebles exclusivos para dar como no,un toque vintage a su hogar.");
            System.out.println("Por favor seleccione una de las siguientes opciones");
            System.out.println();
            System.out.println("1. Aparadores");
            System.out.println("2. Mesas");
            System.out.println("3. Sillas");
            System.out.println("4. Cerámica");
            System.out.println("5. Iluminación");
            System.out.println("6. Colección Vinatage");
            System.out.println("12. Salir");
            System.out.println();
            opcion = teclado.nextInt();
            System.out.println();
            switch (opcion) {
                case 1:
                    aparadores();
                    break;
                case 2:
                    mesas();
                    break;
                case 3:
                    sillas();
                    break;
                case 4:
                    ceramica();
                    break;
                case 5:
                    iluminacion();
                    break;
                case 6:
                    salir=true; System.out.println("¡Hasta pronto!");
                    break;             
                default:
                    System.out.println("Opción no válida");
            }
        } while (!salir);
    }    
    public static void aparadores(){
}

public static void mesas(){
}

public static void sillas(){
}

public static void ceramica(){
}

public static void iluminacion(){
}
    }

