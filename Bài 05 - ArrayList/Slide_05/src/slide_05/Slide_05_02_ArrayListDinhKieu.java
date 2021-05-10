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
public class Slide_05_02_ArrayListDinhKieu {
    public static void main(String[] args) {
        // ArrayList (Không định kiểu)
        // ArrayList có thể chứa các phần tử bất kể loại dữ liệu gì:
        //      + Các phần tử trong ArrayList được đối xử như một tập các 
        //      đối tượng (kiểu Object)
        //      + Khi truy xuất các phần tử, cần ép về kiểu gốc của phần tử để 
        //      xử lý
        
        // ArrayList<Type> (Có định kiểu)
        // ArrayList chỉ chứa các phần tử có kiểu đã chỉ định.
        //      + Khi truy xuất các phần tử không cần ép về kiểu gốc của phần tử 
        //      để xử lý
        //      + Chặt chẽ, tránh rũi ro lập trình nhầm dữ liệu
        //      + Hiệu suất xử lý nhanh hơn
        // Chú ý: <Type> là kiểu dữ liệu không phải kiểu nguyên thủy (phải sử 
        // dụng wrapper)
        
        ArrayList<String> a = new ArrayList<String>();
        a.add("Cường");
        a.add("Tuấn");
        a.add("Phương");
        a.add("Hạnh");
        
        // Khi truy xuất các phần tử không cần ép về kiểu gốc của phần tử để xử lý
        String s = a.get(2);
    }
}
