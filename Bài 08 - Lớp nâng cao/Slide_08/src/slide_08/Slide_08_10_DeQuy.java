/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_08;

/**
 *
 * @author dzboy
 */
public class Slide_08_10_DeQuy {

    public static void main(String[] args) {
        // ĐỆ QUY
        // Một phương thức gọi chính nó
        // Phải có lệnh dừng đệ quy trong phương thức để tránh vòng lặp vô hạn
        // Đệ qui dễ hiểu nhưng rất tốn tài nguyên

    }

    public void sort(int[] a, int i) {
        if (i >= a.length) {
            return;
        }
        for (int j = i + 1; j < a.length; j++) {
            if (a[i] < a[j]) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        sort(a, i + 1);
    }
}
