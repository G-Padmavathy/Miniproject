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
    
     public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }
    
    public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void markAsCompleted() {
        completed = true;
    }
    

    @Override
    public String toString() {
        return "Task [ID: " + taskId + ", Description: " + taskDescription + ", Due Date: " + dueDate + ", Priority: " + priority + " ,Completed: " + (completed ? "Yes" : "No") + "]";
    }

	
}
