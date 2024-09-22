import java.util.Scanner;

/**
 * Main class to run the Astronaut Daily Schedule Organizer application.
 */
public class AstronautDailyScheduleApp {

    public static void main(String[] args) {
        ScheduleManager scheduleManager = ScheduleManager.getInstance();
        ConflictObserver conflictObserver = new ConflictObserver();
        scheduleManager.addObserver(conflictObserver);

        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Astronaut Daily Schedule Organizer");
        System.out.println("Commands: add, remove, view, exit");

        while (true) {
            System.out.print("Enter command: ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("add")) {
                System.out.print("Enter task description: ");
                String description = scanner.nextLine();
                System.out.print("Enter start time (HH:mm): ");
                String startTime = scanner.nextLine();
                System.out.print("Enter end time (HH:mm): ");
                String endTime = scanner.nextLine();
                System.out.print("Enter priority level: ");
                String priority = scanner.nextLine();

                Task task = TaskFactory.createTask(description, startTime, endTime, priority);
                scheduleManager.addTask(task);
            } else if (command.equalsIgnoreCase("remove")) {
                System.out.print("Enter task description to remove: ");
                String description = scanner.nextLine();
                scheduleManager.removeTask(description);
            } else if (command.equalsIgnoreCase("view")) {
                scheduleManager.viewTasks();
            } else if (command.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }

        scanner.close();
    }
}
