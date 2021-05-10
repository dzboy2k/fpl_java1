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
public class Slide_05_05_DuyetArrayList {

    public static void main(String[] args) {
        // Duyệt theo chỉ số với for hoặc sử dụng for-each. Với ArrayList 
        // for-each thường được sử dụng hơn
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(5);
        a.add(9);
        a.add(4);
        a.add(8);

        // for
        for (int i = 0; i < a.size(); i++) {
            Integer x = a.get(i);
            //<<xử lý x>>
            System.out.print(x + "\t");
        }
        System.out.println("");
        
        // for-each
        for (Integer x : a) {
            //<<xử lý x>>
            System.out.print(x + "\t");
        }
        System.out.println("");
    }
}
