package com.company;

public class SphinxesException extends Exception {
    public SphinxesException(String e) {
        Throwable arg = new Throwable(e);
        initCause(arg);
    }
}
