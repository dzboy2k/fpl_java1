/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Slide_05_06_Demo_DuyetArrayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("n=");
        try {
            int n = Integer.parseInt(s.nextLine());
            ArrayList<Double> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.print("Số thực " + i + "=");
                list.add(Double.parseDouble(s.nextLine()));
            }
            System.out.println("Bạn đã nhập:");
            for (Double x : list) {
                System.out.print(x + "\t");
            }
            System.out.println("");
            double tong = 0;
            for (Double x : list) {
                tong += x;
            }
            System.out.println("Tổng = "+tong);
        } 
        catch (Exception e) {
        }
    }
}
