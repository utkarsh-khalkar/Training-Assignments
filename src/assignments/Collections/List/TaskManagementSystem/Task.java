package assignments.Collections.List.TaskManagementSystem;

import java.util.Date;

/**
 * Author: Utkarsh Khalkar
 * Title: Task Class
 * Time: 11:20 AM
 * Date: 07-02-2025
 */
public class Task {
    private String taskName;
    private String taskDescription;
    private int taskPriority;
    private int taskStatus;
    private Date taskDueDate;

    public Task(String taskName, String taskDescription, int taskPriority, int taskStatus, Date taskDueDate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskPriority = taskPriority;
        this.taskStatus = taskStatus;
        this.taskDueDate = taskDueDate;
    }

    public Date getTaskDueDate() {
        return taskDueDate;
    }

    public void setTaskDueDate(Date taskDueDate) {
        this.taskDueDate = taskDueDate;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public int getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(int taskPriority) {
        this.taskPriority = taskPriority;
    }

    public int getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(int taskStatus) {
        this.taskStatus = taskStatus;
    }
}
