package MrChiClassOnDataStructure;

import java.util.ArrayList;
import java.util.List;

public class ArrayPractice {

    private List<String> clients;

    public ArrayPractice(){
        this.clients = new ArrayList<>();
    }

    public List<String> getClients() {
        return clients;
    }

    public void setClients(List<String> clients) {
        this.clients = clients;
    }

    public int getNumClients() {
        return clients.size();
    }

    public void addClient(String client) {
        clients.add(client);
    }

    public boolean removeClient(String nonePresentClients) {
        return
        clients.remove(nonePresentClients);
    }
}
