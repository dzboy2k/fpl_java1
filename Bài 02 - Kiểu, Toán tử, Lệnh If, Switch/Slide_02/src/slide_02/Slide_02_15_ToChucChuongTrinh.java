/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_02;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Slide_02_15_ToChucChuongTrinh {
    public static void main(String[] args) {
        // Hiển thị thực đơn chính của chương trình
        thucDon();
    }
    
    public static void thucDon(){
        System.out.println(">> MÁY TÍNH CÁ NHÂN <<");
        System.out.println("+--------------------+");
        System.out.println("| 1. Cộng            |");
        System.out.println("| 2. Trừ             |");
        System.out.println("| 3. Kết thúc        |");
        System.out.println("+--------------------+");
        System.out.println(" >> Chọn chức năng? ");
        
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if(answer == 1){
            thucHienPhepCong(); // Gọi phương thức thực hiện phép cộng
        }
        else if(answer == 2){
            thucHienPhepTru(); // Gọi phương thức thực hiện phép trừ
        }
        else if(answer == 3){
            System.exit(0); // Thoát ứng dụng
        }
    }
    
    public static void thucHienPhepCong(){}
    
    public static void thucHienPhepTru(){}
    
}
