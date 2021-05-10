/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_05;

import java.util.ArrayList;

/**
 *
 * @author dzboy
 */
public class Slide_05_04_TracNghiemArrayList {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Cường");
        a.add("Tuấn");
        a.add("Phương");
        a.add("Hồng");
        a.add(1, "Hạnh");
        a.set(0, "Tèo");
        a.remove(3);
        a.remove("Phương");
        int x = a.size() - a.indexOf("Hồng");
        System.out.println(x);
        x = a.size() - a.indexOf("Phương");
        System.out.println(x);
    }
}
