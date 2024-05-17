package org.example.todoapispring;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // helps in object creation and
@RequestMapping("/api/v1/todos/")
public class TodoController {

    public static List<Todo> todoList;

    public TodoController() {
        todoList = new ArrayList<>();
        todoList.add(new Todo(1, "Todos1", false, 1));
        todoList.add(new Todo(2, "Todos1", false, 2));
    }

    @GetMapping()
    public List<Todo> getTodos() {
        return todoList;
    }

    @PostMapping()
    public Todo createTodo(@RequestBody Todo newTodo) {
        todoList.add(newTodo);
        System.out.println("Logger");
        return newTodo;
    }

    @GetMapping("{todoId}")
    public ResponseEntity<Todo> getTodoById(@PathVariable int todoId) {
        for(Todo todo : todoList) {
            if(todo.getId() == todoId) {
                return ResponseEntity.ok(todo);
            }
        }
        String errorCode = "Todo with id not found";
        return new ResponseEntity(errorCode, HttpStatusCode.valueOf(404));
    }
}
