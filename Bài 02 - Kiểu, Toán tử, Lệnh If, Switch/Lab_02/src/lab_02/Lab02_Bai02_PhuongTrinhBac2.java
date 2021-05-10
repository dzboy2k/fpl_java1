/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_02;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Lab02_Bai02_PhuongTrinhBac2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("a=");
            int a = Integer.parseInt(s.nextLine());
            System.out.print("b=");
            int b = Integer.parseInt(s.nextLine());
            System.out.print("c=");
            int c = Integer.parseInt(s.nextLine());
            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        System.out.println("Phương trình vô số nghiệm");
                    } else {
                        System.out.println("Phương trình vô nghiệm");
                    }
                } else {
                    System.out.println("Phương trình có nghiệm x = " + (-c*1.0/b));
                }
            }
            else {
                double delta = Math.pow(b, 2) - 4*a*c;
                if (delta<0) {
                    System.out.println("Phương trình vô nghiệm");
                }
                else if(delta == 0){
                    System.out.println("Phương trình có nghiệm kép x = "+(-b*1.0/(2*a)));
                }
                else{
                    System.out.println("Phương trình có 2 nghiệm phân biệt");
                    System.out.println("x1 = " +  ((-b+Math.sqrt(delta)))/(2*a));
                    System.out.println("x2 = " +  ((-b-Math.sqrt(delta)))/(2*a));
                }
            }
            
        } catch (Exception e) {
            System.out.println("Bạn nhập sai");
        }
    }
}
