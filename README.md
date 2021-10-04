# **Todo List Project**
Ini adalah project **todolist V.2.0** yang dibuat dengan konsep OOP(Object Oriented Programming) serta menerapkan Clean Architecture.

<br>

## Struktur Project Clean Architecture

+   ![icons8-folder-16](https://user-images.githubusercontent.com/58760966/135822117-a4cf375f-6922-4d01-adbf-b76239b279f0.png) **entity** layer ini berisi representasi model data yang digunakan.

    +   TodoList.java

<br>   

+   ![icons8-folder-16](https://user-images.githubusercontent.com/58760966/135822117-a4cf375f-6922-4d01-adbf-b76239b279f0.png) **repository** layer ini berisi representasi manipulasi data.

    +   TodoListRepository.java
    +   TodoListRepositoryImpl.java

<br>

+   ![icons8-folder-16](https://user-images.githubusercontent.com/58760966/135822117-a4cf375f-6922-4d01-adbf-b76239b279f0.png) **service** layer ini berisi representasi business logic.

    +   TodoListService.java
    +   TodoListServiceImpl.java

<br>

+   ![icons8-folder-16](https://user-images.githubusercontent.com/58760966/135822117-a4cf375f-6922-4d01-adbf-b76239b279f0.png) **view** layer ini berisi representasik dari ui view.

    +   TodoListView.java

<br>

+   ![icons8-folder-16](https://user-images.githubusercontent.com/58760966/135822117-a4cf375f-6922-4d01-adbf-b76239b279f0.png) test

    +   ![icons8-folder-16](https://user-images.githubusercontent.com/58760966/135822117-a4cf375f-6922-4d01-adbf-b76239b279f0.png) service

    +   ![icons8-folder-16](https://user-images.githubusercontent.com/58760966/135822117-a4cf375f-6922-4d01-adbf-b76239b279f0.png) view