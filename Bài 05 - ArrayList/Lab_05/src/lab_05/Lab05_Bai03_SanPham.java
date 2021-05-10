/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_05;

/**
 *
 * @author dzboy
 */
public class Lab05_Bai03_SanPham {
    public static void main(String[] args) {
        DanhSachSanPham dssp = new DanhSachSanPham();
        try {
            while (true) {                
                dssp.menu();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
