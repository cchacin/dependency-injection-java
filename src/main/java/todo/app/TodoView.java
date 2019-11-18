package todo.app;

import java.util.ArrayList;
import java.util.List;

class TodoView {
  private final TodoHttpClient todoHttpClient;
  
  private List<TodoItem> todoItemList = new ArrayList<>();

  TodoView(final TodoHttpClient todoHttpClient) {
    this.todoHttpClient = todoHttpClient;
  }

  public void displayListView() {
    // refresh the todoItemList data structure
    todoHttpClient.getAll().thenAccept(this.todoItemList::addAll).join();
    // show the UI
    // framework.displayListView(this.todoItemList);
  }

  public List<TodoItem> getTodoItemList() {
    return todoItemList;
  }
}