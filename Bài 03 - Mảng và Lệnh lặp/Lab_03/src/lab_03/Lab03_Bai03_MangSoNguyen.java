/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_03;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Lab03_Bai03_MangSoNguyen {
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
            // Sắp xếp và xuất mảng
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            
            // Tìm min
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {  
                min = Math.min(min, arr[i]);
            }
            System.out.println("Phần tử nhỏ nhất: "+min);
            
            // Trung bình cộng các phần tử chia hết cho 3
            int tong=0, dem=0;
            for (int x : arr) {
                if(x%3==0){
                    tong+=x;
                    dem++;
                }
            }
            System.out.println("Trung bình cộng các phần tử chia hết cho 3: "+(tong*1.0/dem));
            
        } catch (Exception e) {
            System.out.println("Bạn nhập sai n");
        }
    }
}
