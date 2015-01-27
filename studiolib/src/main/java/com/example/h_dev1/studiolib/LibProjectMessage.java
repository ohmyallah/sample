package com.example.h_dev1.studiolib;

/**
 * Created by H_DEV1 on 2015-01-26.
 */
public class LibProjectMessage {

    private String msg;

    public LibProjectMessage(String message) {

        this.msg = message;
    }

    public String getMessage() {

        return "Message from LibProject :::::: " + this.msg;
    }
}
