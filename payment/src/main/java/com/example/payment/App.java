package com.example.payment;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        try (ClassPathXmlApplicationContext ctx =
                     new ClassPathXmlApplicationContext("beans.xml")) {
            PaymentProcessor processor = ctx.getBean(PaymentProcessor.class);
            processor.process(149.99);
        }
    }
}
