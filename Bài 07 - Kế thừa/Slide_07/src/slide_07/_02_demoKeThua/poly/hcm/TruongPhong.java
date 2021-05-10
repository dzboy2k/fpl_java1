/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_07._02_demoKeThua.poly.hcm;

import slide_07._02_demoKeThua.poly.ho.NhanVien;

/**
 *
 * @author dzboy
 */
public class TruongPhong extends NhanVien{
    public double trachNhiem;

    public TruongPhong(double trachNhiem, String hoTen, double luong) {
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }
    
    public void xuat(){
        // Mã ở đây có thể sử dụng những tài sản nào của lớp cha
        String hoTen1 = super.hoTen;
        double luong1 = super.luong;
        
    }
}
