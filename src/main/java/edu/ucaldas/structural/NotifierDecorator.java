package edu.ucaldas.structural;

public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappee;

    public NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String send(String message) {
        // delega la llamada al objeto envuelto
        return wrappee.send(message);
    }
}
