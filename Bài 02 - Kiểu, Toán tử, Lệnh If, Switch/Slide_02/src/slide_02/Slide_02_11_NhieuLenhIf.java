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
public class Slide_02_11_NhieuLenhIf {

    public static void main(String[] args) {
        // Cú pháp
        // if (<<điều kiện 1>>){
            // << công việc 1 >>
        // } 
        // else if (<<điều kiện 2>>){
            // << công việc 2 >>
        // } 
        // …
        // else {
            // << công việc N+1 >>
        // }
        // Chương trình sẽ kiểm tra từ điều kiện 1 đến N nếu gặp điều kiện i đầu 
        // tiên có giá trị true thì sẽ thực hiện công việc i, ngược lại sẽ thực 
        // hiện công việc N+1
        
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("a=");
        a = s.nextInt();
        System.out.print("b=");
        b = s.nextInt();
        System.out.print("c=");
        c = s.nextInt();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Vô nghiệm");
        } else if (delta == 0) {
            System.out.println("Nghiệm kép");
        } else {
            System.out.println("2 nghiệm");
        }
    }
}
