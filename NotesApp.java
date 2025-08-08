package NotesApp;

import java.io.*;
import java.util.Scanner;

public class NotesApp {
    private static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n📒 Notes App Menu");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter your note: ");
                    String note = scanner.nextLine();
                    addNote(note);
                    break;
                case 2:
                    viewNotes();
                    break;
                case 3:
                    System.out.println("Exiting Notes App. ✅");
                    break;
                default:
                    System.out.println("Invalid choice. ❌");
            }
        } while (choice != 3);

        scanner.close();
    }

    // Method to add a note (append mode)
    private static void addNote(String note) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(note + System.lineSeparator());
            System.out.println("Note saved successfully. ✅");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to view all notes
    private static void viewNotes() {
        System.out.println("\n📝 Your Notes:");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            int count = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(count++ + ". " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No notes found yet.");
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
