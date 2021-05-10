/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class DanhSachSanPham {
    private ArrayList<SanPham> list = new ArrayList<>();;
    Scanner s = new Scanner(System.in);
    
    public void menu(){
        System.out.println(">> DANH SÁCH SẢN PHẨM <<");
        System.out.println("+---------------------------------------------------+");
        System.out.println("| 1. Nhập danh sách sản phẩm từ bàn phím            |");
        System.out.println("| 2. Xuất danh sách sản phẩm từ bàn phím            |");
        System.out.println("| 3. Sắp xếp giảm dần theo giá và xuất ra màn hình  |");
        System.out.println("| 4. Tìm và xóa sản phẩm theo tên nhập từ bàn phím  |");
        System.out.println("| 5. Xuất giá trung bình của các sản phẩm           |");
        System.out.println("| 6. Kết thúc                                       |");
        System.out.println("+---------------------------------------------------+");
        System.out.println(" >> Chọn chức năng? ");
        
        int chon = Integer.parseInt(s.nextLine());
        switch(chon){
            case 1:
                nhap();
                break;
            case 2:
                xuat();
                break;
            case 3:
                sapXep();
                break;
            case 4:
                xoa();
                break;
            case 5:
                giaTB();
                break;
            case 6:
                System.exit(0);
                break;
        }
    }
    
    public void nhap(){
        while (true) {
                SanPham sp = new SanPham();
                sp.nhap();
                list.add(sp);
                System.out.print("Nhập thêm (Y/N)? ");
                if (s.nextLine().equalsIgnoreCase("N")) {
                    break;
                }
        }
    }
    
    public void xuat(){
        for (SanPham sp : list) {
            System.out.println("Sản phẩm "+list.indexOf(sp));
            sp.xuat();
        }
    }
    
    public void sapXep(){
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) { 
                if(o1.getGia() == o2.getGia()) return o1.getTen().compareTo(o2.getTen());
                else if(o1.getGia() < o2.getGia()) return 1;
                else return -1;
            }
        };
        Collections.sort(list, comp);
        this.xuat();
    }

    public void xoa() {
        System.out.println("Tên sản phẩm:");
        String ten = s.nextLine();
        int i = 0;
        for (SanPham x : list) {
            if(ten.equals(x.getTen())){
                list.remove(x);
                System.out.println("Xóa thành công ");
                i = 1;
                break;
            }
        }
        if(i==0){
            System.out.println("Không tìm thấy sản phẩm");
        }
    }
    
    public void giaTB(){
        double tong=0, i=0;
        for (SanPham x : list) {
            tong+=x.getGia();
            i++;
        }
        System.out.printf("Giá trung bình các sản phẩm: %.2f\n", tong/i);
    }
    
}
