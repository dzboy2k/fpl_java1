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
public class Slide_04_04_HamTao {
    public static void main(String[] args) {
        // Hàm tạo là một phương thức đặc biệt được sử dụng để tạo đối tượng.
        // Đặc điểm của hàm tạo:
        //      Tên trùng với tên lớp
        //      Không trả lại giá trị
        ChuNhat cn1 = new ChuNhat(20, 15);
        ChuNhat cn2 = new ChuNhat(50, 25);
        
        // Trong một lớp có thể định nghĩa nhiều hàm tạo khác tham số, mỗi hàm 
        // tạo cung cấp 1 cách tạo đối tượng.
        // Nếu không khai báo hàm tạo thì Java tự động cung cấp hàm tạo mặc định 
        // (không tham số)
        ChuNhat cn = new ChuNhat(20, 15);
        ChuNhat vu= new ChuNhat(30);
        
        // TỪ KHÓA THIS
        // this được sử dụng để đại diện cho đối tượng hiện tại.
        // this được sử dụng trong lớp để tham chiếu tới các thành viên của lớp 
        // (field và method)
        // Sử dụng this.field để phân biệt field với các biến cục bộ hoặc tham 
        // số của phương thức;
                // public class MyClass{
                //    int field;
                //    void method(int field){
                //        this.field = field; // this.field; => Trường, field -> Tham số
                //    }
                // }
    }
}
