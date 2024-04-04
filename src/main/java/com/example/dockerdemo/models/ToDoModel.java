package com.example.dockerdemo.models;


public class ToDoModel {

    private Integer id;
    private String description;
    private Boolean isFinished;

    public ToDoModel(Integer id, String description, Boolean isFinished) {
        this.id = id;
        this.description = description;
        this.isFinished = isFinished;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFinished() {
        return isFinished;
    }

    public void setFinished(Boolean finished) {
        isFinished = finished;
    }
}
