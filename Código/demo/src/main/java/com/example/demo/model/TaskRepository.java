/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.demo.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author RafaelBP
 */
@Transactional
public interface TaskRepository extends CrudRepository<Task, Long>{
    
    public Task findByName(String name);
}
