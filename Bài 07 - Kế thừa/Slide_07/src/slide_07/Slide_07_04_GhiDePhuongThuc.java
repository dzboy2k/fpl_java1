/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_07;

/**
 *
 * @author dzboy
 */
public class Slide_07_04_GhiDePhuongThuc {
    public static void main(String[] args) {
        // Overriding là trường hợp lớp con và lớp cha có phương thức cùng cú pháp.
        //      public class Parent{         public class Child{
        //      public void method(){…}          public void method(){…}
        //      }                            }
        
        // Lớp Parent và Child đều có phương thức method() cùng cú pháp nên method() 
        // trong Child sẽ đè lên method() trong Parent
        //      Parent o = new Child();
        //      o.method()
        // Mặc dù o có kiểu là Parent nhưng o.method() thì method() của lớp Child sẽ 
        // chạy do bị đè
        
        // VẤN ĐỀ CỦA GHI ĐÈ
        // Lớp con ghi đè phương thức của lớp cha thì sẽ che dấu phương thức của lớp cha
        // Mục đích của ghi đè là để sửa lại phương thức của lớp cha trong lớp con
        // Sử dụng từ khóa super để truy cập đến phương thức đã bị ghi đè của lớp cha.
        // Đặc tả truy xuất của phương thức lớp con phải có độ công khai bằng hoặc hơn 
        // đặc tả truy xuất của phương thức lớp cha.
    }
}
