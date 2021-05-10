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
public class Slide_08_09_LopObject {
    public static void main(String[] args) {
        // LỚP OBJECT
        // Khi định nghĩa một lớp mà không kế thừa từ một lớp khác thì mặc định 
        // kế thừa lớp Object
        // Như vậy mọi lớp đều có lớp cha chỉ duy nhất một lớp không có cha là Object
        
        // LỚP NỘI
        // Lớp nội là lớp được khai báo bên trong một lớp khác
        // Có hai loại: lớp nội tĩnh và lớp nội thông thường
        // Lớp bên trong chỉ có thể xác định trong phạm vi lớp ngoài cùng và có 
        // thể truy cập các thành viên của lớp bao nó
        // public class MyClass{
        //    static public class MyInnerStaticClass{}
        //    public class MyInnerClass{}
        // }
        // Sử dụng lớp nội
        // MyClass.MyInnerStaticClass x = new MyClass.MyInnerStaticClass();
        // MyClass.MyInnerClass y = new MyClass().new MyInnerClass();
    }
}
