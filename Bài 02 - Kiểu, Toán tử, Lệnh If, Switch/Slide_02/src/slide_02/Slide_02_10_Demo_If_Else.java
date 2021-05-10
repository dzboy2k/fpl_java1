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
public class Slide_02_10_Demo_If_Else {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("a = ");
        try {
            a = Integer.parseInt(s.nextLine());
            if(a>0){
                System.out.println("Căn bậc 2 = "+Math.sqrt(a));
            }
            else {
                System.out.println(a + " không là số dương");
            }
        } catch (Exception e) {
            System.out.println("Bạn không nhập số");
        }
    }
}
