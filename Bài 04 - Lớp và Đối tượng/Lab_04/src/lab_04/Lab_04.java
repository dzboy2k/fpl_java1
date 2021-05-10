/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_04;

/**
 *
 * @author dzboy
 */
public class Lab_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            SanPham sp1 = new SanPham();
            sp1.nhap();
            sp1.xuat();
            
            SanPham sp2 = new SanPham();
            sp2.nhap();
            sp2.xuat();
            
            SanPham sp3 = new SanPham("SP3", 50, 8);
            sp3.xuat();
            
            SanPham sp4 = new SanPham("SP4", 40);
            sp4.xuat();
        } catch (Exception e) {
        }
    }
    
}
