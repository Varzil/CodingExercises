import java.time.LocalTime;
import java.time.format.DateTimeParseException;

/**
 * Factory class to create Task objects.
 */
public class TaskFactory {

    /**
     * Creates a new Task object.
     *
     * @param description The description of the task.
     * @param startTime   The start time of the task in "HH:mm" format.
     * @param endTime     The end time of the task in "HH:mm" format.
     * @param priority    The priority level of the task.
     * @return A new Task object or null if the time format is invalid.
     */
    public static Task createTask(String description, String startTime, String endTime, String priority) {
        try {
            LocalTime start = LocalTime.parse(startTime);
            LocalTime end = LocalTime.parse(endTime);
            return new Task(description, start, end, priority);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid time format. Please use 'HH:mm'.");
            return null;
        }
    }
}
