/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Lab2_10 {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "";
        File f = new  File("");
        fileName = f.getAbsolutePath() + "\\src\\lab2\\data.txt";
        f = new File(fileName);
        if(f.exists()){
            System.out.println("File da ton tai");
            System.exit(0);
        }
        
        PrintWriter pw = new PrintWriter(f);
        pw.print("Copy right by Duong Thanh Phet");
        pw.println(2015);
        pw.print("http://thayphet.net");
        pw.close();
        pw.flush();
        System.out.println("Da ghi file xong");
        
        
        Scanner input = new Scanner(f);
        while(input.hasNext())
        {
            String ten = input.nextLine();
            System.out.println(ten + " ");
            String  maso = input.nextLine();
            System.out.println(maso);
        }
        
    }
    
}