package com.krekapps.choresspringboot.models;

import org.springframework.core.convert.ConversionFailedException;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

    private boolean isDue;

    private Date dueDate;

    public Task() {
    }

    public Task(String name) {
        this.name = name;
        isDue = false;
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

    public boolean isDue() {
        return isDue;
    }

    public void setDue(boolean due) {
        isDue = due;
    }

    public Date getDueDate() {
        return dueDate;
    }
/*
    public void setDueDate(Date dueDate) {
        isDue = true;
        this.dueDate = dueDate;
    }*/

    public void setDueDate(String date) {
        isDue = true;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dueDate = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            dueDate = null;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            dueDate = null;
        } catch (ConversionFailedException e) {
            e.printStackTrace();
            dueDate = null;
        }
    }
}
