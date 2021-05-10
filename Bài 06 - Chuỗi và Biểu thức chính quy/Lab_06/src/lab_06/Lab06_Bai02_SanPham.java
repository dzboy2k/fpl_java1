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
public class Lab06_Bai02_SanPham {
    public static void main(String[] args) {
        try {
            ArrayList<SanPham> listSP = new ArrayList();
            for (int i = 0; i < 5; i++) {
                System.out.println("Sản phẩm "+i);
                SanPham sp = new SanPham();
                sp.nhap();
                listSP.add(sp);
            }
            
            System.out.println("Danh sách sản phẩm:");
            for (SanPham sp : listSP) {
                System.out.println("Sản phẩm "+listSP.indexOf(sp));
                sp.xuat();
            }
            
            System.out.println("Sản phẩm có hãng là Nokia:");
            for (SanPham sp : listSP) {
                if (sp.getHang().equalsIgnoreCase("Nokia")) {
                    System.out.println("Sản phẩm "+listSP.indexOf(sp));
                    sp.xuat();
                }
            }
        } 
        catch (Exception e) {
            System.out.println("Chương trình lỗi");
        }
    }
}
