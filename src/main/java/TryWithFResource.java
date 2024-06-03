package main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//In try-with-resources, a resource is opened in try block inside small brackets and finally block is completely gone.
public class TryWithFileResource {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:/prakash/destination rule.txt")))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null)
            {
                System.out.println(sCurrentLine);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
