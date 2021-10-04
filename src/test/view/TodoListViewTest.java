package test.view;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
        testShowTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepository todolistRepository = new TodoListRepositoryImpl();
        TodoListService todolistService = new TodoListServiceImpl(todolistRepository);
        TodoListView todoListView = new TodoListView(todolistService);

        todolistService.addTodoList("Belajar Java");
        todolistService.addTodoList("Belajar Programming");

        todoListView.viewMainTodoList();
    }
}
