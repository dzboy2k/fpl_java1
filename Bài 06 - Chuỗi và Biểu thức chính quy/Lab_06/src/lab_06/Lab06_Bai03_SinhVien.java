/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_06;

import java.util.ArrayList;

/**
 *
 * @author dzboy
 */
public class Lab06_Bai03_SinhVien {
    public static void main(String[] args) {
        ArrayList<SinhVien> listSV = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Sinh viên "+i);
            SinhVien sv = new SinhVien();
            sv.nhap();
            listSV.add(sv);
        }
        System.out.println("Danh sách sinh viên");
        for (SinhVien sv : listSV) {
            System.out.println("Sinh viên "+listSV.indexOf(sv));
            sv.xuat();
        }
    }
}
