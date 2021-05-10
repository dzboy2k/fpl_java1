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
public class Slide_03_13_ThuatToanSapXep {
    public static void main(String[] args) {
        // Arrays.sort(mảng) không thể thực hiện
        //      Sắp xếp giảm
        //      Các kiểu không so sánh được
        // Giải pháp: tự xây dựng thuật toán sắp xếp
        int a[] = {8,2,6,2,9,1,5};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
