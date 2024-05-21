package org.example.todoapispring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("fakeTodoService")
public class FakeTodoService implements TodoService {

    @Override
    public String doSomething() {
        System.out.printf("Object 2 " + this);
        return "Fake Todo Service.....";
    }

    @Override
    public String fakedoSomething() {
        return "Fake Fake Todo Service....";
    }
}
