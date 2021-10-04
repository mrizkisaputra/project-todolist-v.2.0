package view;

import service.TodoListService;
import util.InputUtil;

public class TodoListView {
    private final TodoListService todolistService;

    public TodoListView(TodoListService todolistService) {
        this.todolistService = todolistService;
    }

    public void viewMainTodoList() {
        while (true) {
            System.out.println("-----------+ Todo List +-----------");
            todolistService.showTodoList();
            System.out.println("-----------------------------------");
            System.out.println("-------------+ Menu +--------------");
            System.out.print("[1]. Add TodoList\n" +
                    "[2]. Delete TodoList\n" +
                    "[3]. Update TodoList\n" +
                    "[x]. Exit\n");
            System.out.println("-----------------------------------");
            String choose = InputUtil.input("Choose Menu > ");

            switch (choose) {
                case "1": viewAddTodoList(); break;
                case "2": viewDeleteTodoList(); break;
                case "3": viewUpdateTodoList(); break;
                case "x": System.exit(0); break;
                default: System.err.println("Choose menu '"+choose+"' Not Found!"); break;
            }
        }
    }

    public void viewAddTodoList() {
        var todo = InputUtil.input("Input Name Todo : ");
        todolistService.addTodoList(todo);
    }

    public void viewUpdateTodoList() {
        String newNameTodo = InputUtil.input("input new name todolist (x if cancel) : ");

        if (newNameTodo.equalsIgnoreCase("x")) {
            //tuliskan kode disini
        }
        else {
            String updateNumberTodo = InputUtil.input("input update number todolist : ");

            boolean success = todolistService.updateTodoList(Integer.valueOf(updateNumberTodo),newNameTodo);
            if (!success) System.out.println("Update Todo Fail! Number "+updateNumberTodo+" Not Found!\n\n");
            if (success) System.out.println("Update Todo Success\n\n");
        }
    }

    public void viewDeleteTodoList() {
        String deleteTodo = InputUtil.input("delete number todolist (x if cancel) : ");
        if (deleteTodo.equalsIgnoreCase("x")) {
            // tuliskan kode disini
        }
        else {
            var success = todolistService.deleteTodoList(Integer.valueOf(deleteTodo));
            if (!success) System.out.println("Fail Delete Number! "+deleteTodo+" Not Found\n\n");
            if (success) System.out.println("Success Delete Todo\n\n");
        }
    }
}
