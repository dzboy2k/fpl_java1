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
public class Slide_03_06_Break {

    public static void main(String[] args) {
        // break dùng để ngắt lệnh lặp
        // continue dùng để thực hiện lần lặp tiếp theo ngay lặp tức

        Scanner scanner = new Scanner(System.in);
        int diem = 0;
        while (true) {
            diem = scanner.nextInt();
            if (diem >= 0 && diem <= 10) {
                break;
            }
            System.out.println("Điểm phải từ 0 đến 10");
        }

    }
}
