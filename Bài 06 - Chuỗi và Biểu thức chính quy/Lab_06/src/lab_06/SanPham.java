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
public class SanPham {
    private String tenSP;
    private double donGia;
    private String hang;

    public SanPham(String tenSP, double donGia, String hang) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.hang = hang;
    }

    public SanPham() {
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Tên sản phẩm: ");
        this.tenSP = s.nextLine();
        System.out.print("Đơn giá: ");
        this.donGia = Double.parseDouble(s.nextLine());
        System.out.print("Hãng: ");
        this.hang = s.nextLine();
    }
    
    public void xuat(){
        System.out.println("Tên sản phẩm: "+this.tenSP+" - Đơn giá: "+this.donGia
                +" - Hãng: "+this.hang);
    }
  
}
