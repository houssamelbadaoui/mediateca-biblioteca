package mediateca;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorMediateca {

    static ArrayList<ItemBiblioteca> catalogo = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        catalogo.add(new Libro("1", "El Quijote", false, "Cervantes"));
        catalogo.add(new DVD("2", "MAtrix", false, "wachowski"));
        catalogo.add(new Revista("3", "National Geographic", false, 120));
        int opcion;

        do{
            System.out.println("Mediateca");
            System.out.println("1. Mostrar catalogo");
            System.out.println("2. Añadir item");
            System.out.println("3. Modificar titulo");
            System.out.println("4. Prestar item");
            System.out.println("5. Devolver item");
            System.out.println("6. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    mostrarCatalogo();
                    break;
                /*case 2:
                    añadirItem();
                    break;
                case 3:
                    modificarTitulo();
                    break;
                case 4:
                    prestarItem();
                    break;
                case 5:
                    devolverItem();
                    break;*/
            }
        }while (opcion != 6);
    }
    // method that shows the catalogo
    public static void mostrarCatalogo() {
        if(catalogo.isEmpty()){
            System.out.println("El catalogo esta vacio.");
            return;
        }
        System.out.println("CATALOGO:");
        for(ItemBiblioteca item : catalogo){
            System.out.println(item);
        }
    }

    // Method to add items

}
