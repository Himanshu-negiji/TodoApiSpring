package org.example.todoapispring;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;

import javax.crypto.spec.PSource;
@Service("anotherTodoService")
public class AnotherTodoService implements TodoService {

    @Override
    public String doSomething() {
        return "Another Todo service....";
    }

    @Override
    public String fakedoSomething() {
        return "Another Another Todo service....";
    }
}
