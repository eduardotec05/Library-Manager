
package libraries;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class: Others
 * This class serves as a utility helper for the library management system. 
 * It provides a method to verify whether an ID already exists in a specified file.
 */
public class Others {

    /**
     * Method: idDuplicate
     * Checks if a given ID exists in the specified file.
     * 
     * @param id       The ID to check for duplicates.
     * @param filePath The path to the file where the ID should be searched.
     * @return         True if the ID exists in the file, false otherwise.
     */
    public boolean idDuplicate(String id, String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(","); // Assuming data is stored in CSV format (e.g., "id,name,lastNameP,lastNameM")
                if (parts.length > 0 && parts[0].trim().equals(id)) { // Check if the first field matches the given ID
                    return true;
                }
            }
        } catch (IOException e) {
            // Handles file not found or read errors gracefully
            System.out.println("Error reading the file: " + e.getMessage());
        }
        return false;
    }
}