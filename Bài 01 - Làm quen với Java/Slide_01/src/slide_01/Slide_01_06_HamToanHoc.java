/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_01;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Slide_01_06_HamToanHoc {
    public static void main(String[] args) {
        //  Sinh số ngẫu nhiên từ 5 đến 12
        int rand = (int) (5 + Math.random() * 7);
        // Xuất căn bậc 2 của nó ra màn hình
        System.out.println("Số = " + rand);
        System.out.println("Căn bậc 2 = " + Math.sqrt(rand));
        
        double a,b;
        Scanner s = new Scanner(System.in);
        System.out.print("a = ");
        a = s.nextDouble();
        System.out.print("b = ");
        b = s.nextDouble();
        // Lũy thừa a mũ b
        System.out.println("a mũ b = " + Math.pow(a, b));
        // Giá trị nhỏ nhất
        System.out.println("Min(a, b) = " + Math.min(a, b));
    }
}
