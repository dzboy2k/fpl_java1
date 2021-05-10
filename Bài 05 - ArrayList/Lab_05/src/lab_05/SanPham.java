/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_05;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class SanPham {
    private String ten;
    private double gia;

    public SanPham(String ten, Double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public SanPham() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }
    
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Tên sản phẩm: ");
        this.ten = s.nextLine();
        System.out.print("Giá: ");
        this.gia = Double.parseDouble(s.nextLine());
    }
    
    public void xuat(){
        System.out.println("Tên sản phẩm: "+this.ten+" - Giá: "+this.gia);
    }
}
