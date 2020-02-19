package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {


        while (true)//test rolling file
            logger.debug("123");


    }

    static int getNumber() {
        return 5;
    }

}
