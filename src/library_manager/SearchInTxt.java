/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_manager;

/**
 *
 * @author angel
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchInTxt {

    public static void searchUser(String keyword, String filePath) {
        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Resultados de la busqueda para: " + keyword);

            while ((line = reader.readLine()) != null) {
                // Busca si la línea contiene el ID o el nombre del usuario
                if (line.contains(keyword)) {
                    found = true;
                    // Imprime todas las líneas hasta encontrar el separador ("---------------")
                    do {
                        System.out.println(line); // Muestra la línea actual
                        line = reader.readLine(); // Lee la siguiente línea
                    } while (line != null && !line.equals("---------------"));
                    System.out.println("---------------"); // Imprime el separador
                }
            }

            if (!found) {
                System.out.println("No se encontró ningún usuario con el término: " + keyword);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
