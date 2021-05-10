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
public class Slide_03_02_Demo_While {
    public static void main(String[] args) {
        // Xuất bảng cửu chương 7
        int i =1;
        while (i<=10) {            
            System.out.println("7*"+i+"="+(7*i));
            i++;
        }
        System.out.println("+--------------+");
        
        // Tính trung bình cộng các số chia hết cho 3 từ 27 đến 250
        int tong =0, j=27, dem=0;
        while (j<=250) {            
            if(j%3==0){
                tong+=j;
                dem++;
            }
            j++;
        }
        System.out.println("Trung bình cộng các số chia hết cho 3 từ 27 đến 250: "
                +(tong/dem));
    }
}
