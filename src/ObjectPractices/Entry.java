package ObjectPractices;

import java.util.List;

public class Entry {
    private String content;
    private String date;

    public Entry(String content, String date) {
        this.content = content;
        this.date = date;
    }
    public String getContent(){
        return content;
    }
    public String getDate(){
        return date;
    }
    @Override
    public String toString(){
        return " Date: " + date + " \n " + content + " \n ";
    }
}

