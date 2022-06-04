package com.example.michael.streams;

import java.io.BufferedReader;
import java.io.DataInputStream;
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

        }
        catch (IOException ioe){
            System.out.println(ioe);
        }
    }

    public void run(){
        try {
            Socket socket = server.accept();
            DataInputStream input = new DataInputStream(socket.getInputStream());

            System.out.println("===========================================");

            String line = "";
            while (!line.equals("Over")){
                try {
                    line = input.readUTF();
                    System.out.println(line);
                }
                catch (IOException ioe) {
                    System.out.println(ioe);
                }

                catch (NullPointerException npe){
                    System.out.println(npe);
                }
            }

            System.out.println("Closing connection");
            input.close();
            socket.close();
        }
        catch (IOException ioe){
            System.out.println(ioe);
        }
    }

    // main
    public static void main(String[] args) {
        Server server = new Server(5006);
        server.run();
    }
}
