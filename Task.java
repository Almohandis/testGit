package tasks;

public class Task {
    // Task description
    private String description;

    // Task constructor
    public Task(String description) {
        this.description = description;
    }

    // Getter for the description
    public String getDescription() {
        return description;
    }

    // Setter for the description
    @Override
    public String toString() {
        return description;
    }
}