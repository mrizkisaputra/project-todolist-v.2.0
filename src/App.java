import repository.*;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class App {
    public static void main(String[] args) {

        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todolistService = new TodoListServiceImpl(todoListRepository);
        TodoListView todolistView = new TodoListView(todolistService);

        todolistView.viewMainTodoList();
    }
}
