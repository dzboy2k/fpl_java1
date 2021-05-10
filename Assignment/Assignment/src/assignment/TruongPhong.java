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
public class TruongPhong extends NhanVien{
    private double trachNhiem;

    public TruongPhong(String maNV, String hoTen, double luong, double trachNhiem) {
        super(maNV, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong() {
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
    
    @Override
    public double getThuNhap() {
        return super.getLuong() + this.trachNhiem; 
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner s = new Scanner(System.in);
        System.out.print("Lương trách nhiệm: ");
        this.trachNhiem = Double.parseDouble(s.nextLine());
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); 
        System.out.printf("Loại nhân viên: Trưởng phòng - Lương trách nhiệm: "
                + "%.0f - Thu nhập: %.0f \n",this.trachNhiem, this.getThuNhap());
    }
    
}
