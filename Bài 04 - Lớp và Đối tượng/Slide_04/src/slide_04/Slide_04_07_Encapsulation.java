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
public class Slide_04_07_Encapsulation {
    public static void main(String[] args) {
        // Encapsulation là tính che dấu trong hướng đối tượng.
        //      Nên che dấu các trường dữ liệu
        //      Sử dụng phương thức để truy xuất các trường dữ liệu
        // Mục đích của che dấu
        //      Bảo vệ dữ liệu
        //      Tăng cường khả năng mở rộng
        
        // NON-ENCAPSULATION
        // Giả sử định nghĩa lớp SinhVien và công khai hoTen và điểm như sau
        
        //                                  public class MyClass{
        //  public class SinhVien{              public static void main(String[] args){
        //      public String hoTen;                SinhVien sv = new SinhVien();
        //      public double diem;                 sv.hoTen = “Nguyễn Văn Tèo”;
        //  }                                       sv.diem = 20.5;
        //                                      }
        //                                  }
        
        // Khi sử dụng người dùng có thể gán dữ liệu cho các trường một cách tùy tiện
        // Điều gì sẽ xảy ra nếu điểm hợp lệ chỉ từ 0 đến 10
        
        
        // ENCAPSULATION
        // Để che dấu thông tin, sử dụng private cho các trường dữ liệu.
        //      private double diem;
        // Bổ sung các phương thức getter và setter để đọc ghi các trường đã che dấu:
        //      public void setDiem(double diem){
        //          this.diem = diem;
        //      }
        //      public String getDiem(){
        //          return this.diem;
        //      }
        
        SinhVien sv = new SinhVien();
        sv.setHoTen("Nguyễn Văn Tèo");
        sv.setDiem(20);
        
        // QUI TẮC ĐẶT TÊN TRONG JAVA
        // Tên (class, field, method, package, interface, variable) được đặt theo 
        // qui ước (mềm) như sau:
        // Tên package: toàn bộ ký tự thường và dấu chấm: 
        //      java.util, com.poly
        // Tên class, interface: Các từ phải viết hoa ký tự đầu
        //      class Employee{}, class SinhVien{}, class HinhChuNhat()
        // Tên field, method, variable: Các từ phải viết hoa ký tự đầu ngoại trừ 
        // từ đầu tiên phải viêt thường
        //      hoTen, diem, fullName, mark
        //      setHoTen(), input(), setDiem()
        
        // Tên class, field và variable sử dụng danh từ
        // Tên phương thức sử dụng động từ
    }
}
