package tasks;

import java.util.Scanner;

public class App {
    private static TaskManager taskManager = new TaskManager();
    private static Scanner scanner = new Scanner(System.in);
  
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nTo-Do List Application:   ");
            System.out.println("1. Add a task from here");
            System.out.println("2. View available tasks");
            System.out.println("3. Remove a current task");
            System.out.println("4. Exit the application");
            System.out.print("Choose an option from the list: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            //just stupid comment
            
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    System.out.println("A new line");
                    System.out.println("Exit application!");
                    System.out.println("A new line 2");
                    return;
                default:

                    System.out.println("Invalid choice, please try :)))))))))))) again: ");

            }
        }
    }

    // This is Jimmy's comment
    private static void addTask() {
        System.out.print("Enter task el description b2a : ");
        String description = scanner.nextLine();
        taskManager.addTask(description);
        System.out.println("Task added yaa3m .");
    }


    private static void viewTasks() {
        System.out.println("\nAvailable tks:");
        taskManager.viewTasks();
    }

    
    private static void removeTask() {
        System.out.print("Enter tsk nmber to remove: ");
        int taskNumber = scanner.nextInt();
        taskManager.removeTask(taskNumber - 1);
        System.out.println("Task removed.");
    }
}