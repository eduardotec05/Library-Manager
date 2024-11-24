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

        boolean discharged;
        String name, last_name_p,last_name_m,id, borrow_books;
        
        System.out.println("Registro");
        System.out.println("Ingresa la id: ");
        id = sc.nextLine();
        System.out.println("Ingrese el nombre: ");
        name = sc.nextLine();
        System.out.println("Ingrese el apellido paterno: ");
        last_name_p = sc.nextLine();
        System.out.println("Ingrese el apellido materno: ");
        last_name_m = sc.nextLine();
        System.out.println("Esta dado de alta?: ");
        discharged = sc.nextBoolean();
        sc.nextLine(); // Consumir el salto de línea sobrante
        System.out.println("Libros prestados: ");
        borrow_books = sc.nextLine();
        System.out.println("Se a guardado exitosamente");
        
        Users user = new Users(id,name,last_name_p,last_name_m,discharged,borrow_books);
        user.setId(id);
        user.setName(name);
        user.setLast_name_p(last_name_p);
        user.setLast_name_m(last_name_m);
        user.setDischarged(discharged);
        user.setBorrowBooks(borrow_books);
        
        SaveToTxt.saveDataUser(user, "users.txt");
    }
    
}
