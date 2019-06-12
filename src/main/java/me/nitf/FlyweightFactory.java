package me.nitf;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Message> messages;

    FlyweightFactory() {
        this.messages = new HashMap<String, Message>();
    }

    public Message getMessage(String str_message) {
        Message message = this.messages.get(str_message);
        if (message == null) {
            this.messages.put(str_message, new Message(str_message));
        }
        return this.messages.get(str_message);
    }
}
