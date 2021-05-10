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
public class Slide_02_09_LenhIF_Else {

    public static void main(String[] args) {
        // Cú pháp
        // if (<<điều kiện>>) 
        // {
            // << công việc 1 >>
        // }
        // else
        // {
            // << công việc 2 >>
        // }
        // Nếu điều kiện có giá trị true thì công việc 1 được thực hiện, ngược lại 
        // công việc 2 được thực hiện
        
        double diem = 4;
        if (diem < 5) {
            System.out.println("Rớt");
        } else {
            System.out.println("Đậu");
        }
        // Đoạn mã trên xuất chữ “Rớt” ra màn hình vì điều kiện diem < 5 có giá 
        // trị là true.
    }
}
