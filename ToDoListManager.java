import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManager {

    private ArrayList<String> tasks;  // List to store tasks

    public ToDoListManager() {
        tasks = new ArrayList<>();
    }

    // Method to add a task to the list
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    // Method to remove a task from the list by its index
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid task number. Please try again.");
        }
    }

    // Method to display all tasks
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("\nTo-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Method to show the menu and take user input
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- To-Do List Manager ----");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Please select an option (1/2/3/4): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over from nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter the task you want to add: ");
                    String newTask = scanner.nextLine();
                    addTask(newTask);
                    break;

                case 2:
                    displayTasks();
                    System.out.print("Enter the number of the task to remove: ");
                    int taskIndex = scanner.nextInt();
                    removeTask(taskIndex - 1);  // Convert to zero-based index
                    break;

                case 3:
                    displayTasks();
                    break;

                case 4:
                    System.out.println("Exiting the To-Do List Manager. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }

    public static void main(String[] args) {
        // Create a new instance of ToDoListManager and show the menu
        ToDoListManager manager = new ToDoListManager();
        manager.showMenu();
    }
}
