/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_05;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author dzboy
 */
public class Slide_05_09_ThaoTacArrayListNangCao {

    public static void main(String[] args) {
        // Lớp tiện ích Collections cung cấp các hàm tiện ích hỗ trợ việc xử 
        // lý ArrayList

        // int binarySearch (List list, Object key) ==> Tìm kiếm theo thuật toán chia đôi
        // void fill (List list, Object value) ==> Gán giá trị cho tất cả phần tử
        // void shuffle (List list) ==> Hoán vị ngẫu nhiên
        // void sort (List list) ==> Sắp xếp tăng dần
        // void reverse (List list) ==> Đảo ngược
        // void rotate (List list, int distance) ==> Xoay vòng
        // void swap(List list, int i, int j) ==> Tráo đổi
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(3);
        a.add(9);
        a.add(8);
        a.add(2);
        // [3, 9, 8, 2]
        
        Collections.swap(a, 0, 2);  // [8, 9, 3, 2]
        Collections.shuffle(a);     // [X, X, X, X]
        Collections.sort(a);        // [2, 3, 8, 9]
        Collections.reverse(a);     // [9, 8, 3, 2]
    }
}
