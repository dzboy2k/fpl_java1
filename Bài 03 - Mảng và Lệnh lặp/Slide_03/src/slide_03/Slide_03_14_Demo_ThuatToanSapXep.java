/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_03;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Slide_03_14_Demo_ThuatToanSapXep {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("n=");
            n = Integer.parseInt(s.nextLine());
            String[] hoTen = new String[n];
            double[] diem = new double[n];
            for (int i = 0; i < hoTen.length; i++) {
                System.out.println("Sinh viên "+i);
                System.out.print("Họ tên: ");
                hoTen[i] = s.nextLine();
                System.out.print("Diểm: ");
                diem[i] = Double.parseDouble(s.nextLine());
            }
            System.out.println("Danh sách sv");
            for (int i = 0; i < hoTen.length; i++) {
                System.out.print("Sinh viên "+i+": ");
                System.out.println("Họ tên: "+hoTen[i]+"-Điểm: " + diem[i]);
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
                    }
                }
            }
            System.out.println("Danh sách sv sau khi sort: ");
            for (int i = 0; i < hoTen.length; i++) {
                System.out.print("Sinh viên "+i+": ");
                System.out.println("Họ tên: "+hoTen[i]+"-Điểm: " + diem[i]);
            }
        } 
        catch (Exception e) {
            System.out.println("Không hợp lệ");
        } 
    }
}
