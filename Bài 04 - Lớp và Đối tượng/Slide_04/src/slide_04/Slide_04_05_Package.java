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
public class Slide_04_05_Package {
    public static void main(String[] args) {
        // PACKAGE
        // Package được sử dụng để chia các class và interface thành từng gói 
        // khác nhau. Việc làm này tương tự quản lý file trên ổ đĩa trong đó
        // class (file) và package (folder) 
        // Ví dụ sau tạo lớp MyClass thuộc gói com.poly
        //      package com.poly;
        //      public class MyClass{…}
        // Trong Java có rất nhiều gói được phân theo chức năng:
        //      java.util: chứa các lớp tiện ích
        //      java.io: chứa các lớp vào/ra dữ liệu
        //      java.lang: chứa các lớp thường dùng…
        
        // IMPORT PACKAGE
        // Lệnh import được sử dụng để chỉ ra lớp đã được định nghĩa trong một 
        // package
        // Các lớp trong gói java.lang và các lớp cùng định nghĩa trong cùng 
        // một gói với lớp sử dụng sẽ được import ngầm định:
        //        package com.polyhcm;
        //        import com.poly.MyClass;
        //        import java.util.Scanner;
        //        public class HelloWorld{
        //            public static void main(String[] args){
        //                MyClass obj = new MyClass();
        //                Scanner scanner = new Scanner(System.in);
        //            }
        //        }
    }
}
