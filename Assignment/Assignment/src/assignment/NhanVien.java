/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public abstract class NhanVien {
    private String maNV;
    private String hoTen;
    private double luong;

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public NhanVien() {
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    abstract public double getThuNhap();
    
    public double getThueTN(){
        if(this.luong<9000000) return 0;
        else if(this.luong<15000000) return this.luong*0.1;
        else return this.luong*0.12;
    }
    
    public void nhapThongTin(){
        Scanner s = new Scanner(System.in);
        System.out.print("Mã nhân viên: ");
        this.maNV = s.nextLine();
        System.out.print("Họ tên: ");
        this.hoTen = s.nextLine();
        System.out.print("Lương: ");
        this.luong = Double.parseDouble(s.nextLine());
    }
    
    public void xuatThongTin(){
        System.out.printf("Mã nhân viên:%s - Tên nhân viên: %s - Lương: %.0f - "
                + "Thuế thu nhập: %.0f - ",this.maNV, this.hoTen, this.luong, 
                this.getThueTN());
    }
}
