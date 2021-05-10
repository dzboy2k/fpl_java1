/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_06;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Slide_06_07_BieuThucChinhQuy {
    public static void main(String[] args) {
        // BIỂU THỨC CHÍNH QUI
        // Máy tính có thể nhận dạng như chúng ta nếu chúng ta cung cấp qui luật 
        // nhận dạng cho chúng. Biểu thức chính qui cung cấp qui luật nhận dạng 
        // chuỗi cho máy tính.
        // Biểu thức chính qui là một chuỗi mẫu được sử dụng để qui định dạng 
        // thức của các chuỗi. Nếu một chuỗi nào đó phù hợp với mẫu dạng thức 
        // thì chuỗi đó được gọi là so khớp (hay đối sánh).
        // Ví dụ: [0-9]{3,7}: Biểu thức chính qui này so khớp các chuỗi từ 3 đến 
        // 7 ký tự số.
        //    [0-9]: đại diện cho 1 ký tự số
        //    {3,7}: đại diện cho số lần xuất hiện (ít nhất 3 nhiều nhất 7)
        
        // VÍ DỤ: BIỂU THỨC CHÍNH QUI
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Số mobile: ");
        String mobile = scanner.nextLine(); 
        
        String pattern = "0[0-9]{9,10}"; // Biểu thức chính qui
        
        // Kiểm tra mobile có so khớp với pattern không?
        if(mobile.matches(pattern)){
            System.out.println("Bạn đã nhập đúng số mobile");
        }
        else{
            System.out.println("Bạn đã nhập không đúng số mobile");
        }
    }
}
