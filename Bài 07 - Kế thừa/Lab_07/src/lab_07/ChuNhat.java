/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_07;

/**
 *
 * @author dzboy
 */
public class ChuNhat {
    private double rong;
    private double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public ChuNhat() {
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getChuVi(){
        return (this.rong+this.dai)*2;
    }
    
    public double getDienTich(){
        return this.rong*this.dai;
    }
    
    public void xuat(){
        System.out.println("Chiều rộng: "+this.rong+" - Chiều dài: "+this.dai+
                " - Diện tích: "+this.getDienTich()+" - Chu vi: "+this.getChuVi());
    }
}
