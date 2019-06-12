package me.nitf;

public class Message {

    private String message;

    Message(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(this.message);
    }
}
