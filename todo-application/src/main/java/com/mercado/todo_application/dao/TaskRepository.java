package com.mercado.todo_application.dao;

import com.mercado.todo_application.entities.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository <Task, Long> {

}
