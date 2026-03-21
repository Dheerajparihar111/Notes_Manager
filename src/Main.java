import java.util.*;
import java.io.*;

public class Main {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Note> notes = new ArrayList<>();

    static final String FILE = "notes.txt";

    public static void main(String[] args) {


        int choice;

        do {

            System.out.println("===== NOTE MANAGER =====");
            System.out.println("1 Add Note");
            System.out.println("2 View Note");
            System.out.println("3 Exit");

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
                    System.out.println("Thank You For Using Note Manager");
                    System.exit(0);
            }

        } while (choice != 4);
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

            System.out.print(i + " : ");
            notes.get(i).display();
        }
    }




    }
