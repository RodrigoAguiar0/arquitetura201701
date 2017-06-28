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

    /**
    * Método para pesquisa por nome no banco de dados 
    * @param nome String: Nome pelo qual deve ser feita a pesquisa
    * @return Task: Objeto encontrado a partir do nome fornecido
    */
    @RequestMapping("/")
    @ResponseBody
    Task home(String nome) {
        return repository.findByName(nome);
    }
    
    /**
     * Métoo para criação de objetos Task no banco de dados
     * @param name String: Atributo name do objeto Task
     * @return Task: Objeto adicionado no banco de dados
     */
    @RequestMapping(path = "/", method = RequestMethod.POST)
    @ResponseBody
    Task create(String name){
        Task task = new Task(name);
        
        repository.save(task);
        
        return task;
    }
}
