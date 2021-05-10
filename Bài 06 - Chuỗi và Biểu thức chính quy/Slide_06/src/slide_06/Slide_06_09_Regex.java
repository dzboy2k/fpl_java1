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
public class Slide_06_09_Regex {
    public static void main(String[] args) {
        // Số CMND
        //     [0-9]{9}
        // Số điện thoại di động việt nam
        //     0\d{9,10}
        // Số xe máy sài gòn
        //     5\d-[A-Z]\d-((\d{4})|(\d{3}\.\d{2}))
        // Địa chỉ email
        //     \w+@\w+(\.\w){1,2}
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Email: ");
        String email = in.nextLine();
        
        System.out.print("Số điện thoại Huế: ");
        String phone = in.nextLine();
        
        String reEmail = "\\w+@\\w+\\.\\w+"; 
        if(!email.matches(reEmail)){
            System.out.println("Không đúng dạng email");
        }
        
        String rePhone = "0543\\d{6}";
        if(!phone.matches(rePhone)){
            System.out.println("Không phải số điện thoại ở Huế !");
        }
    }
}
