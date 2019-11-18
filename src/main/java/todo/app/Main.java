package todo.app;

class Main {
  public static void main(String... args) {
    new TodoApp(new TodoView(TodoHttpClient.create())).showTodoList();
  }
}