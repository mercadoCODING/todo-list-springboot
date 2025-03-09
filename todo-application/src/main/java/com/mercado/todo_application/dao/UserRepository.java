package com.mercado.todo_application.dao;

import com.mercado.todo_application.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
}
