package com.example.test.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.test.entity.Todo;
import com.example.test.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Ashot Simonyan on 27.10.23.
 */

@Controller
@RequiredArgsConstructor
public class TodoQuery implements GraphQLQueryResolver {

    private final TodoRepository todoRepository;

    @QueryMapping("todos")
    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

}
