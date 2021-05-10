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
public class Vuong extends ChuNhat{
    private double canh;

    public Vuong(double canh) {  
        super(canh, canh);
        this.canh=canh;
    }

    public Vuong() {
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public void xuat() {
        System.out.println("Cạnh: "+this.canh+" - Diện tích: "+super.getDienTich()
                +" - Chu vi: "+super.getChuVi());
    }
    
}
