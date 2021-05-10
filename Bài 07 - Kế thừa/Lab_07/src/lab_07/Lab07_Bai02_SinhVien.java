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
public class Lab07_Bai02_SinhVien {
    public static void main(String[] args) {
        try {
            DanhSachSinhVienPoly dssv = new DanhSachSinhVienPoly();
            while (true) {                
                dssv.menu();
            }
        } 
        catch (Exception e) {
        }
    }
}
