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
public class Slide_07_05_LopTruuTuong {
    public static void main(String[] args) {
        // Lớp trừu tượng là lớp có các hành vi chưa được xác định rõ
        //        Ví dụ 1: Đã là hình thì chắc chắn là có diện tích và chu
        //        vi nhưng chưa xác định được cách tính mà phải là một
        //        hình cụ thể như chữ nhật, tròn, tam giác… mới có thể
        //        xác định cách tính
        //        Ví dụ 2: Sinh viên thì chắc chắn có điểm trung bình
        //        nhưng chưa xác định được cách tính như thế nào mà
        //        phải là sinh viên của ngành nào mới biết được môn
        //        học và công thức tính điểm cụ thể.
        // Vậy lớp hình và lớp sinh viên là các lớp trừu tượng vì phương thức 
        // tính chu vi, diện tích và tính điểm chưa thực hiện được
        
        // ĐỊNH NGHĨA LỚP TRỪU TƢỢNG
        // Từ khóa abstract được sử dụng để định nghĩa lớp và phương thức trừu tượng
        // Phương thức trừu tượng là phương thức không có phần thân xử lý và được 
        // khai báo bằng từ khóa abstract.
        // Lớp chứa phương thức trừu tượng thì lớp đó phải là lớp trừu tượng.
        // Trong lớp trừu tượng có thể định nghĩa các phương thức cụ thể hoặc khai 
        // báo các trường
        // Không thể sử dụng new để tạo đối tượng từ lớp trừu tượng
        
        // Sử dụng từ khóa abstract để định nghĩa lớp và phương thức trừu tượng
        
        //        abstract public class MyClass{
        //            abstract public type MyMethod();
        //        }
        
        //        abstract public class SinhVien{
        //            abstract public double getDiemTB();
        //        }

        //        abstract public class Hinh{
        //            abstract public double getChuVi();
        //            abstract public double getDienTich();
        //        }
    }
}
