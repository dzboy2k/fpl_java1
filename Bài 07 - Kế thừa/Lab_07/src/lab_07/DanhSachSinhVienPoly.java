/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class DanhSachSinhVienPoly {
    private ArrayList<SinhVienPoly> listSV = new ArrayList<SinhVienPoly>();
    private Scanner s = new Scanner(System.in);
    
    public void menu(){
        System.out.println("            >> QUẢN LÝ SINH VIÊN <<");
        System.out.println("+-----------------------------------------------+");
        System.out.println("| 1. Nhập danh sách sinh viên                   |");
        System.out.println("| 2. Xuất thông tin danh sách sinh viên         |");
        System.out.println("| 3. Xuất danh sách sinh viên có học lực giỏi   |");
        System.out.println("| 4. Sắp xếp danh sách sinh viên theo điểm      |");
        System.out.println("| 5. Kết thúc                                   |");
        System.out.println("+-----------------------------------------------+");
        System.out.println(" >> Chọn chức năng? ");
        int chon=Integer.parseInt(s.nextLine());
        switch(chon){
            case 1:
                Nhap();
                break;
            case 2:
                Xuat();
                break;
            case 3:
                SVGioi();
                break;
            case 4:
                SapXep();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }

    public void Nhap() { 
        String hoTen;
        double diemJava, diemHtml, diemCss;
        double diemMarketing, diemSales;
        while (true) {            
            System.out.println(">>    Chọn ngành học:   <<");
            System.out.println("+------------------------+");
            System.out.println("| 1. Công nghệ thông tin |");
            System.out.println("| 2. Marketing           |");
            System.out.println("+------------------------+");
            System.out.print(">> Mời bạn chọn: ");
            int chon = Integer.parseInt(s.nextLine());
            while (chon<1||chon>2) {                
                System.out.println("Bạn đã chọn không đúng, mời bạn chọn lại: ");
                chon = Integer.parseInt(s.nextLine());
            }
            switch(chon){
                case 1:
                    System.out.print("Họ tên: ");
                    hoTen = s.nextLine();
                    System.out.print("Điểm Java: ");
                    diemJava = Double.parseDouble(s.nextLine());
                    System.out.print("Điểm Html: ");
                    diemHtml = Double.parseDouble(s.nextLine());
                    System.out.print("Điểm Css: ");
                    diemCss = Double.parseDouble(s.nextLine());
                    listSV.add(new SinhVienIT(hoTen, diemJava, diemCss, diemHtml));
                    break;
                case 2:
                    System.out.print("Họ tên: ");
                    hoTen = s.nextLine();
                    System.out.print("Điểm Marketing: ");
                    diemMarketing = Double.parseDouble(s.nextLine());
                    System.out.print("Điểm Sales: ");
                    diemSales = Double.parseDouble(s.nextLine());
                    listSV.add(new SinhVienBiz(hoTen, diemMarketing, diemSales));
                    break;
            }
            System.out.print("Nhập tiếp không ? (Y/N) ");
            if(s.nextLine().equalsIgnoreCase("N")) break;
        }
    }
    
    public void Xuat(){
        System.out.println("Danh sách sinh viên: ");
        for (SinhVienPoly sv : listSV) {
            System.out.println("Sinh viên "+listSV.indexOf(sv));
            sv.xuat();
        }
    }
    
    public void SVGioi(){
        System.out.println("Danh sách sinh viên có học lực giỏi: ");
        for (SinhVienPoly sv : listSV) {
            if(sv.getHocLuc().equals("Giỏi"))
            {
                System.out.println("Sinh viên "+listSV.indexOf(sv));
                sv.xuat();
            }
        }
    }
    
    public void SapXep(){
        Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                if(o1.getDiem()>o2.getDiem()) return 1;
                else if(o1.getDiem()<o2.getDiem()) return -1;
                return 0;
            }
        };
        Collections.sort(listSV, comp);
        System.out.println("Sắp xếp sinh viên theo điểm: ");
        for (SinhVienPoly sv : listSV) {
            System.out.println("Sinh viên "+listSV.indexOf(sv));
            sv.xuat(); 
        }
    }
}
