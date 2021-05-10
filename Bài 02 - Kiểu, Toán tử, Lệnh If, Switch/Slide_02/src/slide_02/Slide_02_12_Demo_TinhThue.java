/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_02;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Slide_02_12_Demo_TinhThue {
    public static void main(String[] args) {
        int tien;
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Lương = ");
            tien = Integer.parseInt(s.nextLine());
            if(tien<9000000){
                System.out.println("Bạn không phải đóng thuế");
            }
            else if(tien<15000000){
                System.out.println("Thuế = "+ (0.1*tien));
            }
            else if(tien<30000000){
                System.out.println("Thuế = "+(0.15*tien));
            }
            else {
                System.out.println("Thuế = "+(0.3*tien));
            }
        } 
        catch (Exception e) {
            System.out.println("Bạn không nhập đúng");
        }
    }
}
