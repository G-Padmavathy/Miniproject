package TaskManagementSystem;

import java.time.LocalDate;

class Task {
    private int taskId;
    private String taskDescription;
    private boolean completed;
    private LocalDate dueDate;
    private String priority;

    public Task(int taskId, String taskDescription, boolean completed, LocalDate dueDate,String priority) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.completed = completed;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public boolean isCompleted() {
        return completed;
    }
    

    public LocalDate getDueDate() {
        return dueDate;
    }
    public String getPriority() {
        return priority;
    }

    public void markAsCompleted() {
        completed = true;
    }
    

    @Override
    public String toString() {
        return "Task [ID: " + taskId + ", Description: " + taskDescription + ", Due Date: " + dueDate + ", Priority: " + priority + " ,Completed: " + (completed ? "Yes" : "No") + "]";
    }

	
}
