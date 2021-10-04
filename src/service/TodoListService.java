package service;

import entity.TodoList;

public interface TodoListService {
    void showTodoList();

    void addTodoList(String todo);

    boolean updateTodoList(Integer number, String newTodo);

    boolean deleteTodoList(Integer Number);
}
