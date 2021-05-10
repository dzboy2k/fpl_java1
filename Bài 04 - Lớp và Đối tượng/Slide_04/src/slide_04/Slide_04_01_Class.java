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
public class Slide_04_01_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // KHÁI NIỆM VỀ ĐỐI TƯỢNG
        // Biểu diễn đối tượng trong thế giới thực, Mỗi đối tượng được đặc trưng 
        // bởi các thuộc tính và các hành vi riêng của nó
        
        // ĐỊNH NGHĨA LỚP
        // Lớp là một khuôn mẫu được sử dụng để mô tả các đối tượng cùng loại.
        // Lớp bao gồm các thuộc tính (trường dữ liệu) và các phương thức (hàm 
        // thành viên)
        
        // TÍNH TRỪU TƯỢNG (ABSTRACTION)
        //      Abstraction là công việc lựa chọn các thuộc tính và hành vi của  
        // thực thể vừa đủ để mô tả thực thể đó trong một bối cảnh cụ thể mà 
        // không phải liệt kê tất cả các thuộc tính, hành vi của thực thể có.
        //      Ví dụ: Mô tả một sinh viên ngành CNTT có rất nhiều thuộc tính và  
        // hành vi. Ở đây chúng ta chỉ sử dụng mã, họ và tên, điểm, ngành mà thôi, 
        // không cần thiết phải mô tả cao, nặng, hát, cười, nhảy cò cò…
        
        // TẠO ĐỐI TƯỢNG
        // Đoạn mã sau sử dụng lớp Employee để tạo một nhân viên sau đó gọi các 
        // phương thức của lớp.
        Employee emp = new Employee();
        emp.input();
        emp.ouput();
        
        // Chú ý:
        //      Toán tử new được sử dụng để tạo đối tượng
        //      Biến emp chứa tham chiếu tới đối tượng
        //      Sử dụng dấu chấm (.) để truy xuất các thành viên của lớp (trường 
        //      và phương thức).
    }
    
}
