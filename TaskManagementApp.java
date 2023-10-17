package TaskManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManagementApp {
	static Scanner sc = new Scanner(System.in);
	ArrayList<Task> taskList = new ArrayList<Task>();
	int taskIdCounter = 1;
	
	 public void viewAllTasks() {
	        System.out.println("========================================================");
	        if (taskList.isEmpty()) {
	            System.out.println("No tasks found.");
	        } else {
	            for (Task task : taskList) {
	                String completionStatus = task.isCompleted() ? "Completed" : "Not Completed";
	                System.out.println("Task ID: " + task.getTaskId());
	                System.out.println("Description: " + task.getTaskDescription());
	                System.out.println("Due Date: " + task.getDueDate());
	                System.out.println("Status: " + completionStatus);
	                System.out.println();
	            }
	        }
	        System.out.println("========================================================");
	    }

	 
	 public void addTask() {
		    System.out.println("Enter task description: ");
		    String taskDescription = sc.nextLine();
		    System.out.println("Enter due date (YYYY-MM-DD): ");
		    LocalDate dueDate = LocalDate.parse(sc.nextLine());
		    System.out.println("Enter task priority (High/Medium/Low): ");
		    String priority = sc.nextLine(); 
		    Task task = new Task(taskIdCounter, taskDescription, false, dueDate, priority);
		    taskList.add(task);
		    taskIdCounter++;
		}


	    public void markTaskAsCompleted() {
	        System.out.println("Enter task ID to mark as completed: ");
	        int taskId = sc.nextInt();
	        for (Task task : taskList) {
	            if (task.getTaskId() == taskId) {
	                task.markAsCompleted();
	                System.out.println("Task marked as completed.");
	                return;
	            }
	        }
	        System.out.println("Task with that ID does not exist.");
	    }


	    public void viewTasksByPriority() {
	        System.out.println("Enter task priority to view tasks (High/Medium/Low): ");
	        String priority = sc.nextLine();
	        System.out.println("Tasks with priority " + priority + ":");
	        for (Task task : taskList) {
	            if (task.getPriority().equalsIgnoreCase(priority)) {
	                System.out.println(task);
	            }
	        }
	    }


	    public void deleteTask() {
	        System.out.println("Enter task ID to delete: ");
	        int taskId = sc.nextInt();
	        for (Task task : taskList) {
	            if (task.getTaskId() == taskId) {
	                taskList.remove(task);
	                System.out.println("Task removed successfully.");
	                return;
	            }
	        }
	        System.out.println("Task with that ID does not exist.");
	    }
	}