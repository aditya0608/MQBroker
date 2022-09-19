package com.aditya.service.impl;

import com.aditya.models.Message;
import com.aditya.service.Consumer;
import com.aditya.service.MessageBroker;

import java.util.ArrayList;
import java.util.List;

public class DertMessageBroker implements MessageBroker {

    List<Consumer> consumers=new ArrayList<>();
    @Override
    public boolean send(Message message) {
        for(Consumer consumer:consumers) {
            System.out.println("DERT IS SENDING THE MESSAGE "+message);
        }
        return false;
    }
    @Override
    public boolean addObserver(Consumer consumer) {
        return consumers.add(consumer);
    }
    @Override
    public boolean removeObserver(Consumer consumer) {
        return consumers.remove(consumer);
    }
}
