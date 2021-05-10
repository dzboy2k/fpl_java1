/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Assignment {
    
    /**
     * @param args the command line arguments
     */
    static ArrayList<NhanVien> listNV = new ArrayList<>();
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            while (true) {                
                menu();
            }
        } 
        catch (Exception e) {
        }
    }
    
    public static void menu(){
        System.out.println("                    >> QUẢN LÝ NHÂN VIÊN <<");
        System.out.println("+=============================================================+");
        System.out.println("| 01. Nhập danh sách nhân viên từ bàn phím.                   |");
        System.out.println("| 02. Xuất danh sách nhân viên ra màn hình.                   |");
        System.out.println("| 03. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.     |");
        System.out.println("| 04. Xóa nhân viên theo mã nhập từ bàn phím.                 |");
        System.out.println("| 05. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím   |");
        System.out.println("| 06. Tìm các nhân viên theo khoảng lương nhập từ bàn phím    |");
        System.out.println("| 07. Sắp xếp nhân viên theo họ và tên.                       |");
        System.out.println("| 08. Sắp xếp nhân viên theo thu nhập.                        |");
        System.out.println("| 09. Xuất 5 nhân viên có thu nhập cao nhất.                  |");
        System.out.println("| 10. Thoát chương trình.                                     |");
        System.out.println("+=============================================================+");
        System.out.println(">> Chọn chức năng? ");
        int chon = Integer.parseInt(s.nextLine());
        switch(chon){
            case 1:
                nhap();
                break;
            case 2:
                xuat();
                break;
            case 3:
                tim();
                break;
            case 4:
                xoa();
                break;
            case 5:
                capNhat();
                break;
            case 6:
                timTheoLuong();
                break;
            case 7:
                sapXepTheoTen();
                break;
            case 8:
                sapXepTheoThuNhap();
                break;
            case 9:
                xuat5NVThuNhapMax();
                break;
            case 10:
                System.exit(0);
                break;
        }
    }

    public static void nhap() {
        String maNV, hoTen;
        double luong;
        double trachNhiem;
        double doanhSo, hoaHong;
        
        while (true) {            
            System.out.println(">> Mời bạn chọn loại nhân viên: <<");
            System.out.println("+--------------------------------+");
            System.out.println("| 1. Trưởng phòng.               |");
            System.out.println("| 2. Nhân viên tiếp thị.         |");
            System.out.println("| 3. Nhân viên hành chính.       |");
            System.out.println("+--------------------------------+");
            System.out.print(">> Chọn nhân viên: ");
            int chon = Integer.parseInt(s.nextLine());
            while (chon<1||chon>3) {                
                System.out.print("Lựa chọn không phù hợp, mời nhập lại: ");
                chon = Integer.parseInt(s.nextLine());
            }
            switch(chon){
                case 1:
                    TruongPhong tp = new TruongPhong();
                    tp.nhapThongTin();
                    listNV.add(tp);
                    break;
                case 2: 
                    TiepThi tt = new TiepThi();
                    tt.nhapThongTin();
                    listNV.add(tt);
                    break;
                case 3: 
                    HanhChinh hc = new HanhChinh();
                    hc.nhapThongTin();
                    listNV.add(hc);
                    break;
            }
            System.out.print("Nhập tiếp không? (Y/N): ");
            if(s.nextLine().equalsIgnoreCase("N")) break;
        }
        
    }

    public static void xuat() {
        System.out.println("Danh sách nhân viên: ");
        for (NhanVien nv : listNV) {
            System.out.println("Nhân viên: "+listNV.indexOf(nv));
            nv.xuatThongTin();
        }
    }

    public static void tim() {
        System.out.println("Mã nhân viên: ");
        String ma = s.nextLine();
        int index = 0;
        for (NhanVien nv : listNV) {
            if(ma.equalsIgnoreCase(nv.getMaNV())){
                System.out.println("Nhân viên "+listNV.indexOf(nv));
                nv.xuatThongTin();
                index = 1;
            }
        }
        if(index==0) System.out.println("Không tìm thấy");
    }

    public static void xoa() {
        System.out.println("Mã nhân viên: ");
        String ma = s.nextLine();
        int index = 0;
        for (NhanVien nv : listNV) {
            if(ma.equalsIgnoreCase(nv.getMaNV())){
                listNV.remove(nv);
                System.out.println("Xóa thành công");
                index = 1;
                break;
            }
        }
        if(index==0) System.out.println("Không tìm thấy");
    }

    public static void capNhat() {
        System.out.println("Mã nhân viên: ");
        String ma = s.nextLine();
        int index = 0;
        for (NhanVien nv : listNV) {
            if(ma.equalsIgnoreCase(nv.getMaNV())){
                nv.nhapThongTin();
                System.out.println("Cập nhật thành công");
                index = 1;
                break;
            }
        }
        if(index==0) System.out.println("Không tìm thấy");
    }

    public static void timTheoLuong() {
        System.out.print("Lương min: ");
        double luongMin = Double.parseDouble(s.nextLine());
        System.out.print("Lương max: ");
        double luongMax = Double.parseDouble(s.nextLine());
        int index = 0;
        for (NhanVien nv : listNV) {
            if(nv.getLuong()<=luongMax && nv.getLuong()>=luongMin){
                System.out.println("Nhân viên "+listNV.indexOf(nv));
                nv.xuatThongTin();
                index=1;
            }
        }
        if(index==0)
            System.out.println("Không phù hợp");
    }

    public static void sapXepTheoTen() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        };
        Collections.sort(listNV, comp);
        xuat();
    }

    public static void sapXepTheoThuNhap() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if(o1.getThuNhap()<o2.getThuNhap()) return 1;
                else if(o1.getThuNhap()>o2.getThuNhap()) return -1;
                return 0;
            }
        };
        Collections.sort(listNV, comp);
        xuat();
    }

    public static void xuat5NVThuNhapMax() {
        sapXepTheoThuNhap();
        System.out.println("5 nhân viên có thu nhập cao nhất: ");
        for (int i = 0; i < listNV.size(); i++) {
            if(i==5) break;
            System.out.println("Nhân viên "+i);
            listNV.get(i).xuatThongTin();
        }
    }
    
}
