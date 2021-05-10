/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_06;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Slide_06_03_Demo01 {

    public static void main(String[] args) {
        // Đăng nhập hợp lệ khi mã tài khoản là “hello” và mật khẩu trên 6 ký tự
        Scanner s = new Scanner(System.in);
        // Nhập username và password từ bàn phím
        System.out.print("username: ");
        String username = s.nextLine();
        System.out.print("password: ");
        String password = s.nextLine();
        // Sử dụng equalsIgnoreCase() để so sánh username và length() để lấy độ 
        // dài mật khẩu
        if (username.equalsIgnoreCase("hello") && password.length() > 6) {
            System.out.println("Đăng nhập hợp lệ");
        } else {
            System.out.println("Đăng nhập không hợp lệ");
        }
    }
}
