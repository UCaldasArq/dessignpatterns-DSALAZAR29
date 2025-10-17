package edu.ucaldas.behavior;

public abstract class Handler {
    protected Handler nextHandler;

    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract String handleRequest(String request);
}
