package com.example.michael.streams;

import java.io.*;
import java.net.Socket;

public class Client {
    // constructor
    public Client(String address, int port){
        try {
            // Create a socket connection
            Socket socket = new Socket(address, port);
            System.out.println("Connected to " + address + ":" + port);
            System.out.println("===========================================");

            // Create input and output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            // Read from System.in
            String line = "";
            while (!line.equals("Over")) {
                line = input.readLine();
                output.write(line);
            }

            // Close connections and streams
            input.close();
            output.close();
            socket.close();

        }
        catch (IOException ioe){
            System.out.println("Connection failed");
        }
    }

    // main
    public static void main(String[] args) {
        Client client = new Client("localhost", 5006);
    }
}
