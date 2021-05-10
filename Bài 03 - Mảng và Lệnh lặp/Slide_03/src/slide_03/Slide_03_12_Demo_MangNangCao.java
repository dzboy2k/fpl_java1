/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_03;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Slide_03_12_Demo_MangNangCao {
    public static void main(String[] args) {
        // Nhập mảng 5 SV và xuất tăng dần theo alphabet
        String[] arrSV = new String[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arrSV.length; i++) {
            System.out.print("Tên SV"+i+": ");
            arrSV[i] = s.nextLine();
        }
        Arrays.sort(arrSV);
        System.out.println(Arrays.toString(arrSV));
    }
}
