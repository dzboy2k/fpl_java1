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
public class Lab02_Bai04_Menu {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner s = new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+---------------------------------------------------+");
        System.out.println("Chọn chức năng:");
        try {
            int chon = Integer.parseInt(s.nextLine());
            switch(chon){
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Bạn nhập sai");
        }
    }
    
    public static void giaiPTB1(){
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
    
    public static void giaiPTB2(){
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
    
    public static void tinhTienDien(){
        int soDien;
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Số điện: ");
            soDien = Integer.parseInt(s.nextLine());
            if(soDien<50){
                System.out.println("Tiền = "+soDien*1000);
            }
            else{
                System.out.println("Tiền = "+soDien*1200);
            }
        } catch (Exception e) {
            System.out.println("Bạn nhập sai");
        }
    }
}
