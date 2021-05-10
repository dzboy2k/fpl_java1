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
public class Lab02_Bai01_PhuongTrinhBac1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("a=");
            int a = Integer.parseInt(s.nextLine());
            System.out.print("b=");
            int b = Integer.parseInt(s.nextLine());
            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.println("Phương trình có nghiệm x = " + (-b*1.0/a));
            }
        } catch (Exception e) {
            System.out.println("Bạn nhập sai");
        }
    }

}
