/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_02;

/**
 *
 * @author dzboy
 */
public class Slide_02_07_LenhIF {

    public static void main(String[] args) {
        // Cú pháp
        // if(<<điều kiện>>) 
        // {
        //  << Công việc >>
        // }
        // Nếu điều kiện có giá trị true thì công việc được thực hiện
        
        double diem = 4;
        if (diem >= 5) {
            System.out.println("Đậu");
        }
        // Đoạn mã trên không xuất gì ra màn hình cả vì biểu thức điều kiện 
        // diem >= 5 có giá trị false
    }
}
