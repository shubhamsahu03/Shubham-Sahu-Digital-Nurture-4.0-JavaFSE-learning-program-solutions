package org.example;

public class FileService {
    private final FileReader fileReader;
    private final FileWriter fileWriter;

    public FileService(FileReader reader, FileWriter writer) {
        this.fileReader = reader;
        this.fileWriter = writer;
    }

    public String processFile() {
        String content = fileReader.read();
        fileWriter.write("Processed " + content);
        return "Processed " + content;
    }
}
