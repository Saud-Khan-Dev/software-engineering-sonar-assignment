//Class
public class Task {
    private int id;
    private String title;
    private boolean isDone;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.isDone = false;
    }

    public void markDone() {
        isDone = true;
    }

    public void displayTask() {
        String status = isDone ? "Done" : "Pending";
        System.out.println(id + ". " + title + " - " + status);
    }

    public boolean isDone() {
        return isDone;
    }
}
