/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_05;

import java.util.ArrayList;

/**
 *
 * @author dzboy
 */
public class Slide_05_03_ThaoTacArrayList {
    public static void main(String[] args) {
        // THAO TÁC THƯỜNG DÙNG
        // boolean add(Object) ==> Thêm vào cuối
        // void add(int index, Object elem) ==> Chèn thêm phần tử vào vị trí
        // boolean remove(Object)  ==> Xóa phần tử
        // Object remove(int index) ==> Xóa và nhận phần tử tại vị trí
        // void clear() ==> Xóa sạch
        // Object set(int index, Object elem) ==> Thay đổi phần tử tại vị trí
        // Object get(int index) ==> Truy xuất phần tử tại vị trí
        // int size() ==> Số phần tử
        // boolean contains(Object) ==> Kiểm tra sự tồn tại
        // boolean isEmpty() ==> Kiểm tra rỗng
        // int indexOf(Object elem)  ==> Tìm vị trí phần tử
        
        ArrayList<String> a = new ArrayList<String>();
        a.add("Cường");     // [Cường]
        a.add("Tuấn");      // [Cường, Tuấn]
        a.add("Phương");    // [Cường, Tuấn, Phương]
        a.add("Hồng");      // [Cường, Tuấn, Phương, Hồng]
        a.add(1, "Hạnh");   // [Cường, Hạnh, Tuấn, Phương, Hồng]
        a.set(0, "Tèo");    // [Tèo, Hạnh, Tuấn, Phương, Hồng]
        a.remove(3);        // [Tèo, Hạnh, Tuấn, Hồng]
    }
}
