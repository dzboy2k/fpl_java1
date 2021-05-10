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
public class Slide_08_06_Static {
    public static void main(String[] args) {
        // Từ khóa static được sử dụng để định nghĩa cho khối và các thành viên 
        // tĩnh (lớp nội, phƣơng thức, trƣờng).
        // Khối static {} sẽ chạy trƣớc khi tạo đối tượng hoặc truy xuất bất kỳ 
        // thành viên tĩnh khác
        // Thành viên tĩnh của lớp được sử dụng độc lập với các đối tượng được 
        // tạo ra từ lớp đó
        // Có thể truy cập đến một thành viên tĩnh thông qua tên lớp mà không 
        // cần tham chiếu đến một đối tượng cụ thể
        // Trường static là dữ liệu dùng chung cho tất cả các đối tượng được tạo 
        // ra từ lớp đó.
        // Trong khối và phương thức tĩnh chỉ đƣợc truy cập đến các thành viên 
        // tĩnh khác mà không được phép truy cập đến thành viên thông thường của 
        // class
        
        // public class MyClass{
        //    static public int X;
        //    static{
        //        X+=100;
        //    }
        //    static public void method(){
        //        X+=200;
        //    }
        //    static class MyInnerClass{}
        // }
        
        // MyClass.X = 700;
        // MyClass.method()
    }
}
