public class Todo extends Task {
    protected boolean isDone;

    public Todo(String description) {
        super(description);
        isDone = false;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public boolean isDone() {
        return isDone;
    }

    @Override
    public String toString() {
        String status = "No";
        if (isDone) {
            status = "Yes";
        }
        return super.toString() + System.lineSeparator() + "is done? " + status;
    }
}
