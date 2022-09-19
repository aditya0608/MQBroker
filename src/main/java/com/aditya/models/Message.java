package com.aditya.models;

import java.sql.Time;
import java.util.Objects;

public class Message {

    private long correlationId;
    private String message;
    private Time timestamp;
    private Integer messagePriority;

    public long getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(long correlationId) {
        this.correlationId = correlationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Time getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Time timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getMessagePriority() {
        return messagePriority;
    }

    public void setMessagePriority(Integer messagePriority) {
        this.messagePriority = messagePriority;
    }
    @Override
    public String toString() {
        return "Message{" +
                "correlationId=" + correlationId +
                ", message='" + message + '\'' +
                ", timestamp=" + timestamp +
                ", messagePriority=" + messagePriority +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message1 = (Message) o;
        return getCorrelationId() == message1.getCorrelationId() && getMessage().equals(message1.getMessage()) && getTimestamp().equals(message1.getTimestamp()) && getMessagePriority().equals(message1.getMessagePriority());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getCorrelationId(), getMessage(), getTimestamp(), getMessagePriority());
    }
}


