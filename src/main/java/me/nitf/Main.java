package me.nitf;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        List<Message> messages = new ArrayList<Message>();
        messages.add(factory.getMessage("男"));
        messages.add(factory.getMessage("女"));
        messages.add(factory.getMessage("男"));
        messages.add(factory.getMessage("男"));
        messages.add(factory.getMessage("女"));
        messages.add(factory.getMessage("男"));
        messages.add(factory.getMessage("男"));
        messages.add(factory.getMessage("女"));

        for(Message message : messages){
            message.print();
        }
    }
}