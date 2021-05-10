/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_03;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Lab03_Bai04_DanhSachSinhVien {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("n=");
            n = Integer.parseInt(s.nextLine());
            String[] hoTen = new String[n];
            double[] diem = new double[n];
            String[] hocLuc = new String[n];
            for (int i = 0; i < hoTen.length; i++) {
                System.out.println("Sinh viên "+i);
                System.out.print("Họ tên: ");
                hoTen[i] = s.nextLine();
                System.out.print("Diểm: ");
                diem[i] = Double.parseDouble(s.nextLine());
                if(diem[i]<5) hocLuc[i]="Yếu";
                else if(diem[i]<6.5) hocLuc[i]="Trung bình";
                else if(diem[i]<7.5) hocLuc[i]="Khá";
                else if(diem[i]<9) hocLuc[i]="Giỏi";
                else hocLuc[i]="Xuất sắc";
            }
            System.out.println("Danh sách sv");
            for (int i = 0; i < hoTen.length; i++) {
                System.out.println("Sinh viên thứ "+i+": ");
                System.out.println("Họ tên: "+hoTen[i]+"\nĐiểm: " + diem[i]+
                        "\nHọc lực: "+hocLuc[i]);
            }
            for (int i = 0; i < hoTen.length-1; i++) {
                for (int j = i+1; j < hoTen.length; j++) {
                    if (diem[i]< diem[j]) {
                        double tempDiem = diem[i];
                        diem[i] = diem[j];
                        diem[j] = tempDiem;
                        
                        String tempTen = hoTen[i];
                        hoTen[i] = hoTen[j];
                        hoTen[j] = tempTen;
                        
                        String tempHocLuc = hocLuc[i];
                        hocLuc[i] = hocLuc[j];
                        hocLuc[j] = tempHocLuc;
                    }
                }
            }
            System.out.println("Danh sách sv sau khi sort: ");
            for (int i = 0; i < hoTen.length; i++) {
                System.out.println("Sinh viên thứ "+i+": ");
                System.out.println("Họ tên: "+hoTen[i]+"\nĐiểm: " + diem[i]+
                        "\nHọc lực: "+hocLuc[i]);
            }
        } 
        catch (Exception e) {
            System.out.println("Không hợp lệ");
        } 
    }
}
