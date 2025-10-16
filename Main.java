import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice;
        int idCounter = 1;

        do {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = input.nextLine();
                    tasks.add(new Task(idCounter++, title));
                    System.out.println("✅ Task added!");
                    break;

                case 2:
                    System.out.println("\n--- Task List ---");
                    for (Task t : tasks) {
                        t.displayTask();
                    }
                    break;

                case 3:
                    System.out.print("Enter task ID to mark done: ");
                    int id = input.nextInt();
                    for (Task t : tasks) {
                        if (t.isDone()) continue;
                        if (t.toString().contains(String.valueOf(id))) {
                            t.markDone();
                            System.out.println("✅ Task marked as done!");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("👋 Exiting...");
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }

        } while (choice != 4);

        input.close();
    }
}
