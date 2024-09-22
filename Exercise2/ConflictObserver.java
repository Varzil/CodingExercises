/**
 * ConflictObserver class that implements the Observer interface.
 * Used to notify users of task conflicts.
 */
public class ConflictObserver implements Observer {

    /**
     * Update method to handle conflict notifications.
     *
     * @param message The conflict message to be displayed.
     */
    @Override
    public void update(String message) {
        System.out.println("Conflict Alert: " + message);
    }
}
