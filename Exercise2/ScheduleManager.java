import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Singleton class to manage the daily schedule of tasks.
 * Ensures that only one instance of ScheduleManager exists.
 */
public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private List<Observer> observers;

    /**
     * Private constructor to prevent instantiation.
     */
    private ScheduleManager() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    /**
     * Provides access to the singleton instance.
     *
     * @return The singleton instance of ScheduleManager.
     */
    public static synchronized ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    /**
     * Adds a new task to the schedule.
     *
     * @param task The task to be added.
     */
    public void addTask(Task task) {
        if (task != null && !isConflict(task)) {
            tasks.add(task);
            System.out.println("Task added successfully. No conflicts.");
        } else {
            notifyObservers("Task conflict detected for: " + task);
        }
    }

    /**
     * Removes an existing task from the schedule.
     *
     * @param description The description of the task to be removed.
     */
    public void removeTask(String description) {
        tasks.removeIf(task -> task.toString().contains(description));
        System.out.println("Task removed successfully.");
    }

    /**
     * Displays all tasks sorted by start time.
     */
    public void viewTasks() {
        Collections.sort(tasks, (t1, t2) -> t1.getStartTime().compareTo(t2.getStartTime()));
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    /**
     * Checks if a new task conflicts with existing tasks.
     *
     * @param newTask The new task to be added.
     * @return True if there is a conflict, false otherwise.
     */
    private boolean isConflict(Task newTask) {
        for (Task task : tasks) {
            if (newTask.getStartTime().isBefore(task.getEndTime()) &&
                newTask.getEndTime().isAfter(task.getStartTime())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds an observer to the list of observers.
     *
     * @param observer The observer to be added.
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Notifies all observers of a conflict.
     *
     * @param message The conflict message to be sent.
     */
    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
