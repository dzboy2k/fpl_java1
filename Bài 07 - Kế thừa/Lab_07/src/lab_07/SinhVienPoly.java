/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_07;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public abstract class SinhVienPoly {
    private String hoTen;
    private String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public SinhVienPoly() {
    }
    
    abstract public double getDiem();
    
    public String getHocLuc(){
        if(this.getDiem()<5) return "Yếu";
        else if(this.getDiem()<6.5) return "Trung bình";
        else if(this.getDiem()<7.5) return "Khá";
        else if(this.getDiem()<9) return "Giỏi";
        else return "Xuất sắc";
    }
    
    public void xuat(){
        System.out.printf("Họ tên: %s - Ngành: %s - Điểm: %.2f - Học lực: %s \n",this.hoTen,
                this.nganh,this.getDiem(),this.getHocLuc());
    }
}
