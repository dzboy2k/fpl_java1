/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_03;

/**
 *
 * @author dzboy
 */
public class Slide_03_09_TongSoChan {
    public static void main(String[] args) {
        // Ví dụ sau tính tổng các số chẵn của mảng.
        //      + Lấy từng phần tử từ mảng với for-each
        //      + Nếu là số chẵn thì cộng vào tổng
        
        int[] a = {9, 3, 8, 7, 3, 9, 4, 2};
        
        double tong = 0;
        for (int x : a) {
            if (x % 2 == 0) {
                tong += x;
            }
        }
        
        System.out.println("Tổng: " + tong);
    }
}
