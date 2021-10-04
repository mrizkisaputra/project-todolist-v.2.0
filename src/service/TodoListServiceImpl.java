package service;

import repository.TodoListRepository;
import entity.TodoList;

public class TodoListServiceImpl implements TodoListService {
    private final TodoListRepository todolistRepository;

    public TodoListServiceImpl(TodoListRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showTodoList() {
        TodoList[] model = todolistRepository.getAll();

        for(var i = 0; i < model.length; i++) {
            TodoList todo = model[i]; /*mengambil todo*/
            int number = i+1; /*membuat nomor todo*/

            if(todo != null) {
                System.out.println(number+". "+todo.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {
        TodoList todoList = new TodoList(todo);
        todolistRepository.add(todoList);
    }

    @Override
    public boolean updateTodoList(Integer number, String newTodo) {
        TodoList todoList = new TodoList();
        todoList.setTodo(newTodo);
        return todolistRepository.update(number,todoList);
    }

    @Override
    public boolean deleteTodoList(Integer number) {
        return todolistRepository.delete(number);
    }
}
