package com.todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoEntity, Integer>{

	
}
