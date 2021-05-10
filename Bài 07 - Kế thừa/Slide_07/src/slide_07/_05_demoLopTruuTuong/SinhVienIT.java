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
public class SinhVienIT extends SinhVien{
    public double diemJava;
    public double diemCss;
    @Override
    public double getDiemTB() {
        return (2 * diemJava + diemCss)/3;
    } 
}
