package com.aditya.models;

import java.util.Objects;

public class Queue {

    private String queueName;
    private String destinationName;
    private String host;


    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Queue)) return false;
        Queue queue = (Queue) o;
        return Objects.equals(getQueueName(), queue.getQueueName()) && Objects.equals(getDestinationName(), queue.getDestinationName()) && Objects.equals(getHost(), queue.getHost());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getQueueName(), getDestinationName(), getHost());
    }
}
