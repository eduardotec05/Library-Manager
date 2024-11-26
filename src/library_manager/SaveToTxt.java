package library_manager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class: SaveToTxt
 * This class provides methods to save user and book data into text files. 
 * The data is appended to the file in a format that allows easy retrieval and manipulation.
 */
public class SaveToTxt {

    /**
     * Method: saveDataUser
     * This method saves the user data into a text file.
     * 
     * @param user      The user object containing the data to be saved.
     * @param filePath  The path to the file where the data will be written.
     */
    public static void saveDataUser(Users user, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(user.toString()); // Call the method to convert the user data to a string

            // Line break after each user entry
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }

    /**
     * Method: saveBookToFile
     * This method saves book data into a text file.
     * 
     * @param bookData  The data of the book to be saved, as a formatted string.
     * @param filePath  The path to the file where the book data will be written.
     * @throws IOException If an I/O error occurs while writing to the file.
     */
    public static void saveBookToFile(String bookData, String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(bookData + "\n"); // Write book data followed by a new line
        }
    }
}
