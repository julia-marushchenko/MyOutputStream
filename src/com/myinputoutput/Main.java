/**
 *  Java program to use IO with byte streams to write into a file.
 */

package com.myinputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an InputStream.
        try {

            // Variable to store size of file.
            int sizeOfFile = 0;

            // Opening input stream.
            InputStream in = new FileInputStream("src/File.txt");
            OutputStream out = new FileOutputStream("src/File1.txt");

            // Variable to store read data.
            int i = 0;

            // Reading from a file.
            while ((i = in.read()) != -1) {

                // Writing to a file.
                out.write(i);

            }

            // Closing input stream.
            in.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}