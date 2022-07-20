package com.tregitim.stajtodo.controller;

import com.tregitim.stajtodo.model.TodoEntity;
import com.tregitim.stajtodo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }


    @GetMapping("/read")
    public List<TodoEntity> read(){
        return todoService.findAll();
    }

    @PostMapping("/create")
    public TodoEntity create(@RequestBody TodoEntity request){
        return todoService.create(request);
    }

    @PutMapping("/update/{id}")
    public TodoEntity update(@PathVariable Long id, @RequestBody TodoEntity request){
        return todoService.update(id, request);
    }

    @PutMapping("/complete/{id}")
    public TodoEntity complete(@PathVariable Long id){
        return todoService.complete(id);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id){
        return todoService.delete(id);
    }

}
