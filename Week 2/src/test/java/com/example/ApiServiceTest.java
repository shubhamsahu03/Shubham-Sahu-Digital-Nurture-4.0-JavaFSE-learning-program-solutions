package com.example;

import org.example.ApiService;
import org.example.RestClient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ApiServiceTest {

    @Test
    public void testServiceWithMockRestClient() {
        RestClient mockClient = mock(RestClient.class);
        when(mockClient.getResponse()).thenReturn("Mock Response");

        ApiService service = new ApiService(mockClient);
        String result = service.fetchData();

        assertEquals("Fetched Mock Response", result);
    }
}
