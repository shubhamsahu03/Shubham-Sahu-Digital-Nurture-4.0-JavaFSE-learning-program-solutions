package org.example;

public class MyService {

    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public void updateData(String payload) {
        api.sendData(payload);
    }

    public void removeItem(String id) {
        api.deleteItem(id);
    }
}
