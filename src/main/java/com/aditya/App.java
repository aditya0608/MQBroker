package com.aditya;

import com.aditya.models.Message;
import com.aditya.service.MessageBroker;
import com.aditya.service.impl.DertMessageBroker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //producer --> queue-->Message
        //consumer-->{register(_subscriber}}
        DertMessageBroker broker=new DertMessageBroker();
        broker.send(new Message());
    }
}
