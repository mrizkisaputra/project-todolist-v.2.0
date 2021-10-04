package repository;

import entity.TodoList;

public interface TodoListRepository {
    void add(TodoList todo);

    TodoList[] getAll();

    boolean update(Integer number, TodoList newTodo);

    boolean delete(Integer number);
}