/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author David Massana
 */
public class Zoologico {
    
    static Scanner key = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Animal> animales = new ArrayList<>();
        Tigre t = new Tigre("Tigre Siberiano", "Carne", "Blanco con rayas negras", 'M', "Onduladas");
        Serpiente s = new Serpiente(true, "Inyecta el veneno a la presa", 2.5, "Serpiente cascabel", "Carne", "Gris", 'F');
        Vaca v = new Vaca("Vaca", "Plantas", "Blanca con manchas negras", 'F', 250);
        
        System.out.println("BIENVENIDOS AL ZOOLOGICO. NUESTRAS ESPECIES: ");
        animales.add(t);
        animales.add(s);
        animales.add(v);
        
        for (int i = 0; i < animales.size(); i++) {
            System.out.println(animales.get(i).getEspecie());
        }
        int opc;
        do{
            System.out.println("\n¿QUE DESEA HACER?");
            System.out.println("1. VER MAS DATOS DE LAS ESPECIE.");
            System.out.println("2. VER A UNA ESPECIE REALIZANDO ACCIONES.");
            System.out.println("3. SALIR DEL ZOOLOGICO.");
            System.out.println("\n INGRESE OPCION: ");
            opc = key.nextInt();
            switch(opc){
                case 1:
                    for (int i = 0; i < animales.size(); i++) {
                        System.out.println(animales.get(i).toString());
                    }
                    break;
                case 2:
                    System.out.println("ELIJA LA ESPECIE: ");
                    for (int i = 0; i < animales.size(); i++) {
                        System.out.println(i + ". " + animales.get(i).getEspecie());
                    }
                    System.out.print("SU ELECCION: ");
                    int opc2 = key.nextInt();
                    switch(opc2){
                        case 0:
                            System.out.println("¿QUE ACCION DESEA QUE REALIZE?");
                            System.out.println("1. Hablar");
                            System.out.println("2. Dormir");
                            System.out.println("\nSu eleccion: ");
                            int opc3 = key.nextInt();
                            if (opc3 == 1) {
                                
                            }
                    }
                    break;
                case 3:
                    
            }
        }while(opc != 3);
    }
    
}

