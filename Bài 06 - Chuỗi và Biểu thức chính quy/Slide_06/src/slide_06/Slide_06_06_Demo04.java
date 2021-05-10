/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_06;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Slide_06_06_Demo04 {

    public static void main(String[] args) {
        // Nhập chuỗi chứa dãy số phân cách bởi dấu phẩy và xuất các số chẵn
        Scanner s = new Scanner(System.in);
        System.out.print("n=");
        int n = Integer.parseInt(s.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50);
        }
        String chuoi = Arrays.toString(arr);
        System.out.println(chuoi);
        
        // Sử dụng split() để tách chuỗi thành mảng bởi ký tự phân cách là dấu phẩy
        String[] daySo = chuoi.substring(1, chuoi.length()-1).split(", ");
        
        // Duyệt mảng, đổi sang số nguyên và kiểm tra số chẵn
        System.out.print("Các số chắn: ");
        for (String so : daySo) {
            int x = Integer.parseInt(so);
            if (x % 2 == 0) {
                //Số chẵn
                System.out.print(x+"; ");
            }
        }
        System.out.println("");
    }
}
