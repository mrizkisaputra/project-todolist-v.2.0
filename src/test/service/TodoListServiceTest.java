package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] xxx) {
        testUpdateTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepositoryImpl todolistRepositoryImpl = new TodoListRepositoryImpl();
//        todolistRepositoryImpl.data[0] = new TodoList("Belajar Java");
//        todolistRepositoryImpl.data[1] = new TodoList("Belajar Java OOP");

        TodoListService todolistService = new TodoListServiceImpl(todolistRepositoryImpl);
        todolistService.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todolistService = new TodoListServiceImpl(todoListRepository);

        todolistService.addTodoList("Belajar PHP 1");

        todolistService.showTodoList();
    }

    public static void testDeleteTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todolistService = new TodoListServiceImpl(todoListRepository);

        todolistService.addTodoList("Belajar PHP 1");
        todolistService.deleteTodoList(1);

        todolistService.showTodoList();
    }

    public static void testUpdateTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todolistService = new TodoListServiceImpl(todoListRepository);

        todolistService.addTodoList("Belajar PHP 1");

        System.out.println(todolistService.updateTodoList(1, "New Todo"));
        todolistService.showTodoList();
    }
}
