package com.kea.Test;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("data.txt");
        }
        catch(IOException e){}

        /*try {
            fr.close();
        }
        catch(IOException e){}*/
    }
}
