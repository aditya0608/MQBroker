package com.aditya.service;

import com.aditya.models.Message;

public interface MessageBroker {

    boolean send(Message message);
    boolean addObserver(Consumer consumer);
    boolean removeObserver(Consumer consumer);
}
