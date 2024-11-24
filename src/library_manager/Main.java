/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library_manager;

/**
 *
 * @author lalot
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String filePath = "users.txt";
        boolean running = true;

        while (running) {
            System.out.println("Menu de opciones:");
            System.out.println("1. Registrar un nuevo usuario");
            System.out.println("2. Buscar un usuario");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opcion: ");
            int option = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            switch (option) {
                case 1:
                    // Registro de un nuevo usuario
                    System.out.println("Registro");
                    System.out.println("Ingresa la id: ");
                    String id = sc.nextLine();
                    System.out.println("Ingrese el nombre: ");
                    String name = sc.nextLine();
                    System.out.println("Ingrese el apellido paterno: ");
                    String last_name_p = sc.nextLine();
                    System.out.println("Ingrese el apellido materno: ");
                    String last_name_m = sc.nextLine();
                    System.out.println("Está dado de alta? (true/false): ");
                    boolean discharged = sc.nextBoolean();
                    sc.nextLine(); // Consumir el salto de línea
                    System.out.println("Libros prestados: ");
                    String borrow_books = sc.nextLine();

                    Users user = new Users(id, name, last_name_p, last_name_m, discharged, borrow_books);
                    SaveToTxt.saveDataUser(user, filePath);
                    System.out.println("Usuario registrado exitosamente.\n");
                    break;

                case 2:
                    // Buscar un usuario
                    System.out.println("Buscar usuario");
                    System.out.println("Ingresa el ID o el nombre para buscar: ");
                    String keyword = sc.nextLine();
                    SearchInTxt.searchUser(keyword, filePath);
                    break;

                case 3:
                    // Salir del programa
                    running = false;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        sc.close();
    }
    
}
