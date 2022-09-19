package com.aditya.service.impl;

import com.aditya.models.Message;
import com.aditya.service.Consumer;

public class GleoConsumer extends Consumer {
    @Override
    public boolean receive(Message message) {
        System.out.println("GELO IS CONSUMING");
        return false;
    }
}
