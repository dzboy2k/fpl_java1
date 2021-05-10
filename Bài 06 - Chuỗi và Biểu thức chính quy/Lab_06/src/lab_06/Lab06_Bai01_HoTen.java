/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_06;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Lab06_Bai01_HoTen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ tên: ");
        String hoTen = sc.nextLine();
        String ho = hoTen.substring(0, hoTen.indexOf(" "));
        String ten = hoTen.substring(hoTen.lastIndexOf(" ")+1);
        String dem = hoTen.substring(hoTen.indexOf(" "), hoTen.lastIndexOf(" ")+1);
        System.out.println(ho.toUpperCase() + dem + ten.toUpperCase());
    }
    
}
