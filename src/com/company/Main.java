package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        String dir1 = args[0];
        String dir2 = args[1];
        copyFilesDir(dir1,dir2);

    }
    public static void copyFilesDir (String dir1,String dir2) throws IOException {
        File[] list = new File(dir1).listFiles();

        for ( int i = 0; i < list.length; i++){
            File f = new File (dir1 +"//"+ list[i].getName());
            File f2 = new File (dir2 +"//"+ list[i].getName());
            copyFile(f,f2);
            System.out.println("Файл " + list[i] + " скопирован в директорию " +dir2);

        }
    }

    public static void copyFile(File in, File out) throws IOException {


        byte buffer[] = new byte[100000000];
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
