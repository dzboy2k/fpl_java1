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
public class Slide_01_05_HamNhap {
    public static void main(String[] args) {
        // NHẬP TỪ BÀN PHÍM
        // java.util.Scanner cho phép nhận dữ liệu từ bàn phím một cách đơn giản
        // Tạo đối tượng Scanner: Scanner scanner = new Scanner(System.in)
        // Các phương thức thường dùng:
        //      scanner.nextLine(): Nhận 1 dòng nhập từ bàn phím
        //      scanner.nextInt(): Nhận 1 số nguyên nhập từ bàn phím
        //      scanner.nextDouble(): Nhận 1 số thực nhập từ bàn phím
        
        String hoten;
        int tuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ tên: ");
        hoten = scanner.nextLine();
        System.out.print("Tuổi: ");
        tuoi = scanner.nextInt();
        System.out.printf("%s năm nay %d tuổi\n",hoten,tuoi);
    }
}
