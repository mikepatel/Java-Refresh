package com.example.michael.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SourceReader {

    // main
    public static void main(String[] args) {
        // Create file objects
        String filename = "C:\\Users\\micha\\Desktop\\JavaProjects\\Java-Refresh\\Streams\\src\\com\\example\\michael\\streams\\data.txt";

        // Create a file object
        Path source = Paths.get(filename);

        try (
                // Create an input stream
                FileReader file = new FileReader(source.toFile());

                // Associate a buffer filter with input stream
                BufferedReader buffer = new BufferedReader(file)

        )  // declare resources inside parentheses
        {
            boolean eof = false;
            while(!eof){
                String line = buffer.readLine();
                if(line == null){
                    eof = true;
                }
                else {
                    System.out.println(line);
                }
            }

        } catch (IOException ioe) {
            System.out.println("Error: " + ioe);
        }
    }
}
