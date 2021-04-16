package com.method;

public class Facebook extends Network{
    private String username;
    private String password;

    Facebook(String username, String password) {
        this.username = username;
        this.password = password;
    }
    @Override
    protected boolean logIn(String username, String password) {
        System.out.println("Checking user's connection for Facebook");
        System.out.println("Username : " + this.username);
        System.out.print("Password : ");
        for(int i = 0; i < this.password.length(); i ++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("Success login Facebook");
        return true;
    }

    private void simulateNetworkLatency() {
        int i = 0;
        try {
            while(i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if(messagePosted) {
            System.out.println("Message " +new String(data)+ " was posted ");
            return true;
        }
        return false;
    }

    @Override
    protected void logOut() {
        System.out.println("logOut successfully from LinkedIn");

    }
}
