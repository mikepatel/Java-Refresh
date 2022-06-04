package com.example.michael.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket server = null;

    // Constructor
    public Server(int port){
        try {
            server = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Waiting for a client to connect...");
            System.out.println("===========================================");

        }
        catch (IOException ioe){
            System.out.println("Failed to start server");
        }
    }

    public void run(){
        try {
            Socket socket = server.accept();
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Read from client
            String line = "";
            while (line != null) {
                line = input.readLine();

                if(line == null){
                    break;
                }
                else{
                    System.out.println(line);
                }
            }

            // Close connections and streams
            System.out.println("Closing connection");
            input.close();
            socket.close();

        }
        catch (IOException | NullPointerException ioe) {
            System.out.println("Unable to read from client");
        }
    }

    // main
    public static void main(String[] args) {
        Server server = new Server(5006);
        server.run();
    }
}
