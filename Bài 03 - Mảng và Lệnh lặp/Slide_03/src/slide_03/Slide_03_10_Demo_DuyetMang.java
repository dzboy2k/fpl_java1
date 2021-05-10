/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_03;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Slide_03_10_Demo_DuyetMang {
    public static void main(String[] args) {
        System.out.print("n=");
        Scanner s = new Scanner(System.in);
        try {
            int n = Integer.parseInt(s.nextLine());
            int[] arr = new int[n];
            // Nhập mảng
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random()*100);
            }
            // Xuất mảng
            System.out.println("Bạn đã nhập:");
            for (int x : arr) {
                System.out.print(x+"\t");
            }
            System.out.println("");
            // Tính và xuất trung bình cộng
            int tong=0;
            for (int x : arr) {
                tong+=x;
            }
            System.out.println("Trung bình cộng các phàn tử: "+(tong/arr.length));
            // Xuất lập phương các phần tử
            System.out.println("Lập phương các phần tử: ");
            for (int x : arr) {
                System.out.print(Math.pow(x,3)+"\t");
            }
            System.out.println("");
            
        } catch (Exception e) {
            System.out.println("Bạn nhập sai n");
        }
    }
}
