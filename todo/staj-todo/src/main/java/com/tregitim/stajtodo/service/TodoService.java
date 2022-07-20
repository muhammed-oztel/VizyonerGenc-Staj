package com.tregitim.stajtodo.service;

import com.tregitim.stajtodo.model.TodoEntity;
import com.tregitim.stajtodo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<TodoEntity> findAll() {
        return todoRepository.findAll();
    }

    public TodoEntity create(TodoEntity entity) {
        entity.setComplete(false);
        return todoRepository.save(entity);

    }

    public TodoEntity update(Long id, TodoEntity entity) {
        TodoEntity db = todoRepository.getReferenceById(id);
        db.setText(entity.getText());
        return todoRepository.save(db);
    }

    public TodoEntity complete(Long id) {
        TodoEntity db = todoRepository.getReferenceById(id);
        db.setComplete(true);
        return todoRepository.save(db);
    }

    public Boolean delete(Long id) {
        todoRepository.deleteById(id);
        return true;
    }
}
