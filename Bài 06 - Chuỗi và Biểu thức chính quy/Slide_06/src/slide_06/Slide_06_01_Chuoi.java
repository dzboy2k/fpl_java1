/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_06;

/**
 *
 * @author dzboy
 */
public class Slide_06_01_Chuoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // CHUỖI (STRING)
        // String là xâu các ký tự. 
        //      String s = “Hello World”;
        // String là một class được xây dựng sẵn trong Java. String có rất nhiều 
        // phương thức giúp xử lý chuỗi một cách thuận tiện và hiệu quả.
        // String là kiểu dữ liệu được sử dụng nhiều nhất trong lập trình
        
        // KÝ TỰ ĐẶC BIỆT
        // \t ==> Ký tự tab
        // \r ==> Về đầu dòng
        // \n ==> Xuống dòng
        // \\ ==> \
        // \” ==> “
        System.out.println("\t+ Họ và tên: Tuấn\r\n\t+ Tuổi: 40");
        
        // THAO TÁC CHUỖI: So sánh, Tìm vị trí của chuỗi con ,Lấy chuỗi con, Tách 
        // và hợp chuỗi, Chuyển đổi hoa thường, Lấy độ dài
        String fullname = "Nguyễn Văn Tèo"; // Nguyễn
        String first = fullname.substring(0, 6);
    }
    
}
