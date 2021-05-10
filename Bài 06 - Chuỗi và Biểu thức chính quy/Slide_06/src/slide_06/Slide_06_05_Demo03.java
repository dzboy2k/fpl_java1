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
public class Slide_06_05_Demo03 {
    public static void main(String[] args) {
        // Tìm kiếm và thay thế chuỗi
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập chuỗi nội dung: ");
        String content = s.nextLine();
        System.out.println("Nhập chuỗi tìm kiếm: ");
        String find = s.nextLine();
        System.out.println("Nhập chuỗi thay thế: ");
        String replace = s.nextLine();    
        
        // Thực hiện tìm và thay thế
        String result = content.replaceAll(find, replace);
        System.out.println(result);
    }
}
