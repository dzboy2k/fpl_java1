/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_08;

/**
 *
 * @author dzboy
 */
public class Slide_08_02_ThamSoPhuongThuc {
    public static void main(String[] args) {
        // THAM SỐ PHƢƠNG THỨC
        // Khi truyền tham số vào một phương thức, nếu phương thức có làm thay 
        // đổi giá trị của tham số thì giá trị của tham số sau khi gọi phương 
        // thức có bị thay đổi hay không?
        
        // PHÂN LOẠI THAM SỐ
        //                   Tham số
        //   Tham biến                        Tham trị
        //     Mảng                      Các kiểu nguyên thủy
        //     Class
        //   Interface
        
        // TRUYỀN THAM SỐ CHO PHƢƠNG THỨC
        // Khi phương thức làm thay đổi giá trị của tham số thì
        //      Nếu là tham trị: giá trị của tham số sẽ không bị thay đổi
        //      Nếu là tham biến: giá trị của tham số sẽ bị thay đổi theo
        
        //          void m(int x){
        // x=3 ==>      x+=5;      ==>  x=3
        //          }
        
        //              void m(int[] x){  
        // X[0]=3 ==>       x[0]+=5;        ==> X[0]=8
        //              }
    }
}
