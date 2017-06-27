/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.demo;

import com.example.demo.model.Task;
import com.example.demo.model.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author RafaelBP
 */
@RestController
public class DemoController{
   
    @Autowired
    private TaskRepository repository;
    
    public DemoController(TaskRepository taskRepository){
        this.repository = taskRepository;
    }
    
    //método de procura de objetos no banco de dados
    @RequestMapping("/")
    @ResponseBody
    Task home() {
        return repository.findByName("SpringBoot");
    }
    
    //método de inserção de objetos no banco de dados
    @RequestMapping(path = "/", method = RequestMethod.POST)
    @ResponseBody
    Task create(String name){
        Task task = new Task(name);
        
        repository.save(task);
        
        return task;
    }
}
