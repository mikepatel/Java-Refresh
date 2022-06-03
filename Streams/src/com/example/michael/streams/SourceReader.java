package com.example.michael.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SourceReader {

    // main
    public static void main(String[] args) {
        try (
                FileReader file = new FileReader("C:\\Users\\micha\\Desktop\\JavaProjects\\Java-Refresh\\Streams\\src\\com\\example\\michael\\streams\\data.txt");
                BufferedReader buffer = new BufferedReader(file);
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
            System.out.println("Error: " + ioe.toString());
        }
    }
}
