/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import javax.swing.JOptionPane;


/**
 *
 * @author Administrator
 */
public class Lab2_6 {
     public static void main(String[] args) {
        // TODO code application logic here
        int n;
        try{
            n= Integer.parseInt(JOptionPane.showInputDialog(null,"Nhap so nguyen: ",""));
        }
        //bắt lỗi k phải số
        catch(java.lang.NumberFormatException e1){
            System.out.println(e1.toString());
        }
        //kết thúc vòng try_catch
        finally{
            System.out.println("Have good fun");
        }
    }
    
}
