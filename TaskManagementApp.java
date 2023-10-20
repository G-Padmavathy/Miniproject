package TaskManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManagementApp {
	static Scanner sc = new Scanner(System.in);
	ArrayList<Task> taskList = new ArrayList<Task>();
	int taskIdCounter = 1;
	TaskManagementApp(){
		taskList.add(new Task(taskIdCounter,"Mini Project" ,false,LocalDate.now(),"Medium"));
		taskIdCounter++;
		taskList.add(new Task(taskIdCounter,"Module Completion" ,false,LocalDate.now(),"Low"));
		taskIdCounter++;
		taskList.add(new Task(taskIdCounter,"Assessment" ,false,LocalDate.now(),"High"));
		taskIdCounter++;
	}
	
	
	 public void viewAllTasks() {
		 System.out.println("========================================================");
	     if (taskList.isEmpty()) {
	    	 System.out.println("No tasks found.");
	         } else {
	            for (Task task : taskList) {
	            	String completionStatus;
	            	if (task.isCompleted()) {
	            	    completionStatus = "Completed";
	            	} else {
	            	    completionStatus = "Not Completed";
	            	}
	                System.out.println("Task ID: " + task.getTaskId());
	                System.out.println("Description: " + task.getTaskDescription());
	                System.out.println("Due Date: " + task.getDueDate());
	                System.out.println("Priority:"+ task.getPriority());
	                System.out.println("Status: " + completionStatus);
	                
	                System.out.println();
	            }
	        }
	        System.out.println("========================================================");
	    }

	 
	 public void addTask() {
		    System.out.println("Enter task description: ");
		    String taskDescription = sc.nextLine();
		    if (taskDescription.isEmpty()) {
		    	System.out.println("Your Description is Empty.");
		    }
		    System.out.println("Enter due date (YYYY-MM-DD): ");
		    String inputDueDate = sc.nextLine();
		    LocalDate dueDate;
		    if (inputDueDate.isEmpty()) {
		        dueDate = LocalDate.now();
		    } else {
		        dueDate = LocalDate.parse(inputDueDate);
		    }
		    System.out.println("Enter task priority (High/Medium/Low): ");
		    String priority = sc.nextLine(); 
		    Task task = new Task(taskIdCounter, taskDescription, false, dueDate, priority);
		    taskList.add(task);
		    taskIdCounter++;
		}
	 
	 
	 	public void updateTaskDetails() {
	        System.out.println("Enter task ID to update details: ");
	        int taskId = sc.nextInt();
	        sc.nextLine();  

	        for (Task task : taskList) {
	            if (task.getTaskId() == taskId) {
	                System.out.println("Enter new task description (or press Enter to keep the current description): ");
	                String newDescription = sc.nextLine();
	                if (!newDescription.isEmpty()) {
	                    task.setTaskDescription(newDescription);
	                }

	                System.out.println("Enter new due date (YYYY-MM-DD) (or press Enter to keep the current due date): ");
	                String inputDueDate = sc.nextLine();
	                if (!inputDueDate.isEmpty()) {
	                    LocalDate newDueDate = LocalDate.parse(inputDueDate);
	                    task.setDueDate(newDueDate);
	                }

	                System.out.println("Enter new priority (High/Medium/Low) (or press Enter to keep the current priority): ");
	                String newPriority = sc.nextLine();
	                if (!newPriority.isEmpty()) {
	                    task.setPriority(newPriority);
	                }
	                
	                System.out.println("Do you want to mark the task as completed? (Y-Yes / N-No): ");
	                String markAsCompletedChoice = sc.nextLine();
	                if (markAsCompletedChoice.equalsIgnoreCase("Y")) {
	                    task.markAsCompleted();
	                }

	                System.out.println("Task details updated successfully.");
	                return;
	            }
	        }

	        System.out.println("Task with that ID does not exist.");
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
	    
	    public void deleteAllTask()
		{
			System.out.println("==================================================================================================");

			if(taskList.size()>0)
			{
				taskList.clear();
				System.out.println("All records deleted successfully!!");
			}
			else
			{
				System.out.println("No record available!!");
			}
			System.out.println("==================================================================================================");

		}
	}
