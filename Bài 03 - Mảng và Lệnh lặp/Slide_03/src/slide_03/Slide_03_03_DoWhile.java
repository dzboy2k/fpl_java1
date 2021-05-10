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
public class Slide_03_03_DoWhile {

    public static void main(String[] args) {
        // Cú pháp:
        // do {
            // công việc
        // }
        // while (<<điều kiện>>);

        // Tương tự lệnh lặp while chỉ khác ở chỗ điều kiện được kiểm tra sau, 
        // nghĩa là công việc được thực hiện ít nhất 1 lần.
        
        Scanner scanner = new Scanner(System.in);
        int so = -1;
        do {
            so = scanner.nextInt();
        } while (so < 0);
        // Đoạn mã trên chỉ cho phép nhập số nguyên dương từ bàn phím. 
    }
}
