/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class DanhSachSVPoly {
    private ArrayList<SVPoly> listSV = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    
    public void menu(){
        System.out.println(">> QUẢN LÝ SINH VIÊN <<");
        System.out.println("+------------------------------------------------+");
        System.out.println("| 1. Nhập danh sách sinh viên                    |");
        System.out.println("| 2. Xuất danh sách sinh viên đã nhập            |");
        System.out.println("| 3. Xuất danh sách sinh viên theo khoảng điểm   |");
        System.out.println("| 4. Tìm sinh viên theo họ tên                   |");
        System.out.println("| 5. Tìm và sửa sinh viên theo họ tên            |");
        System.out.println("| 6. Tìm và xóa theo họ tên                      |");
        System.out.println("| 7. Kết thúc                                    |");
        System.out.println("| 8. Sắp xếp theo điểm                           |");
        System.out.println("| 9. Sắp xếp theo họ và tên                      |");
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
                xuatTheoDiem();
                break;
            case 4:
                timTheoTen();
                break;
            case 5:
                suaTheoTen();
                break;
            case 6:
                xoaTheoTen();
                break;
            case 7:
                System.exit(0);
                break;
            case 8:
                sapXepTheoDiem();
                break;
            case 9:
                sapXepTheoHoTen();
                break;
            default:
                System.out.println("Vui lòng chọn lại");
        }
    }

    public void nhap() {
        System.out.print("Nhập số sinh viên: ");
        int n = Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ "+i);
            SVPoly sv = new SVPoly();
            sv.nhap();
            listSV.add(sv);
        }
    }
    
    public void xuat(){
        for (int i = 0; i < listSV.size(); i++) {
            System.out.println("Sinh viên "+i);
            listSV.get(i).xuat();
        }
    }
    
    public void xuatTheoDiem(){
        double diemMax, diemMin;
        System.out.println("Điểm thấp nhất: ");
        diemMin = Double.parseDouble(s.nextLine());
        System.out.println("Điểm cao nhất: ");
        diemMax = Double.parseDouble(s.nextLine());
        System.out.println("Các sinh viên có điểm từ "+diemMin+" đến "
                +diemMax+" là: ");
        for (SVPoly x : listSV) {
            if(diemMin<=x.getDiemTB() && diemMax>=x.getDiemTB()){
                System.out.println("Sinh viên "+listSV.indexOf(x));
                x.xuat();
            }
        }
    }
    
    public void timTheoTen(){
        System.out.println("Tên sinh viên: ");
        String ten = s.nextLine();
        int i = 0;
        for (SVPoly x : listSV) {
            if(ten.equals(x.getHoTen())){
                System.out.println("Sinh viên "+listSV.indexOf(x));
                x.xuat();
                i = 1;
            }
        }
        if(i==0){
            System.out.println("Không tìm thấy tên");
        }
    }
    
    public void suaTheoTen(){
        System.out.println("Tên sinh viên: ");
        String ten = s.nextLine();
        int i = 0;
        for (SVPoly x : listSV) {
            if(ten.equals(x.getHoTen())){
                System.out.print("Nhập tên mới: ");
                x.setHoTen(s.nextLine());
                System.out.println("Nhập điểm mới: ");
                x.setDiemTB(Double.parseDouble(s.nextLine()));
                i = 1;
            }
        }
        if(i==0){
            System.out.println("Không tìm thấy tên");
        }
    }
    
    public void xoaTheoTen(){
        System.out.println("Tên sinh viên: ");
        String ten = s.nextLine();
        int i = 0;
        for (SVPoly x : listSV) {
            if(ten.equals(x.getHoTen())){
                listSV.remove(x);
                System.out.println("Xóa thành công");
                i = 1;
                break;
            }
        }
        if(i==0){
            System.out.println("Không tìm thấy tên");
        }
    }
    
    public void sapXepTheoDiem(){
        Comparator<SVPoly> comp = new Comparator<SVPoly>() {
            @Override
            public int compare(SVPoly o1, SVPoly o2) {
                return o1.getDiemTB().compareTo(o2.getDiemTB());
            }
        };
        Collections.sort(listSV, comp);
    }
    
    public void sapXepTheoHoTen(){
        Comparator<SVPoly> comp = new Comparator<SVPoly>() {
            @Override
            public int compare(SVPoly o1, SVPoly o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        };
        Collections.sort(listSV, comp);
    }
}
