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
public class TiepThi extends NhanVien{
    private double doanhSo;
    private double hoaHong;

    public TiepThi(String maNV, String hoTen, double luong, double doanhSo, double hoaHong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public TiepThi() {
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    @Override
    public double getThuNhap() {
        return super.getLuong()+(this.hoaHong/100)*this.doanhSo;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); 
        Scanner s = new Scanner(System.in);
        System.out.print("Hoa hồng(%): ");
        this.hoaHong = Double.parseDouble(s.nextLine());
        System.out.print("Doanh số: ");
        this.doanhSo = Double.parseDouble(s.nextLine());
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); 
        System.out.printf("Loại nhân viên: Tiếp thị - Hoa hồng: %.2f - Doanh "
                + "số: %.0f - Thu nhập: %.0f \n",this.hoaHong, this.doanhSo, this.getThuNhap());
    }
    
}
