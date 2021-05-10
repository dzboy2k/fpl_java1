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
public class Slide_06_10_Validation {
    public static void main(String[] args) {
        // Nhập thông tin nhân viên từ bàn phím. Thông tin của mỗi nhân viên phải 
        // tuân theo các ràng buộc sau. Xuất thông báo lỗi và yêu cầu nhập lại
        // Mã sinh viên ==> 5 ký tự hoa ==> [A-Z]{5}
        // Mật khẩu ==> Ít nhất 6 ký tự ==> .{6,}
        // Họ và tên  ==> Chỉ dùng alphabet và ký tự trắng ==> [a-zA-Z ]+
        // Email ==> Đúng dạng email ==> \w+@\w+(\.\w+){1,2}
        // Điện thoại ==> Điện thoại Sài gòn  ==> 083\d{7}
        // Số xe máy ==> Số xe máy Sài gòn ==> 5\d-[A-Z]-((\d{4})|(\d{3}\.\d{2}))
        // Số CMND ==> 10 chữ số ==> \d{10}
        // Website ==> Địa chỉ website ==> http://www\.\w+\.\w{2,4}
        
        Scanner s = new Scanner(System.in); 
        
        // Mã sinh viên
        System.out.print("Mã sinh viên: ");
        String maSinhVien = s.nextLine();
        String reMaSinhVien = "[A-Z]{5}";
        while (!maSinhVien.matches(reMaSinhVien)) {            
            System.out.print("Mã sinh viên phải có 5 ký tự hoa, mời bạn nhập lại: ");
            maSinhVien = s.nextLine();
        }
        
        // Mật khẩu
        System.out.print("Mật khẩu: ");
        String matKhau = s.nextLine();
        String reMatKhau = ".{6,}";
        while (!matKhau.matches(reMatKhau)) {            
            System.out.print("Mật khẩu phải có ít nhất 6 ký tự, mời bạn nhập lại: ");
            matKhau = s.nextLine();
        }
        
        // Họ và tên
        System.out.print("Họ và tên: ");
        String hoTen = s.nextLine();
        String reHoTen = "[a-zA-Z ]+";
        while (!hoTen.matches(reHoTen)) {            
            System.out.print("Họ và tên chỉ dùng alphabet và ký tự trắng, mời bạn "
                    + "nhập lại: ");
            hoTen = s.nextLine();
        }
        
        // Email
        System.out.print("Email: ");
        String email = s.nextLine();
        String reEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        while (!email.matches(reEmail)) {            
            System.out.print("Email không đúng định dạng, mời bạn nhập lại: ");
            email = s.nextLine();
        }
        
        // Điện thoại
        System.out.print("Điện thoại: ");
        String phone = s.nextLine();
        String rePhone = "083\\d{7}";
        while (!phone.matches(rePhone)) {            
            System.out.print("Điện thoại không đúng định dạng, mời bạn nhập lại: ");
            phone = s.nextLine();
        }
        
        // Số xe máy
        System.out.print("Số xe máy: ");
        String soXeMay = s.nextLine();
        String reSoXeMay = "5\\d-[A-Z]-((\\d{4})|(\\d{3}\\.\\d{2}))";
        while (!soXeMay.matches(reSoXeMay)) {            
            System.out.print("Số xe máy không đúng định dạng, mời bạn nhập lại: ");
            soXeMay = s.nextLine();
        }
        
        // Số CMND
        System.out.print("Số CMND: ");
        String soCMND = s.nextLine();
        String reSoCMND = "\\d{10}";
        while (!soCMND.matches(reSoCMND)) {            
            System.out.print("Số CMND phải có 10 chữ số, mời bạn nhập lại: ");
            soCMND = s.nextLine();
        }
        
        // Website
        System.out.print("Website: ");
        String website = s.nextLine();
        String reWebsite = "http://www\\.\\w+\\.\\w{2,4}";
        while (!website.matches(reWebsite)) {            
            System.out.print("Website không đúng định dạng, mời bạn nhập lại: ");
            website = s.nextLine();
        }
    }
}
