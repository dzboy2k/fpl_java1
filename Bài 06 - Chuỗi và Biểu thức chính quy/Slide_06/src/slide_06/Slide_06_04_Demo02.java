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
public class Slide_06_04_Demo02 {
    public static void main(String[] args) {
        // Quản lý sinh viên
        //      Nhập mảng họ tên sinh viên
        //      Xuất họ và tên (IN HOA) những sinh viên tên Tuấn hoặc họ Nguyễn
        //      Xuất tên những sinh viên có tên lót là Mỹ
        
        // Thực hiện
        //    fullname.toUpperCase(): đổi IN HOA
        //    fullname.startsWith(“Nguyễn ”): họ Nguyễn
        //    fullname.endsWith(“ Tuấn”): tên Tuấn
        //    fullname.contains(“ Mỹ ”): lót Mỹ
        //    fullname.lastIndexOf(“ ”): Lấy vị trí trắng cuối cùng
        //    fullname.substring(lastIndex + 1): Lấy tên
        
        Scanner s = new Scanner(System.in);
        System.out.print("n=");
        int n=Integer.parseInt(s.nextLine());
        String[] fullname = new String[n];
        // Nhập mảng họ tên sinh viên
        for (int i = 0; i < fullname.length; i++) {
            System.out.println("Sinh viên "+i);
            System.out.print("Họ tên: ");
            fullname[i] = s.nextLine();
        }
        
        System.out.println("Sinh viên có tên Tuan hoặc họ Nguyen:");
        for (String x : fullname) {
            // Xuất họ và tên (IN HOA) những sinh viên tên Tuấn hoặc họ Nguyễn
            if(x.startsWith("Nguyen ") || x.endsWith(" Tuan"))
                System.out.println(x.toUpperCase());
        }
        
        // Xuất tên những sinh viên có tên lót là Mỹ
        System.out.println("Tên sinh viên có tên lót là My:");
        for (String x : fullname) {
            if(x.contains(" My ")){
                int lastIndex = x.lastIndexOf(" ");
                System.out.println(x.substring(lastIndex+1));
            }
        }
    }
}
