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
public class Slide_08_04_ThamSoBienDoi {
    public static void main(String[] args) {
        // THAM SỐ BIẾN ĐỔI (VARARGS)
        // Tham số biến đổi là tham số khi truyền vào phương thức với số lượng 
        // tùy ý (phải cùng kiểu).
        //      void m(int…x){…}
        // Gọi phương thức:
        //      m(2,6,8)
        //      m(2)
        //      int[] x = {2,6,8}
        //      m(x)
        
        // TRUYỀN THAM BIẾN ĐỔI (VARARGS)
        // Bản chất của tham số biến đổi là mảng nhưng khi truyền tham số bạn có 
        // thể truyền vào nguyên mảng hoặc liệt kê các phần tử
        // Trong một hàm, chỉ có thể khai báo duy nhất một tham số kiểu varargs 
        // và phải là tham số cuối cùng
        
        // int sum(int…x){
        //        int s = 0;
        //        for(int a : x){
        //            s += a;
        //        }
        //        return s;
        // }
        
        // int s1 = sum(2,7)
        // int s2 = sum(3,8,3,7,4)
    }
}
