package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        String dir1 = "D://MyProjects//CopyThread//old";
        String dir2 = "D://MyProjects//CopyThread//new";
        copyFilesDir(dir1,dir2);

    }
    public static void copyFilesDir (String dir1,String dir2) throws IOException {
        File[] list = new File(dir1).listFiles();

        for ( int i = 0; i < list.length; i++){
            File f = new File (dir1 +"//"+ list[i].getName());
            File f2 = new File (dir2 +"//"+ list[i].getName());
            Thread t = new Thread(new RunCopy(f,f2));
            t.start();
            System.out.println("File " + list[i] + " has been copy " +dir2+" treadom "+t.getName());

        }
    }
}


