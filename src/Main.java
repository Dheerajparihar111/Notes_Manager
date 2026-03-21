import java.util.*;
import java.io.*;

public class Main {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Note> notes = new ArrayList<>();

    static final String FILE = "notes.txt";

    public static void main(String[] args) {

        loadFromFile();

        int choice;

        do {

            System.out.println("\n===== NOTE MANAGER =====");
            System.out.println("1 Add Note");
            System.out.println("2 View Notes");
            System.out.println("3 Search Note");
            System.out.println("4 Delete Note");
            System.out.println("5 Exit");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    addNote();
                    break;

                case 2:
                    viewNotes();
                    break;

                case 3:
                    searchNote();
                    break;

                case 4:
                    deleteNote();
                    break;

                case 5:
                    saveToFile();
                    System.out.println("Saved");
                    break;
            }

        } while (choice != 5);
    }


    static void addNote() {

        System.out.print("Enter note: ");
        String text = input.nextLine();

        notes.add(new Note(text));
    }


    static void viewNotes() {

        if (notes.isEmpty()) {
            System.out.println("No notes");
            return;
        }

        for (int i = 0; i < notes.size(); i++) {

            System.out.print((i + 1) + " : ");   // start from 1
            notes.get(i).display();
        }
    }


    static void searchNote() {

        System.out.print("Enter keyword: ");
        String key = input.nextLine();

        boolean found = false;

        for (int i = 0; i < notes.size(); i++) {

            if (notes.get(i).text.contains(key)) {

                System.out.print((i + 1) + " : ");
                notes.get(i).display();

                found = true;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }


    static void deleteNote() {

        viewNotes();

        System.out.print("Enter note number: ");
        int n = input.nextInt();

        int index = n - 1;   // convert to index

        if (index >= 0 && index < notes.size()) {

            notes.remove(index);
            System.out.println("Deleted");
        }
    }


    static void saveToFile() {

        try {

            PrintWriter pw = new PrintWriter(FILE);

            for (Note n : notes) {
                pw.println(n.text);
            }

            pw.close();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }


    static void loadFromFile() {

        try {

            File f = new File(FILE);

            if (!f.exists()) return;

            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {

                notes.add(new Note(sc.nextLine()));
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}