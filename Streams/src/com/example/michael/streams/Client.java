package com.example.michael.streams;

import java.io.*;
import java.net.Socket;

public class Client {
    private Socket socket;
    private DataInputStream input;
    private DataOutputStream output;

    // constructor
    public Client(String address, int port){
        try {
            socket = new Socket(address, port);
            System.out.println("Connected to " + address + ":" + port);

            input = new DataInputStream(System.in);
            output = new DataOutputStream(socket.getOutputStream());
        }
        catch (IOException ioe){
            System.out.println(ioe);
        }

        System.out.println("===========================================");

        String line = "";
        while (!line.equals("Over")){
            try {
                line = input.readLine();
                output.writeUTF(line);

            }
            catch (IOException ioe){
                System.out.println(ioe);
            }
        }

        // close connections
        try {
            input.close();
            output.close();
            socket.close();
        }
        catch (IOException ioe){
            System.out.println(ioe);
        }
    }

    // main
    public static void main(String[] args) {
        Client client = new Client("localhost", 5006);
    }
}
