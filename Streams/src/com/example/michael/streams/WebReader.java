package com.example.michael.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WebReader {

    // main
    public static void main(String[] args) {
        String website = "https://www.theringer.com/";

        try {
            WebReader app = new WebReader();
            app.getData(website);  // args[0] = website input
        }
        catch (MalformedURLException e){
            System.out.println("Bad URL: " + website);
        }
    } // end main

    private void getData(String webAddress) throws MalformedURLException {
        // Create a URL object
        URL page = new URL(webAddress);
        StringBuilder text = new StringBuilder();

        try {
            // Create a HttpURLConnection object to load URL and make connection
            HttpURLConnection connection = (HttpURLConnection) page.openConnection();
            connection.connect();

            // Create an Input Stream Reader object to read data from URL
            InputStreamReader inputStreamReader = new InputStreamReader((InputStream) connection.getContent());

            // Create a Buffered Reader object to efficiently read characters from input stream
            BufferedReader buffer = new BufferedReader(inputStreamReader);

            boolean eof = false;
            while(!eof){
                String line = buffer.readLine();

                if(line == null){
                    eof = true;
                }

                text.append(line);
                text.append("\n");
            }

            System.out.println(text);

        } catch (IOException ioe){
            System.out.println("IO Error: " + ioe);
        }
    }
}
