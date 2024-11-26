package libraries;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Class: ManageLendings
 * This class manages lending operations in the library system, including user validation, 
 * book availability checks, stock updates, and lending/return processes.
 */
public class ManageLendings {

    // Paths to the resource files
    private static final String USERS_FILE_PATH = "C:\\Users\\lalot\\OneDrive\\Documentos\\NetBeansProjects\\FinalProject\\src\\main\\resources\\users.txt";
    private static final String BOOKS_FILE_PATH = "C:\\Users\\lalot\\OneDrive\\Documentos\\NetBeansProjects\\FinalProject\\src\\main\\resources\\books.txt";
    private static final String LENDINGS_FILE_PATH = "C:\\Users\\lalot\\OneDrive\\Documentos\\NetBeansProjects\\FinalProject\\src\\main\\resources\\lendings.txt";

    /**
     * Method: userExists
     * Checks whether a user exists in the system based on their folio.
     *
     * @param userFolio The unique identifier for the user.
     * @return true if the user exists, false otherwise.
     */
    public static boolean userExists(String userFolio) {
        try (BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split(",");
                if (userInfo[0].equals(userFolio)) { // Assumes the first field is the user folio
                    return true;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error checking user: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /**
     * Method: bookAvailable
     * Checks if a book is available for lending.
     *
     * @param bookID The unique identifier for the book.
     * @return true if the book is available, false otherwise.
     */
    public static boolean bookAvailable(String bookID) {
        try (BufferedReader reader = new BufferedReader(new FileReader(BOOKS_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] bookInfo = line.split(",");
                if (bookInfo[0].equals(bookID)) { // Assumes the first field is the book ID
                    int stock = Integer.parseInt(bookInfo[4].trim()); // Assumes stock is the 5th field
                    return stock > 0;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error checking book availability: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /**
     * Method: updateBookStock
     * Reduces the stock of a book by 1 after a lending operation.
     *
     * @param bookID The unique identifier for the book.
     * @return true if the stock was successfully updated, false otherwise.
     */
    public static boolean updateBookStock(String bookID) {
        StringBuilder bookData = new StringBuilder();
        boolean bookFound = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(BOOKS_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] bookInfo = line.split(",");
                if (bookInfo[0].equals(bookID)) {
                    int stock = Integer.parseInt(bookInfo[4].trim());
                    if (stock > 0) {
                        stock--;
                        bookInfo[4] = String.valueOf(stock);
                    }
                    bookFound = true;
                }
                bookData.append(String.join(",", bookInfo)).append("\n");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error updating book stock: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (!bookFound) {
            return false;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(BOOKS_FILE_PATH))) {
            writer.write(bookData.toString());
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing updated book data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /**
     * Method: lendBook
     * Registers a lending operation by updating the book stock and adding a lending record.
     *
     * @param userFolio The unique identifier for the user.
     * @param bookID The unique identifier for the book.
     * @return true if the lending is successfully recorded, false otherwise.
     */
    public static boolean lendBook(String userFolio, String bookID) {
        int lendingID = generateLendingID();

        if (!updateBookStock(bookID)) {
            return false;
        }

        try (BufferedWriter loanWriter = new BufferedWriter(new FileWriter(LENDINGS_FILE_PATH, true))) {
            String loanRecord = lendingID + "," + userFolio + "," + bookID + "," + new java.util.Date().toString() + "\n";
            loanWriter.write(loanRecord);
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error occurred while processing the loan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /**
     * Method: generateLendingID
     * Generates a unique lending ID by finding the highest existing ID and incrementing it by 1.
     *
     * @return The next available lending ID.
     */
    public static int generateLendingID() {
        int maxID = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(LENDINGS_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lendingData = line.split(",");
                if (lendingData.length > 0) {
                    try {
                        int currentID = Integer.parseInt(lendingData[0]);
                        if (currentID > maxID) {
                            maxID = currentID;
                        }
                    } catch (NumberFormatException e) {
                        // Ignore invalid IDs
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return maxID + 1;
    }

    /**
     * Method: updateBookStockPlus Increases the stock of a book by 1, typically
     * used when a book is returned.
     *
     * @param bookID The unique identifier for the book.
     * @return true if the stock was successfully updated, false otherwise.
     */
    public static boolean updateBookStockPlus(String bookID) {
        StringBuilder bookData = new StringBuilder();
        boolean bookFound = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(BOOKS_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] bookInfo = line.split(",");
                if (bookInfo[0].equals(bookID)) {  
                    int stock = Integer.parseInt(bookInfo[4].trim());
                    if (stock > 0) {
                        stock++;  
                        bookInfo[4] = String.valueOf(stock); 
                    }
                    bookFound = true;
                }
                bookData.append(String.join(",", bookInfo)).append("\n");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error updating book stock: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (!bookFound) {
            return false;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(BOOKS_FILE_PATH))) {
            writer.write(bookData.toString());
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing updated book data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /**
     * Method: returnBook Processes the return of a book by removing the lending
     * record and updating the book stock.
     *
     * @param lendingID The unique identifier for the lending record.
     * @return true if the return was successfully processed, false otherwise.
     */
    public static boolean returnBook(String lendingID) {
        String filePath = "C:\\Users\\lalot\\OneDrive\\Documentos\\NetBeansProjects\\FinalProject\\src\\main\\resources\\lendings.txt";
        List<String> updatedLines = new ArrayList<>();
        boolean found = false;
        String bookID = null;

        // Leer y filtrar el préstamo
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lendingData = line.split(",");
                if (lendingData.length > 0 && lendingData[0].equals(lendingID)) {
                    found = true; // Préstamo encontrado
                    if (lendingData.length > 2) {
                        bookID = lendingData[2]; // Extraer el bookID
                    }
                } else {
                    updatedLines.add(line); // Mantener otros registros
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        if (found) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                for (String updatedLine : updatedLines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
                // Actualizar el stock después de eliminar el préstamo
                if (!updateBookStockPlus(bookID)) {
                    return false;  // Si no se pudo aumentar el stock, retornar false
                }
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        return false; // Préstamo no encontrado
    }
}
