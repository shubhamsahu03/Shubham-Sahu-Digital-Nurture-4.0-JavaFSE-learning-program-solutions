package com.example;

import org.example.ExternalApi;
import org.example.MyService;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class MockitoOrderingTest {

    @Test
    public void testMethodCallOrder() {
        // Arrange: create a mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Create service using the mock
        MyService service = new MyService(mockApi);

        // Act: perform multiple actions
        service.updateData("Payload-1");
        service.removeItem("Item-1");

        // Assert: verify method call order
        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).sendData("Payload-1");
        inOrder.verify(mockApi).deleteItem("Item-1");
    }
}
