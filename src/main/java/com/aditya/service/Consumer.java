package com.aditya.service;

import com.aditya.models.Message;

public abstract class Consumer {

    private String host;
    public abstract boolean receive(Message message);
}
