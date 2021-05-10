/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_02;

/**
 *
 * @author dzboy
 */
public class Slide_02_05_Boxing_UnBoxing {
    public static void main(String[] args) {
        // Boxing là việc tạo đối tượng từ lớp bao để bọc giá trị nguyên thủy.
        // Có 3 cách để bao giá trị nguyên thủy sau
        Integer a1 = Integer.valueOf(5); // bao tường minh
        Integer a2 = new Integer(5); // bao tường minh
        Integer a3 = 5; // bao ngầm định
        
        // Unboxing là việc mở lấy giá trị nguyên thủy từ đối tượng của lớp bao
        // Có 2 cách mở bao để lấy giá trị nguyên thủy sau
        int b1 = a1.intValue(); // mở bao tường minh
        int b2 = a1; // mở bao ngầm định
    }
}
