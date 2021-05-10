/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_04;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class SinhVienDemo {
    public String hoTen;
    public double diemTB;

    public SinhVienDemo() {
    }

    public SinhVienDemo(String hoTen, double diemTB) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
     
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" >> Họ tên: ");
        this.hoTen = scanner.nextLine();
        
        System.out.print(" >> Điểm: ");
        this.diemTB = scanner.nextDouble();
    }
    
    public void xuat(){
        System.out.println(this.hoTen +" - "+this.diemTB+" - "+this.xepLoai());
    }
    
    public String xepLoai(){
        if(this.diemTB<5) return "Yếu";
        else if(this.diemTB<6.5) return "Trung bình";
        else if(this.diemTB<7.5) return "Khá";
        else if(this.diemTB<9) return "Giỏi";
        else return "Xuất sắc";
    }
}
