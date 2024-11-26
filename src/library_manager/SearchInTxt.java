package library_manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class: SearchInTxt
 * 
 * This class allows for searching a keyword in a text file and printing the results.
 * It reads through the file line by line, and if a match for the keyword is found, 
 * it prints the matching lines until a separator "---------------" is encountered.
 */
public class SearchInTxt {

    /**
     * Method: search
     * 
     * This method searches for a given keyword in a text file and prints the lines
     * that contain the keyword. If a separator "---------------" is found after a match, 
     * it prints until this separator is encountered.
     * 
     * @param keyword   The term or phrase to search for in the file.
     * @param filePath  The path to the file where the search will take place.
     */
    public static void search(String keyword, String filePath) {
        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Resultados de la búsqueda para: " + keyword);

            // Reads each line in the file
            while ((line = reader.readLine()) != null) {
                // If the line contains the keyword, print the line and subsequent lines until separator "---------------"
                if (line.contains(keyword)) {
                    found = true;
                    // Print all the lines until the separator is encountered
                    do {
                        System.out.println(line); // Display current line
                        line = reader.readLine(); // Read next line
                    } while (line != null && !line.equals("---------------"));
                    System.out.println("---------------"); // Print separator
                }
            }

            // If no match is found, print a message indicating no match
            if (!found) {
                System.out.println("No se encontró ningún usuario con el término: " + keyword);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
