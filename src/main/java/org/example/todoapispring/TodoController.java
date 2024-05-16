package org.example.todoapispring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController // helps in object creation and
public class TodoController {

    public static List<Todo> todoList;

    public TodoController() {
        todoList = new ArrayList<>();
        todoList.add(new Todo(1, "Todos1", false, 1));
        todoList.add(new Todo(2, "Todos1", false, 2));
    }

    @GetMapping("/todos")
    public List<Todo> getTodos() {
        System.out.println("heh");
        return todoList;
    }

    @PostMapping("/todos")
    public Todo createTodo(@RequestBody Todo newTodo) {
        todoList.add(newTodo);
        return newTodo;
    }
}
