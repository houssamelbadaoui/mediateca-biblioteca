package mediateca;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorMediateca {

    static ArrayList<ItemBiblioteca> catalogo = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

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
                case 2:
                    anadirItem();
                    break;
                case 3:
                    modificarTitulo();
                    break;
                /*case 4:
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
    public static void anadirItem() {
        System.out.println("Tipo de material:");
        System.out.println("1. Libro");
        System.out.println("2. Revista");
        System.out.println("3. DVD");

        // to choose one option
        int tipo = scanner.nextInt();
        scanner.nextLine();

        // the ID
        System.out.println("ID: ");
        String id = scanner.nextLine();

        // titulo
        System.out.println("Titulo: ");
        String titulo = scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.println("Autor: ");
                String autor = scanner.nextLine();

                Libro libro = new Libro(id, titulo, autor);
                catalogo.add(libro);
                break;
            case 2:
                System.out.println("Numero de edicion: ");
                int edicion = scanner.nextInt();
                scanner.nextLine();

                Revista revista = new Revista(id, titulo, edicion);
                catalogo.add(revista);
                break;

            case 3:
                System.out.println("Director: ");
                String director = scanner.nextLine();

                DVD dvd = new DVD(id, titulo, director);
                catalogo.add(dvd);
                break;
            default:
                System.out.println("Tipo invalido");
        }
        System.out.println("Item añadido al catalogo.");
    }

    // method that find an item inside our list using ID
    public static ItemBiblioteca buscarItemPorId(String id) {

        for(ItemBiblioteca item : catalogo) {
            if(item.getId().equals(id)){
                return item;
            }
        }
        return  null;
    }

    // method that will help us modificar el titulo de un item en la lista
    public static  void modificarTitulo() {
        System.out.println("Introduce el ID del item: ");
        String id = scanner.nextLine();

        // search for that item using ID
        ItemBiblioteca item = buscarItemPorId(id);

        // if not found
        if(item == null) {
            System.out.println("Item no encontrado");
            return;
        }
        System.out.println("Nuevo titulo: ");
        String nuevoTitulo = scanner.nextLine();

        item.setTitulo(nuevoTitulo);

        System.out.println("Titulo actualizado correctamente.");
    }
}
