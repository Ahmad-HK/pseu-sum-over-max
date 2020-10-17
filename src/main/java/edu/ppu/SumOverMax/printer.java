package edu.ppu.SumOverMax;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class printer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(new File("helloText.txt"));

        fw.write("HI World\n");
        fw.close();

    }
}
