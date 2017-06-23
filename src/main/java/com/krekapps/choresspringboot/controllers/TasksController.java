package com.krekapps.choresspringboot.controllers;

import com.krekapps.choresspringboot.models.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * Created by raefo on 22-Jun-17.
 */

@Controller
@RequestMapping(value="tasks")
public class TasksController {

    @RequestMapping(value="view")
    public String view(Model model) {
        ArrayList<Task> list = new ArrayList<>();
        list.add(new Task("hello"));
        model.addAttribute("title", "Task List");
        model.addAttribute("fields", list);
        return "tasks/view";
    }
}
