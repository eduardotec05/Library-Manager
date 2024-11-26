
package Libraries;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Class: FileManager
 * Provides functionality for managing file operations such as saving data to a file.
 * 
 * This class is designed to handle the creation or appending of data to a specified file.
 * It ensures that data is saved in a persistent way for later retrieval or processing.
 * 
 * Author: lalot
 */
public class FileManager {

    private String filePath; // The path of the file to manage

    /**
     * Constructor for FileManager.
     * Initializes the class with the path to the file where data will be saved.
     * 
     * @param filePath The path of the file to manage.
     */
    public FileManager(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Saves data to the specified file.
     * This method appends the given data to the file. If the file does not exist, 
     * it will be created. Data is written and flushed immediately to ensure 
     * that the file content is updated.
     * 
     * @param data The data to be saved in the file.
     * @throws IOException If an I/O error occurs during the operation.
     */
    public void saveData(String data) throws IOException {
        try (FileWriter writer = new FileWriter(filePath, true)) { // Open in append mode
            writer.write(data); // Write the data to the file
            writer.flush(); // Ensure the data is flushed to the file
        }
    }
}
