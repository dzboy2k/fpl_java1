/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Lab05_Bai01_SoThuc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Nhập số thực: ");
                double x = Double.parseDouble(scanner.nextLine());
                list.add(x);
                System.out.print("Nhập thêm (Y/N)? ");
                if (scanner.nextLine().equalsIgnoreCase("N")) {
                    break;
                }
            }
            double tong=0;
            System.out.println("Danh sách số thực: ");
            for (Double x : list) {
                System.out.print(x+"\t");
                tong+=x;
            }
            System.out.println("\nTổng số thực = "+tong);
        } catch (Exception e) {
        }
    }

}
