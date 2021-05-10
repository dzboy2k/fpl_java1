/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_04;

/**
 *
 * @author dzboy
 */
public class SinhVien {

    private String hoTen;
    private double diem;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    // Chỉ cần thêm mã vào phương thức setDiem() để có những xử lý khi dữ liệu 
    // không hợp lệ
    public void setDiem(double diem) {
        if (diem < 0 || diem > 10) {
            System.out.println("Điểm không họp lệ");
        } else {
            this.diem = diem;
        }
    }
}
