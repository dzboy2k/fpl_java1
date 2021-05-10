/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_07._04_demoOveride;

/**
 *
 * @author dzboy
 */
public class TruongPhong extends NhanVien{
    private double trachNhiem;

    @Override
    public double getThuNhap() {
        return this.trachNhiem*super.getLuong(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
