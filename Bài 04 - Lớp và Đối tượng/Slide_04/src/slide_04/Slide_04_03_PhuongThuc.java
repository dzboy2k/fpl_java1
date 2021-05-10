/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_04;

/**
 *
 * @author dzboy
 */
public class Slide_04_03_PhuongThuc {
    public static void main(String[] args) {
        // ĐỊNH NGHĨA PHƯƠNG THỨC
        // Phương thức là một mô-đun mã thực hiện một công việc cụ thể nào đó
        //      + Trong lớp Employee có 2 phương thức là input() và output()
        // Phương thức có thể có một hoặc nhiều tham số
        // Phương thức có thể có kiểu trả về hoặc void (không trả về gì cả)
        // Cú pháp:
        // <<kiểu trả về>> <<tên phương thức>> ([danh sách tham số])
        // {
            // thân phương thức
        // }
        
        // NẠP CHỒNG PHƯƠNG THỨC (OVERLOADING)
        // Trong một lớp có thể có nhiều phương thức cùng tên nhưng khác nhau về 
        // tham số (kiểu, số lượng và thứ tự)
            // public class MyClass{
                // void method(){…}
                // void method(int x){…}
                // void method(float x){…}
                // void method(int x, double y){…}
            // }
        // Trong lớp MyClass có 4 phương thức cùng tên là method nhưng khác nhau 
        // về tham số
        
        // VÍ DỤ NẠP CHỒNG PHƯƠNG THỨC
        MayTinh mt = new MayTinh();
        int t1 = mt.tong(5, 7);
        int t2 = mt.tong(5, 7, 9); 
        // Với lớp trên, bạn có thể sử dụng để tính tổng 2 hoặc 3 số nguyên.
    }
}
