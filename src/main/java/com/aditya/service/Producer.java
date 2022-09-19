package com.aditya.service;

import com.aditya.models.Message;

public abstract class Producer {

    private String destinationName;
    abstract boolean send(Message message);


}
