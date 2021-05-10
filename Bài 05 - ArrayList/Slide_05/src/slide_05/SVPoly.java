/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_05;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class SVPoly {
    private String hoTen;
    private double diemTB;

    public SVPoly(String hoTen, Double diemTB) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public SVPoly() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(Double diemTB) {
        this.diemTB = diemTB;
    }
    
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Họ tên: ");
        this.hoTen = s.nextLine();
        System.out.print("Điểm TB: ");
        this.diemTB = Double.parseDouble(s.nextLine());
    }
    
    public void xuat(){
        System.out.println("Họ tên: "+this.hoTen+" - Điểm TB: "+this.diemTB);
    }
}
