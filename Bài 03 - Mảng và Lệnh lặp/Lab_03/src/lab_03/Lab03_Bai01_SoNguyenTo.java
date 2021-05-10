/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_03;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Lab03_Bai01_SoNguyenTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("n=");
            n = Integer.parseInt(s.nextLine());
            boolean ok = true;
            for (int i = 2; i < n; i++) {
                if(n%i==0){
                    ok = false;
                    break;
                }
            }
            if(ok==true)
                System.out.println(n+" là số nguyên tố");
            else
                System.out.println(n+" không là số nguyên tố");
        } 
        catch (Exception e) {
        }
    }
    
}
