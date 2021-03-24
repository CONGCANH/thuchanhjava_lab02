/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.io.*;
import java.util.Scanner;
import java.math.*;
import java.lang.*;
     
public class lab2_2 {
    public static void main(String[] args) {
        
    int n;
    
    int nghiem=0;
    Scanner scaner = new Scanner(System.in);
    System.out.println("nhap so phan tu n: ");
    n=scaner.nextInt();
    int a[] = new int[n];
    
    //khoi tao mang
    for(int stt=0;stt<n;stt++)
    {
            a[stt]= (int)(Math.random()*100);
    }
    //xuat mang 
    System.out.printf("\n---Tất cả các phan tu trong mảng là---\n ");
     for(int stt=0;stt<n;stt++)
    {
            System.out.print(""+a[stt]+"\t");
    }
     
    //xuat snt
    System.out.printf("\n---Tất cả các số nguyên tố trong mảng---\n");
     for(int stt=0;stt<n;stt++)
    {
            if (ktnt(a[stt])) {
                System.out.print(" " + a[stt]);
                
            }
    }
        
    }
    //ktnt
     public static boolean ktnt(int n) {
        // so nguyen a[i] < 2 khong phai la so nguyen to
        if ( n < 2) {
            return false;
        }
        // check so nguyen to khi nghiem >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            
            if (n % i == 0) {
                return false;
            }
            
        }
        return true;
    }
    
}

