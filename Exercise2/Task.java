import java.time.LocalTime;

/**
 * Task class representing a daily task for the astronaut.
 * Contains description, start time, end time, and priority level.
 */
public class Task {
    private String description;
    private LocalTime startTime;
    private LocalTime endTime;
    private String priority;

    /**
     * Constructor to initialize a task.
     *
     * @param description The description of the task.
     * @param startTime   The start time of the task.
     * @param endTime     The end time of the task.
     * @param priority    The priority level of the task.
     */
    public Task(String description, LocalTime startTime, LocalTime endTime, String priority) {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priority = priority;
    }

    /**
     * Get the start time of the task.
     *
     * @return The start time.
     */
    public LocalTime getStartTime() {
        return startTime;
    }

    /**
     * Get the end time of the task.
     *
     * @return The end time.
     */
    public LocalTime getEndTime() {
        return endTime;
    }

    /**
     * Override toString method to print task details.
     *
     * @return String representation of the task.
     */
    @Override
    public String toString() {
        return startTime + " - " + endTime + ": " + description + " [" + priority + "]";
    }
}
