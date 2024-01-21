package com.springBoot.SpringBootDemo;

public class HelloWorldBean {


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }
}
