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
public class Lab01_Bai04_Delta {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập hệ số cho pt bậc 2");
        System.out.print("a=");
        a = s.nextInt();
        System.out.print("b=");
        b = s.nextInt();
        System.out.print("c=");
        c = s.nextInt();
        double Delta = Math.pow(b,2) - 4*a*c;
        System.out.println("Căn Delta = "+Delta);
    }
}
