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
public class LaoCong extends NhanVien{
    private double soGioLamViec;

    @Override
    public double getThuNhap() {
        return super.getLuong()*this.soGioLamViec; //To change body of generated methods, choose Tools | Templates.
    }
    
}
