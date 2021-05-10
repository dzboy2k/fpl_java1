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
public class SinhVienIT extends SinhVienPoly{
    private double diemJava;
    private double diemCss;
    private double diemHtml;

    public SinhVienIT(String hoTen, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, "Công nghệ thông tin");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public SinhVienIT() {
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }
    
    @Override
    public double getDiem() {
        return (2*this.diemJava + this.diemHtml + this.diemCss)/4;
    }
    
}
