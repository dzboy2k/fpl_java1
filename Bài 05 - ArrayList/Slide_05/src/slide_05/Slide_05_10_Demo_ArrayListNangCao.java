/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Slide_05_10_Demo_ArrayListNangCao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Nhập danh sách 5 câu hỏi:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Câu hỏi "+i+": ");
            list.add(s.nextLine());
        }
        System.out.println("");
        // Tráo câu hỏi
        Collections.shuffle(list);
        for (String x : list) {
            System.out.println("Câu hỏi "+list.indexOf(x)+": "+x);
        }
    }
}
