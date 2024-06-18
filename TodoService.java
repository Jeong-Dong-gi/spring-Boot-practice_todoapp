package com.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

	@Autowired
	TodoRepo tRepo;
	
	// DB에 있는 전체 데이터를 가져 오기
	public List<TodoEntity> getTodos() {
		return tRepo.findAll();
	}
	
	// 사용자에게 입력 받은 데이터를 DB에 저장
	public void putTodo(TodoEntity tEntity) {
		tRepo.save(tEntity);
	}
	
	// 받은 id 값으로 삭제 하기
	public void deleteTodo(Integer id) {
		tRepo.deleteById(id);
	}

	
	public void updateTodo(Integer id) {
		
		
	}
	// id 값을 이용하여 한개의 todo를 가져오기
	public TodoEntity getTodo(Integer id) {
		return tRepo.findById(id).get();
	}
}
