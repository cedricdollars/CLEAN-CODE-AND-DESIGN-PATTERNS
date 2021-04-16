package com.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Enter your username: ");
        String username = reader.readLine();
        System.out.print("Enter your password: ");
        String password = reader.readLine();

        System.out.print("Input message : ");
        String message = reader.readLine();
        System.out.println("Choose network social for posting message.\n" +
                "1 - LinkedIn \n" +
                "2 - Facebook");
        int choice = Integer.parseInt(reader.readLine());
        if (choice == 1){
           network = new LinkedIn(username, password);
        }
        if(choice == 2){
          network = new Facebook(username, password);
        }
        network.postData(message);
    }
}
