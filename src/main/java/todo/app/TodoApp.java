package todo.app;

public class TodoApp {
    private final TodoView todoView;

    TodoApp(final TodoView todoView) {
        this.todoView = todoView;
    }
    
    public void showTodoList() {
        todoView.displayListView();
    }
}
