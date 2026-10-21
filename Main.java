import java.util.*;
import java.io.*;

abstract class BackupSystem {
    abstract void createSnapshot(String fileName);
    abstract void restoreSnapshot(String fileName);
}

interface LogManager {
    void displayLogs();
}

class SnapshotManager extends BackupSystem implements LogManager {
    ArrayList<String> logs = new ArrayList<>();

    @Override
    void createSnapshot(String fileName) {
        logs.add("Snapshot created for: " + fileName);
        System.out.println("Snapshot successfully created.");
    }

    @Override
    void restoreSnapshot(String fileName) {
        logs.add("Snapshot restored for: " + fileName);
        System.out.println("Snapshot successfully restored.");
    }

    @Override
    public void displayLogs() {
        System.out.println("\nBackup Logs:");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SnapshotManager manager = new SnapshotManager();
        int choice;

        do {
            System.out.println("\n===== Database Snapshot & Recovery Manager =====");
            System.out.println("1. Create Snapshot");
            System.out.println("2. Restore Snapshot");
            System.out.println("3. View Logs");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter file name: ");
                    String createFile = sc.nextLine();
                    manager.createSnapshot(createFile);
                    break;
                case 2:
                    System.out.print("Enter file name: ");
                    String restoreFile = sc.nextLine();
                    manager.restoreSnapshot(restoreFile);
                    break;
                case 3:
                    manager.displayLogs();
                    break;
                case 4:
                    System.out.println("Exiting Application...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
