/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class DanhSachSinhVien {
    private String hoTen;
    private ArrayList<String> list;
    Scanner s = new Scanner(System.in);
    
    public void menu(){
        System.out.println(">> DANH SÁCH SINH VIÊN <<");
        System.out.println("+------------------------------------------------+");
        System.out.println("| 1. Nhập danh sách họ và tên                    |");
        System.out.println("| 2. Xuất danh sách vừa nhập                     |");
        System.out.println("| 3. Xuất danh sách ngẫu nhiên                   |");
        System.out.println("| 4. Sắp xếp giảm dần và xuất danh sách          |");
        System.out.println("| 5. Tìm và xóa họ tên nhập từ bàn phím          |");
        System.out.println("| 6. Kết thúc                                    |");
        System.out.println("+------------------------------------------------+");
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
                ngauNhien();
                break;
            case 4:
                sapXep();
                break;
            case 5:
                xoa();
                break;
            case 6:
                System.exit(0);
                break;
        }
    }
    
    public void nhap(){
        list = new ArrayList<>();
        while (true) {
                System.out.print("Họ tên: ");
                this.hoTen = s.nextLine();
                list.add(this.hoTen);
                System.out.print("Nhập thêm (Y/N)? ");
                if (s.nextLine().equalsIgnoreCase("N")) {
                    break;
                }
        }
    }
    
    public void xuat(){
        for (String ten : list) {
            System.out.println("Họ tên "+list.indexOf(ten)+": "+ten);
        }
    }
    
    public void ngauNhien(){
        Collections.shuffle(list);
        this.xuat();
    }
    
    public void sapXep(){
        Collections.sort(list);
        Collections.reverse(list);
        this.xuat();
    }
    
    public void xoa(){
        System.out.println("Nhập tên muốn xóa: ");
        String name = s.nextLine();
        int i=0;
        for (String x : list) {
            if(name.equals(x)){
                list.remove(x);
                i=1;
                break;
            }
        }
        if(i==0){
            System.out.println("Không tìm thấy tên cần xóa");
        }
    }
}
