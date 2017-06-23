package com.krekapps.choresspringboot.controllers;

import com.krekapps.choresspringboot.models.Task;
import com.krekapps.choresspringboot.models.data.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Created by raefo on 22-Jun-17.
 */

@Controller
@RequestMapping(value="tasks")
public class TasksController {

    @Autowired
    private TaskDao taskDao;

    @RequestMapping(value="view")
    public String view(Model model) {
        model.addAttribute("title", "Task List");
        model.addAttribute("tasks", taskDao.findAll());
        return "tasks/view";
    }

    @RequestMapping(value="add", method=RequestMethod.GET)
    public String displayAdd(Model model) {
        model.addAttribute("title", "Add Task");
        model.addAttribute(new Task());
        return "tasks/add";
    }

    @RequestMapping(value="add", method=RequestMethod.POST)
    public String processAdd(Model model, @ModelAttribute @Valid Task task, Errors errors) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Task");
            return "tasks/add";
        }

        taskDao.save(task);
        model.addAttribute("title", "Task List");
        model.addAttribute("tasks", taskDao.findAll());
        return "tasks/view";
        //return "redirect:";
    }
}
