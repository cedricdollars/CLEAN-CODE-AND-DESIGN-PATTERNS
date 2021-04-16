package com.method;


public abstract class Network {
    private String username;
    private String password;

    public final boolean postData(String message) {
        if(logIn(this.username, this.password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    protected abstract boolean logIn(String username, String password);
    protected abstract boolean sendData(byte[] data);
    protected abstract void logOut();
}
