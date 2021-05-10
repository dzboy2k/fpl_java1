/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_06;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class SinhVien {
    private String hoTen;
    private String email;
    private String soDT;
    private String soCMND;

    public SinhVien(String hoTen, String email, String soDT, String soCMND) {
        this.hoTen = hoTen;
        this.email = email;
        this.soDT = soDT;
        this.soCMND = soCMND;
    }

    public SinhVien() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }
    
    public void nhap(){
        Scanner s = new Scanner(System.in);
        String reHoTen = "[a-zA-Z ]+";
        String reEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        String reSoDT = "0\\d{9}";
        String reSoCMND = "\\d{12}";
        System.out.print("Họ tên: ");
        this.hoTen = s.nextLine();
        while (!this.hoTen.matches(reHoTen)) {            
            System.out.print("Họ tên không đúng định dạng, mời nhập lại: ");
            this.hoTen = s.nextLine();
        }
        System.out.print("Email: ");
        this.email = s.nextLine();
        while (!this.email.matches(reEmail)) {            
            System.out.print("Email không đúng định dạng, mời nhập lại: ");
            this.email = s.nextLine();
        }
        System.out.print("Điện thoại: ");
        this.soDT = s.nextLine();
        while (!this.soDT.matches(reSoDT)) {            
            System.out.print("Điện thoại không đúng định dạng, mời nhập lại: ");
            this.soDT = s.nextLine();
        }
        System.out.print("Số CMND: ");
        this.soCMND = s.nextLine();
        while (!this.soCMND.matches(reSoCMND)) {            
            System.out.print("Số CMND không đúng định dạng, mời nhập lại: ");
            this.soCMND = s.nextLine();
        }
    }
    
    public void xuat(){
        System.out.println("Họ tên: "+this.hoTen+" - Email: "+this.email
                +" - Điện thoại: "+this.soDT+" - Số CMND: "+this.soCMND);
    }
}
