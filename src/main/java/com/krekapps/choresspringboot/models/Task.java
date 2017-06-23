package com.krekapps.choresspringboot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Calendar;

/**
 * Created by raefo on 22-Jun-17.
 */

@Entity
public class Task {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    public Task() {
    }

    public Task(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
