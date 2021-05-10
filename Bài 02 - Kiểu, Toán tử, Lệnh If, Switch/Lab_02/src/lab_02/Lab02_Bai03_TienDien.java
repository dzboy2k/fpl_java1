/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_02;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Lab02_Bai03_TienDien {
    public static void main(String[] args) {
        int soDien;
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Số điện: ");
            soDien = Integer.parseInt(s.nextLine());
            if(soDien<50){
                System.out.println("Tiền = "+soDien*1000);
            }
            else{
                System.out.println("Tiền = "+soDien*1200);
            }
        } catch (Exception e) {
            System.out.println("Bạn nhập sai");
        }
    }
}
