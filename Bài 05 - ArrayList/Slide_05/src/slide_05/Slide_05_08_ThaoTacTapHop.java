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
public class Slide_05_08_ThaoTacTapHop {

    public static void main(String[] args) {
        // THAO TÁC TẬP HỢP
        // addAll(Collection) ==> Hợp 2 tập hợp
        // removeAll(Collection) ==> Hiệu 2 tập hợp
        // retainAll(Collection) ==> Giao 2 tập hợp
        // boolean containsAll(Collection) ==> Kiểm tra sự tồn tại
        // toArray(T[]) ==> Chuyển đổi sang mảng

        ArrayList a1 = new ArrayList();
        a1.add(3);
        a1.add(4);
        ArrayList a2 = new ArrayList();
        a2.add(4);
        a2.add(5);
        
        a1.addAll(a2);          // a1=[3,4,4,5]
        a1.retainAll(a2);       // a1=[4] 
        a1.removeAll(a2);       // a1=[3]
        a1.containsAll(a2);     // false   
    }
}
