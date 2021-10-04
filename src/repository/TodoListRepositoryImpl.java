package repository;

import entity.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository {
    private TodoList[] data = new TodoList[10];

    public boolean isFull() {
        for(var i = 0; i < data.length; i++) {
            if(data[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void risizeIfFull() {
        if(isFull()) {
            TodoList[] temp = data; /*ambil data sebelumnya yang sudah ada*/
            data = new TodoList[data.length * 2]; /*risize*/

            for(var i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(TodoList todo) {
        risizeIfFull();

        for(var i = 0; i < data.length; i++) {
            if(data[i] == null) {
                data[i] = todo; break;
            }
        }
    }

    @Override
    public TodoList[] getAll() {
        return data;
    }

    @Override
    public boolean update(Integer number, TodoList newTodo) {
        if(number-1 > data.length || data[number-1] == null) return false;

        if(data[number-1] != null) {
            data[number-1] = newTodo;
        }
        return true;
    }

    @Override
    public boolean delete(Integer number) {
        if(number-1 > data.length || data[number-1] == null) return false;
        if(data[number-1] != null) { /*cek apakah data yang akan dihapus tidak null*/
            data[number-1] = null; /*set menjadi null*/

            if(data[number-1] == null) {
                /*melakukan pergeseran elemen array*/
                for(var i = number-1; i < data.length; i++) {
                    if(i == data.length-1) break;
                    data[i] = data[i+1];
                }
            }
        }
        return true;
    }
}
