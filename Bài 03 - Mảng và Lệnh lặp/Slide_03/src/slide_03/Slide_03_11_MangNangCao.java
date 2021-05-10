/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_03;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author dzboy
 */
public class Slide_03_11_MangNangCao {
    public static void main(String[] args) {
        int[] a = {9, 3, 8, 7, 3, 9, 4, 2};
        
        // Arrays.toString(a): chuyển mảng thành chuỗi được bọc giữ cặp dấu [] và
        // các phần tử cách nhau bởi dấu phẩy
        System.out.println("Mảng gốc: " + Arrays.toString(a));
        
        Arrays.sort(a); // Sắp xếp các phần tử theo thứ tự tăng dần
        System.out.println("Sau sort: " + Arrays.toString(a));
        
        // Tìm vị trí xuất hiện đầu tiên của một phần tử trong mảng
        int i = Arrays.binarySearch(a, 8);
        System.out.println("Vị trí của 8 là: " + i);
        
        Arrays.fill(a, 0); // Gán 1 giá trị cho tất cả các phần tử mảng
        System.out.println("Sau fill: " + Arrays.toString(a));
        
        // Chuyển một mảng sang List với kiểu tương ứng
        // List<Integer> b = Arrays.asList(a);
    }
}
