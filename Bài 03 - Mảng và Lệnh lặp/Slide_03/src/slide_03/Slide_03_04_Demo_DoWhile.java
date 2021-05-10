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
public class Slide_03_04_Demo_DoWhile {
    public static void main(String[] args) {
        // Nhập điểm từ 0 đến 10
        Scanner s = new Scanner(System.in);
        try {
            double diem;
            do {                
                System.out.println("Điểm: ");
                diem = s.nextDouble();
            } while (diem<0 || diem>10);
        } 
        catch (Exception e) {
            System.out.println("Bạn nhập kí tự");
        }
    }
}
