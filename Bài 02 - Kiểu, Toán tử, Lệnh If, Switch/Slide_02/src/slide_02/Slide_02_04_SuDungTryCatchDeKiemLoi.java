/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_02;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Slide_02_04_SuDungTryCatchDeKiemLoi {

    public static void main(String[] args) {
        // Sử dụng lệnh try…catch để kiểm soát các lỗi khi người dùng nhập không
        // phải số hoặc chuỗi s không phải là chuỗi chứa số
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            System.out.println("Bạn đã nhập đúng");
        } catch (Exception ex) {
            System.out.println("Vui lòng nhập số !");
        }
        
        // LỚP BAO KIỂU NGUYÊN THỦY (WRAPPER)
        //  Tương ứng với mỗi kiểu nguyên thủy Java định nghĩa một lớp bao để bao 
        // giá trị của kiểu nguyên thủy tương ứng gọi là lớp bao kiểu nguyên thủy
        //  Rất nhiều hàm trong Java chỉ làm việc với đối tượng mà không làm việc 
        // với kiểu nguyên thủy
        // Byte, Short, Integer, Long, Float, Double, Character, Boolean
    }
}
