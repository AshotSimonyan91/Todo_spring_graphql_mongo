package com.example.test.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.test.entity.Todo;
import com.example.test.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

/**
 * Created by Ashot Simonyan on 27.10.23.
 */

@Controller
@RequiredArgsConstructor
public class TodoMutation implements GraphQLMutationResolver {

    private final TodoRepository todoRepository;

    @MutationMapping("createTodo")
    public Todo createNewTodo(@Argument String todo) {
        Todo todoObj = new Todo();
        todoObj.setTodo(todo);
        return todoRepository.save(todoObj);
    }

}
