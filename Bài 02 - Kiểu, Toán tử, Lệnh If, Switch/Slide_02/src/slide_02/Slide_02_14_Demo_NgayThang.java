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
public class Slide_02_14_Demo_NgayThang {
    public static void main(String[] args) {
        int thang,nam;
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Tháng: ");
            thang = Integer.parseInt(s.nextLine());
            System.out.println("Năm: ");
            nam = Integer.parseInt(s.nextLine());
            switch(thang){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("Tháng có 31 ngày");
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("Tháng có 30 ngày");
                    break;
                case 2:
                    if((nam%400==0) || (nam%4==0 && nam%100!=0)){
                        System.out.println("Tháng có 29 ngày");
                    }
                    else{
                        System.out.println("Tháng có 28 ngày");
                    }
            }
        } catch (Exception e) {
            System.out.println("Bạn nhập sai");
        }
    }
}
