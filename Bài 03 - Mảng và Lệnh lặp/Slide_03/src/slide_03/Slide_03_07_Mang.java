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
public class Slide_03_07_Mang {
    public static void main(String[] args) {
        // Mảng là cấu trúc lưu trữ nhiều phần tử có cùng kiểu dữ liệu
        // Để truy xuất các phần từ cần biết chỉ số (index).Chỉ số được đánh từ 0.
        
        // KHAI BÁO MẢNG
        // Khai báo không khởi tạo
        int[] a; // mảng số nguyên chưa biết số phần tử
        int b[];// mảng số nguyên chưa biết số phần tử
        String[] c = new String[5]; // mảng chứa 5 chuỗi    
        // Khai báo có khởi tạo
        double[] d1 = new double[]{2, 3, 4, 5, 6}; // mảng số thực, 5 phần tử, đã được khởi tạo
        double[] d2 = {2, 3, 4, 5, 6}; // mảng số thực, 5 phần tử, đã được khởi tạo
        
        // TRUY XUẤT CÁC PHẦN TỬ
        // Sử dụng chỉ số (index) để phân biệt các phần tử. Chỉ số mảng tính từ 0
        int a1[] = {4, 3, 5, 7};
        a1[2] = a1[1] * 4; // 45*4=180
        // Sau phép gán này mảng là {4, 3, 12, 7};
        // Sử dụng thuộc tính length để lấy số phần tử của mảng: a.length có giá trị là 9
    }
}
