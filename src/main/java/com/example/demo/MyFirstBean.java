package com.example.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyFirstBean {
    public static final Logger LOGGER
            = LoggerFactory.getLogger(MyFirstBean.class);

    public MyFirstBean() {
        LOGGER.info("I am first bean!");
    }
}
