package assignments.Collections.List.TaskManagementSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Author: Utkarsh Khalkar
 * Title: Task Management Application Main class
 * Time: 03:00 PM
 * Date: 07/02/2025
 */
public class TaskApplication {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        System.out.println("Welcome to the Task Management System!");
        int choice;
        do {
            System.out.println("Select your choice....");
            System.out.println("1.Add Task");
            System.out.println("2.View All Tasks");
            System.out.println("3.Search Task");
            System.out.println("4.Edit Task");
            System.out.println("5.Exit from Task Management System");
            choice = sc.nextInt();

            sc.nextLine();
            switch (choice) {
                case 1:
                    // task title validation
                    String taskTitle;
                    while (true)
                    {
                        System.out.println("Enter Task Title");
                        taskTitle = sc.nextLine();
                        if (!taskTitle.isEmpty()) {
                            break;
                        } else {
                            System.out.println("Task Cannot be Empty. Enter Valid Task Title");

                        }
                    }
                   // description validation
                    String taskDescription ;
                    while (true) {
                        System.out.println("Enter Task Description");
                         taskDescription = sc.nextLine();
                        if (!taskDescription.isEmpty()) {
                            break;
                        } else {
                            System.out.println("Task Description Cannot be empty..");
                        }
                    }
                    // task priority validation
                    int taskPriority ;
                    while (true) {
                        System.out.println("Enter Task Priority (1 to 5)");
                        // takes only integer
                        if (sc.hasNextInt()) {
                            taskPriority = sc.nextInt();
                            if (taskPriority >= 1 && taskPriority <= 5) {
                                break;
                            } else {
                                System.out.println("Priority must be between 1 and 5. Please enter a valid priority.");
                            }
                        } else {
                            System.out.println("Invalid input. Please enter an integer value for priority.");
                            sc.nextLine(); // clear invalid input
                        }
                        sc.nextLine(); // Clear the newline character

                    }
                        sc.nextLine();
                    String taskDueDate;
                    Date date = null;
                    while (true) {
                        System.out.println("Enter Task Due Date (dd/MM/yyyy)");
                        taskDueDate = sc.nextLine();
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        try {
                            date = simpleDateFormat.parse(taskDueDate);
                            break;
                        } catch (ParseException e) {
                            System.out.println("Invalid date format. Please enter the date in dd/MM/yyyy format.");
                        }
                    }


                    int taskStatus;
                    while (true) {
                        System.out.println("Enter Task Status (1 for Completed, 0 for Not Completed)");
                        if (sc.hasNextInt()) {
                            taskStatus = sc.nextInt();
                            if (taskStatus == 0 || taskStatus == 1) {
                                break;
                            } else {
                                System.out.println("Invalid status. Please enter 1 for Completed or 0 for Not Completed.");
                            }
                        } else {
                            System.out.println("Invalid input. Please enter 1 for Completed or 0 for Not Completed.");
                            sc.nextLine();
                        }
                    }

                    sc.nextLine();
                    // Create the task and add it
                    Task task = new Task(taskTitle, taskDescription, taskPriority, taskStatus, date);
                    taskManager.addTask(task);
                    System.out.println("Task Added Successfully");
                    break;

                case 2:
                    taskManager.viewTask();
                    break;
                case 3:
                    System.out.println("Enter Task Name for Searching Task");
                    String taskName = sc.nextLine();
                    taskManager.searchTask(taskName);
                    break;
                case 4:
                    System.out.println("Enter the Task Title that you want to edit");
                    String searchedTask = sc.nextLine();
                    if (taskManager.taskExists(searchedTask)) {
                        // Task Title Validation
                        String newTask;
                        while (true) {
                            System.out.println("Enter Task Title");
                            newTask = sc.nextLine();
                            if (!newTask.trim().isEmpty()) { // Check if task title is not empty
                                break;
                            } else {
                                System.out.println("Task Title cannot be empty. Please enter a valid title.");
                            }
                        }

                        // Task Description Validation
                        String newTaskDescription;
                        while (true) {
                            System.out.println("Enter Task Description");
                            newTaskDescription = sc.nextLine();
                            if (!newTaskDescription.trim().isEmpty()) { // Check if description is not empty
                                break;
                            } else {
                                System.out.println("Task Description cannot be empty. Please enter a valid description.");
                            }
                        }
                        sc.nextLine();
                        // Task Priority Validation
                        int newTaskPriority;
                        while (true) {
                            System.out.println("Enter Task Priority (1 to 5)");
                            if (sc.hasNextInt()) {
                                newTaskPriority = sc.nextInt();
                                if (newTaskPriority >= 1 && newTaskPriority <= 5) {
                                    break;
                                } else {
                                    System.out.println("Priority must be between 1 and 5. Please enter a valid priority.");
                                }
                            } else {
                                System.out.println("Invalid input. Please enter an integer value for priority.");
                                sc.nextLine(); // Clear the invalid input
                            }
                        }
                        sc.nextLine();
                        // Task Due Date Validation
                        String newtaskDueDate;
                        Date newDate = null;
                        while (true) {
                            System.out.println("Enter Task Due Date (dd/MM/yyyy)");
                            newtaskDueDate = sc.nextLine();
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

                            try {
                                newDate = simpleDateFormat.parse(newtaskDueDate);
                                break; // Valid date, break the loop
                            } catch (ParseException e) {
                                System.out.println("Invalid date format. Please enter the date in dd/MM/yyyy format.");
                            }
                        }

                        sc.nextLine();

                        int newTaskStatus;
                        while (true) {
                            System.out.println("Enter Task Status (1 for Completed or 0 for Not Completed)");
                            if (sc.hasNextInt()) {
                                newTaskStatus = sc.nextInt();
                                if (newTaskStatus == 0 || newTaskStatus == 1) {
                                    break;
                                } else {
                                    System.out.println("Invalid status. Please enter 1 for Completed or 0 for Not Completed.");
                                }
                            } else {
                                System.out.println("Invalid input. Please enter 1 for Completed or 0 for Not Completed.");
                                sc.nextLine(); // Clear the invalid input
                            }
                        }


                        taskManager.editTask(searchedTask, newTask, newTaskDescription, newTaskPriority, newTaskStatus, newDate);
                        System.out.println("Task Edited Successfully");
                    } else {
                        System.out.println(searchedTask + " does not exist");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Task Management System!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 5);
    }
}
