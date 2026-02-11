import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int option = 0;

        while (option != 4) {
            System.out.println("\n=== TASK MANAGER ===");
            System.out.println("1 - Add task");
            System.out.println("2 - List tasks");
            System.out.println("3 - Remove task");
            System.out.println("4 - Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.print("Enter the task: ");
                String task = scanner.nextLine();
                tasks.add(task);
                System.out.println("Task added successfully!");

            } else if (option == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks found.");
                } else {
                    System.out.println("\nYour tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + " - " + tasks.get(i));
                    }
                }

            } else if (option == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to remove.");
                } else {
                    System.out.print("Enter the task number to remove: ");
                    int index = scanner.nextInt();

                    if (index > 0 && index <= tasks.size()) {
                        tasks.remove(index - 1);
                        System.out.println("Task removed successfully!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                }

            } else if (option == 4) {
                System.out.println("Goodbye!");

            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
