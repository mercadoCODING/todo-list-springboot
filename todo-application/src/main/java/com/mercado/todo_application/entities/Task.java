package com.mercado.todo_application.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String taskName;
    private String taskDescription;
    private String taskTimeStamp;
    private String taskStatus;

    public Task(){

    }


    public Task(String taskName, String taskDescription, String taskTimeStamp,String taskStatus) {
      
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskTimeStamp = taskTimeStamp;
        this.taskStatus = taskStatus;
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

    public String getTaskTimeStamp() {
        return taskTimeStamp;
    }

    public void setTaskTimeStamp(String taskTimeStamp) {
        this.taskTimeStamp = taskTimeStamp;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    
}
