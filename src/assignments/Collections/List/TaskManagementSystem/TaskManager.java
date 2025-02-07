package assignments.Collections.List.TaskManagementSystem;

import java.util.*;

/**
 * Author: Utkarsh Khalkar
 * Title: Task Management facility
 * Time: 11:34 AM
 * Date: 07-02-2025
 */
public class TaskManager {
    private final List<Task> tasks=new ArrayList<>();

    // method to add the task
    public void addTask(Task task) {

        tasks.add(task);
    }

    // method to display task
    public void viewTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found");
        } else {
            // sorting the task by their priority
            Collections.sort(tasks, new Comparator<Task>() {
                @Override
                public int compare(Task o1, Task o2) {
                    // compare priority
                    if (o1.getTaskPriority() != o2.getTaskPriority()) {
                        return Integer.compare(o2.getTaskPriority(), o1.getTaskPriority());
                    }
                    // compare by duedate
                    return o2.getTaskDueDate().compareTo(o1.getTaskDueDate());
                }
            });
        }

        // displying All tasks
        for (Task task : tasks) {
            System.out.println("\nTask Title:"+task.getTaskName()+"\nTask Description:"+task.getTaskDescription()+"\nTask Priority:"+task.getTaskPriority()+"\nTask DueDate:"+task.getTaskDueDate());
            if (task.getTaskStatus() == 1) {
                System.out.println("Task Status Completed.");
            } else {
                System.out.println("Task Status Not yet  Completed.");
            }
            System.out.println("-----------------------------------");
        }
    }

    // search task by name
    public void searchTask(String searchString) {
        boolean taskFound = false;
        for (Task task : tasks) {
            if (task.getTaskName().equalsIgnoreCase(searchString)) {
                System.out.println("\nTask Title:"+task.getTaskName()+"\nTask Description:"+task.getTaskDescription()+"\nTask Priority:"+task.getTaskPriority()+"\nTask DueDate:"+task.getTaskDueDate());
                if (task.getTaskStatus() == 1) {
                    System.out.println("Task Status Completed.");
                } else {
                    System.out.println("Task Status Not yet  Completed.");
                }
                System.out.println("---------------------------------------------");
                // make task as found
                taskFound = true;
                break;
            }
        }
        if (!taskFound) {
            System.out.println("No tasks found");
        }
    }

    // search task exist or not
    public boolean taskExists(String taskName) {
        for (Task task : tasks) {
            if (task.getTaskName().equalsIgnoreCase(taskName)) {
                return true;
            }
        }
        return false;
    }

    // edit task
    public void editTask(String taskName, String newTitle, String newDescription, int newPriority, int newStatus, Date newDueDate) {
        for (Task task : tasks) {
            if (task.getTaskName().equalsIgnoreCase(taskName)) {
                task.setTaskName(newTitle);
                task.setTaskDescription(newDescription);
                task.setTaskPriority(newPriority);
                task.setTaskStatus(newStatus);
                task.setTaskDueDate(newDueDate);
                return;
            }
        }
    }


}
