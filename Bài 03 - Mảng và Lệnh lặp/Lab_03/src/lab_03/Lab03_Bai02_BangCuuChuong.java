/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_03;

/**
 *
 * @author dzboy
 */
public class Lab03_Bai02_BangCuuChuong {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t\t");
            }
            System.out.println("");
        }
    }
}
