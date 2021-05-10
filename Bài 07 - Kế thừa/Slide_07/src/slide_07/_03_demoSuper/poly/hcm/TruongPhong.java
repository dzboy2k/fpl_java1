/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_07._03_demoSuper.poly.hcm;

import slide_07._03_demoSuper.poly.ho.NhanVien;

/**
 *
 * @author dzboy
 */
public class TruongPhong extends NhanVien{
    public double trachNhiem;
    public TruongPhong (String hoTen, double luong, double trachNhiem){
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }
    public void xuat(){
        super.xuat();
        System.out.println(trachNhiem);
    }
}
