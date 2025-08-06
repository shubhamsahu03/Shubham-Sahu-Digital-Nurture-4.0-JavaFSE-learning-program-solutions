package com.example;

import org.example.FileReader;
import org.example.FileService;
import org.example.FileWriter;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class FileServiceTest {

    @Test
    public void testServiceWithMockFileIO() {
        FileReader reader = mock(FileReader.class);
        FileWriter writer = mock(FileWriter.class);

        when(reader.read()).thenReturn("Mock File Content");

        FileService fileService = new FileService(reader, writer);
        String result = fileService.processFile();

        verify(writer).write("Processed Mock File Content");
        assertEquals("Processed Mock File Content", result);
    }
}
