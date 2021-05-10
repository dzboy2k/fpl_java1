/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_03;

/**
 *
 * @author dzboy
 */
public class Slide_03_05_For {
    public static void main(String[] args) {
        // for (khởi đầu ; điều kiện; bước nhảy){
        //      công việc
        // }
        // B1: Thực hiện <<khởi đầu>>
        // B2: Kiểm tra <<điều kiện>>
        //      True: B3
        //      False: kết thúc
        // B3: Thực hiện << công việc >>
        // B4: Thực hiện <<bước nhảy>>
        // B5: Trở lại B2
        
        // Xuất bảng cửu chương
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t\t");
            }
            System.out.println("");
        }
    }
}
