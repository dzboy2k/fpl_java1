/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author dzboy
 */
public class HanhChinh extends NhanVien{

    public HanhChinh(String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
    }
    
    public HanhChinh() {
    }

    @Override
    public double getThuNhap() {
        return super.getLuong();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); 
        System.out.printf("Loại nhân viên: Hành chính - Thu nhập: %.0f\n", this.getThuNhap());
    }
    
}
