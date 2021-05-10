package lab_05;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dzboy
 */
public class Lab05_Bai02_HoTen {
    public static void main(String[] args) {
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        try {
            while (true) {                
                dssv.menu();
            }
        } catch (Exception e) {
        }
    }
}
