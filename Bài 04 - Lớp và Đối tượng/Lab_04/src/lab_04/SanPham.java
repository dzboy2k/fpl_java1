/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_04;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
    }

    public SanPham() {
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    private double getThueNhapKhau(){
        return donGia*0.1;
    }
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Tên sản phẩm: ");
        this.tenSp = s.nextLine();
        System.out.print("Đơn giá: ");
        this.donGia = Double.parseDouble(s.nextLine());
        System.out.print("Giảm giá: ");
        this.giamGia = Double.parseDouble(s.nextLine());
    }
    public void xuat(){
        System.out.println("Tên sản phẩm: "+this.tenSp+"\nĐơn giá: "+this.donGia
            +"\nGiảm giá: "+this.giamGia+"\nThuế nhập khẩu: "+this.getThueNhapKhau());
    }
}
