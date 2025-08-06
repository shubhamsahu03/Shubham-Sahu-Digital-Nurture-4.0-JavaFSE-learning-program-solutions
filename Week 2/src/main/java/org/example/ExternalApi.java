package org.example;

public interface ExternalApi {
    String getData();
    void sendData(String payload);
    void deleteItem(String id);
}
