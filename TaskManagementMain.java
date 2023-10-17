package TaskManagementSystem;

import java.util.Scanner;

	public class TaskManagementMain {
	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	        System.out.println("========================================================");
	        System.out.println("========= Task Management System ==========================");
	        System.out.println("========================================================");
	        String ch;
	        TaskManagementApp app = new TaskManagementApp();
	        do {
	            System.out.println("\t\t 1) View All Tasks");
	            System.out.println("\t\t 2) Add a Task");
	            System.out.println("\t\t 3) View Tasks by Priority");
	            System.out.println("\t\t 4) Mark Task as Completed");
	            System.out.println("\t\t 5) Delete a Task");
	            System.out.println("\t\t 6) Quit");
	            System.out.println("========================================================");
	            System.out.print("Enter your choice: ");
	            
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    app.viewAllTasks();
	                    break;
	                case 2:
	                    app.addTask();
	                    break;
	                case 3:
	                    app.viewTasksByPriority();
	                    break;
	                case 4:
	                    app.markTaskAsCompleted();
	                    break;
	                case 5:
	                    app.deleteTask();
	                    break;
	                case 6:
	                    System.out.println("Goodbye!");
	                    System.exit(0);
	                    break;
	                
	                default:
	                    System.out.println("Wrong choice!!");
	            }

	            System.out.print("Do you want to continue? (Y-Yes / N-No): ");
	            ch = sc.next();
	        } while (ch.equalsIgnoreCase("Y"));
	        System.out.println("========================================================");
	        System.out.println("Goodbye!");
	        System.out.println("========================================================");
	    }
	}

	

