/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_01;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Lab01_Bai02_HinhChuNhat {
    public static void main(String[] args) {
        int dai, rong;
        Scanner s = new Scanner(System.in);
        System.out.print("Chiều dài: ");
        dai = s.nextInt();
        System.out.print("Chiều rộng: ");
        rong = s.nextInt();
        System.out.println("Chu vi = " + (dai + rong)*2);
        System.out.println("Diện tích = " + dai * rong);
        System.out.println("Cạnh nhỏ nhất = " + Math.min(dai, rong));
    }
}
