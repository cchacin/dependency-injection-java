package todo.app;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TodoViewTest implements WithAssertions {

    @Test
    void test(@Mock TodoHttpClient httpClient) throws Exception {
        // Given
        when(httpClient.getAll()).thenReturn(CompletableFuture.completedFuture(List.of()));

        // When
        var todoView = new TodoView(httpClient);
        todoView.displayListView();

        // Then
        assertThat(todoView.getTodoItemList()).isEmpty();
    }

}