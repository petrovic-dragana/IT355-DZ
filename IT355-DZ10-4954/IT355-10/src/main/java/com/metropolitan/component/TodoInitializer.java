package com.metropolitan.component;
import com.metropolitan.model.Todo;
import com.metropolitan.service.TodoService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
class TodoInitializer {

    private final TodoService messageBoardService;

    TodoInitializer(TodoService messageBoardService) {
        this.messageBoardService = messageBoardService;
    }

    @PostConstruct
    public void setup() {

        Todo todo = new Todo();
        todo.setOwner("it355-l10@email.net");
        todo.setDescription("IT355 - Lekcija Spring Security");

        messageBoardService.save(todo);

        todo = new Todo();
        todo.setOwner("it355-l10@email.net");
        todo.setDescription("Dobro procitaj lekciju!!!");
        todo.setCompleted(true);
        messageBoardService.save(todo);

        todo = new Todo();
        todo.setOwner("it355-l10@email.net");
        todo.setDescription("Pitaj ako ne znas!!!");

        messageBoardService.save(todo);

    }
}
