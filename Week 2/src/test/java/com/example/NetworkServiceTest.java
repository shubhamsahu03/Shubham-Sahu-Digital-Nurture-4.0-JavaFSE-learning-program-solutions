package com.example;

import org.example.NetworkClient;
import org.example.NetworkService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class NetworkServiceTest {

    @Test
    public void testServiceWithMockNetworkClient() {
        NetworkClient client = mock(NetworkClient.class);
        when(client.connect()).thenReturn("Mock Connection");

        NetworkService service = new NetworkService(client);
        String result = service.connectToServer();

        assertEquals("Connected to Mock Connection", result);
    }
}
