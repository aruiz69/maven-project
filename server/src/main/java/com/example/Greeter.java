package com.example;

/**
 * This is a class.
 */
public class Greeter {

    /**
     * This is a constructor.
     */
    public Greeter() {

    }

    /**
     *  Example of method
     * @param someone
     * @return
     */
    public String greet(final String someone) {
        return String.format("Hello, %s!", someone);
    }
}
