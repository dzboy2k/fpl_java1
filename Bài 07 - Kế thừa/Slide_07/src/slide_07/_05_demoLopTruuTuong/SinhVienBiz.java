/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_07._05_demoLopTruuTuong;

/**
 *
 * @author dzboy
 */
public class SinhVienBiz extends SinhVien{
    public double keToan;
    public double marketting;
    public double banHang;
    @Override
    public double getDiemTB() {
        return (keToan + marketting + banHang)/3;
    }
}
