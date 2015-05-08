package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class  RunCopy implements Runnable {
    private final File out;
    private final File in;

    public RunCopy (File in, File out){
        this.in = in;
        this.out = out;

    }

    @Override
    public void run() {
        byte buffer[] = new byte[1024];
        try {
            FileInputStream fileIn = new FileInputStream(in);
            int bytes = fileIn.read(buffer,0,100000000);
            fileIn.close();

            FileOutputStream fileOut = new FileOutputStream(out);
            fileOut.write(buffer,0,bytes);
            fileOut.close();
        }
        catch (Exception e) {

        }
    }
}
